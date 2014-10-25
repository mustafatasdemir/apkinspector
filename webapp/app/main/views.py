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
from datetime import datetime
from flask import Flask, render_template, session, redirect, url_for, \
current_app, request, abort
from . import main
from .. import db
from ..helpers.decompile import Decompile
from ..helpers.APKtool import APKtool
from ..helpers.APKInfo import *

apktool = None
apk = None
vm = None
vmx = None

app = Flask(__name__)
app.config['UPLOAD_FOLDER'] = "."


def session_exists():
	if "username" in session:
		return True

@main.route('/', methods = ['GET', 'POST'])
@main.route('/index', methods = ['GET', 'POST'])
def index():
	result = False
	if request.method == 'POST':
		file = request.files['file']
		filename = file.filename
		file.save(os.path.join(app.config['UPLOAD_FOLDER'], filename))
		# "SuperAwesomeContacts.apk"
		initialize(filename);
		session['filename'] = str(filename)
		result = True
	return render_template("index.html", result = result)

def initialize(filename):
	global apktool, apk, vm, vmx
	decomp_thread = Decompile(filename)
	decomp_thread.start()
	decomp_thread.join()
	apk = APK(filename)
	vm = DalvikVMFormat(apk.getDex())
	print len(vm.get_classes_names())
	vmx = analysis.VMAnalysis(vm)
	apktool = APKtool()
	print "apktool : "
	print apktool


@main.route('/classes', methods = ['GET'])
def classes():
	global vm
	return render_template("classes.html", classes = vm.get_classes_names())


@main.route('/smali', methods = ['GET'])
def smali():
	global apktool	
	if apktool == None:
		return redirect('/index')

	classname ="/edu/cmu/wnss/funktastic/superawesomecontacts/AboutActivity/"
	[flag, data] = apktool.getSmaliCode(classname)
        if flag == 0:
            smali_output = "Failed to show smali code"
        elif flag == 1:
            smali_output = data
	return render_template("smali.html", smali_output = smali_output)

@main.route('/java', methods = ['GET'])
def java():
	if apktool == None:
		return redirect('/index')

	inputpath = "temp/java/" + "edu/cmu/wnss/funktastic/superawesomecontacts/AboutActivity.java"
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

	return render_template("java.html", java_output = java_output)

@main.route('/manifest', methods = ['GET'])
def androidmanifest():
	global apktool	
	if apktool == None:
		return redirect('/index')
	manifestdata = apktool.getManifest()
	return render_template("manifest.html", manifestdata = manifestdata)

@main.route('/permissions', methods = ['GET'])
def permissions():
	apk = APK(session['filename'])
	permissions = None
	permission_count = None
	(permissions, permission_count) = apk.getPermissions()	
	permissions = permissions.split('\n')
	return render_template("permissions.html", permissions = permissions)

@main.route('/manifest', methods = ['GET'])
def manifest():
	#apk = APK(session['filename'])
	manifest = apktool.getManifest()
	#manifest_count = None
	#(manifest_count, manifest) = apk.getPermissions()	
	return render_template("manifest.html", manifestdata = manifest)


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
		return render_template("apk.html", permissions = permissions,
			is_valid = is_valid,
			file_name = file_name,
			services = services,
			receivers = receivers,
			version_code = version_code,
			version_name = version_name,
			package = package)
	else:
		abort(500)

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