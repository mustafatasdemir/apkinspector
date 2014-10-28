# Licensed under the Apache License, Version 2.0 (the "License"); you may not
# use this file except in compliance with the License. You may obtain a copy of
# the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
# WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
# License for the specific language governing permissions and limitations under
# the License.


# Import Statements
import os
import sys
import pickle
from datetime import datetime
from flask import Flask, render_template, session, redirect, url_for, \
    current_app, request, abort
from . import main
from .. import db
from ..helpers.decompile import Decompile
from ..helpers.APKtool import APKtool

from ..helpers.APKInfo import *
from ..helpers.GetMethods import *
from ..helpers.CallInOut import *
from ..helpers import Global

apktool = None
apk = None
vm = None
vmx = None
cl = None
path2method = {}

app = Flask(__name__)
app.config['UPLOAD_FOLDER'] = "."
app.config['SECRET_KEY'] = 'F34TF$($e34D'


def session_exists():
    if "username" in session:
        return True


@main.route('/', methods=['GET', 'POST'])
@main.route('/index', methods=['GET', 'POST'])
def index():
    result = False
    if request.method == 'POST':
        file = request.files['file']
        filename = file.filename
        filetype = file.filename.split('.', 1)[1]
        file.save(os.path.join(app.config['UPLOAD_FOLDER'], filename))
        # "SuperAwesomeContacts.apk"
        initialize(filename)
        session['filename'] = str(filename)
        result = True
    return render_template("index.html", result=result)


def initialize(filename):
    global apktool
    global cl
    decomp_thread = Decompile(filename)
    decomp_thread.start()
    decomp_thread.join()

    apktool = APKtool()
    cl = CLASS(Global.APK, Global.VM, Global.VMX)
    print "apktool : "
    print apktool


@main.route('/smali', methods=['GET'])
def smali():
    global apktool
    if apktool == None:
        return redirect('/index')

    classname = "/edu/cmu/wnss/funktastic/superawesomecontacts/AboutActivity/"
    [flag, data] = apktool.getSmaliCode(classname)
    if flag == 0:
        smali_output = "Failed to show smali code"
    elif flag == 1:
        smali_output = data
    return render_template("smali.html", smali_output=smali_output)


@main.route('/java', methods=['GET'])
def java():
    if apktool == None:
        return redirect('/index')
	classname = request.args["classname"]
    inputpath = "temp/java/" + \
        "edu/cmu/wnss/funktastic/superawesomecontacts/AboutActivity.java"
    try:
        data = open(inputpath, "r").read()
    except IOError, e:
        print str(e)
        print "IOError"
        data = None

    if data == None:
        java_output = "Failed to load java source code"
    else:
        java_output = data

    return render_template("java.html", java_output=java_output)


@main.route('/manifest', methods=['GET'])
def androidmanifest():
    global apktool
    if apktool == None:
        return redirect('/index')
    manifestdata = apktool.getManifest()
    return render_template("manifest.html", manifestdata=manifestdata)


@main.route('/permissions', methods=['GET'])
def permissions():
    apk = APK(session['filename'])
    permissions = None
    permission_count = None
    (permissions, permission_count) = apk.getPermissions()
    permissions = permissions.split('\n')
    return render_template("permissions.html", permissions=permissions)


@main.route('/trial')
def trial():
    permissions = None
    permission_count = None
    is_valid = None
    file_name = None
    services = None
    receivers = None
    version_code = None
    version_name = None
    package = None
    if apk.isVaildAPK():
        (permissions, permission_count) = apk.getPermissions()
        permissions = permissions.split("\n")
        is_valid = apk.isVaildAPK()
        file_name = apk.getFilename()
        (services, services_count) = apk.getServices()
        services = services.split("\n")
        (receivers, receivers_count) = apk.getReceivers()
        receivers = receivers.split("\n")
        version_code = apk.getVersionCode()
        version_name = apk.getVersionName()
        package = apk.getPackage()
        return render_template("apk.html", permissions=permissions,
                               is_valid=is_valid,
                               file_name=file_name,
                               services=services,
                               receivers=receivers,
                               version_code=version_code,
                               version_name=version_name,
                               package=package)
    else:
        abort(500)


@main.route('/classes', methods=['GET', 'POST'])
def classes():
    global apktool
    if apktool == None:
        return redirect('/index')
    if request.method == 'POST':
        studio = (request.form["class"])
        session['Class'] = studio[1:]
        print 'Chosen Class'
        print studio[1:]
        result = True
        return render_template("index.html", result=result)
    Classes = None
    # get the package name and filter classes only with that package name
    apk = APK(session['filename'])
    package = apk.getPackage()
    countSlash = package.count('.', 0, len(package))
    pattern = package.replace('.', '/', countSlash)
    methodget = GetDVM(session['filename'])
    Classes = methodget.get_DALVIK_VM().get_classes_names()
    PackageClasses = []
    for i in Classes:
        if i[1:].startswith(pattern):
            PackageClasses.append(i)

    # print PackageClasses
    return render_template("classes.html", classes_output=PackageClasses)

@main.route('/methods', methods=['GET'])
def methods():
	global cl
	if cl == None:
		return redirect('/index')
	classname = request.args["classname"]
	methods = cl.get_methods_class(classname)
	methods_output = []
	for m in methods:
		methods_output.append(m.get_class_name() + "->" + m.get_name()+ m.get_descriptor())
	return render_template("methods.html", methods_output = methods_output)



@main.route('/strings', methods=['GET'])
def strings():
    global apktool
    if apktool == None:
        return redirect('/index')
    Strings = None
    methodget = GetDVM(session['filename'])
    Strings = methodget.get_DALVIK_VM().get_strings()
    return render_template("strings.html", strings_output=Strings)


@main.route('/callinout', methods=['GET'])
def callinout():
	global cl
	methodInvokeList = cl.get_methodInvoke()
	callInOut = CallInOut(methodInvokeList)

    # if method.get_code() == None:
    #     self.Graph_call.scene.clear()
    #     return
    # allmethod = self.CL.vm.get_methods()
    # xdotc = XDot(method, Global.VM, Global.VMX)

    # xdotc.call2xdot(methodInvokeList, allmethod)
    # [pagesize, nodeList, linkList] = xdotc.parsecall()


    # print nodeList
    # print linkList

    # self.Graph_call.setPageSize(pagesize)
    # self.Graph_call.showcall(nodeList, linkList)

	callInContent = "************************Call In*************************\n"
	callOutContent = "***********************Call Out************************\n"
    # className = method.get_class_name()
    # methodName = method.get_name()
    # descriptor = method.get_descriptor()
    # callMethod = className + " " + descriptor + "," + methodName
	callMethod = request.args["methodname"]
	# callMethod = "Ledu/cmu/wnss/funktastic/superawesomecontacts/AboutActivity;->onCreate(Landroid/os/Bundle;)V"
	callInList = callInOut.searchCallIn(callMethod)
	callOutList = callInOut.searchCallOut(callMethod)

	for i in callInList:
		temp = i.split("^")
		callInContent += temp[0] + "  (" + temp[1] + ")" + "\n"

	for i in callOutList:
		temp = i.split("^")
		callOutContent += temp[0] + "  (" + temp[1] + ")" + "\n"

	calltxt = callInContent + "\n\n\n" + callOutContent
	return render_template("callinout.html", calltxt = calltxt)


@main.route('/apk')
def apk():
    return render_template("deneme.html")


@main.route('/logout')
def logout():
    session.clear()
    return redirect(url_for('main.index'))


def login_user(username, password):

    try:
        # Find and return user
        return False
    except:
        abort(500)
