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
import glob
from datetime import datetime
from flask import Flask, render_template, session, redirect, url_for, \
	current_app, request, abort
from . import main
from .. import db
from ..helpers.Static import *
import subprocess
import time

app = Flask(__name__, static_url_path='')
app.config['UPLOAD_FOLDER'] = "."
app.config['SECRET_KEY'] = 'F34TF$($e34D'

analyze_objs = {}

def get_session_data():
	if 'filename' in session:
		if session['filename'] in analyze_objs:
			return analyze_objs[session['filename']]
	return None

@main.route('/upload', methods=['GET','POST'])
def upload():
	if request.method == 'POST':
		file = request.files['file']
		filename = file.filename
		filetype = file.filename.split('.', 1)[1]
		file.save(os.path.join(app.config['UPLOAD_FOLDER'], filename))
<<<<<<< HEAD
<<<<<<< HEAD
		#os.system("/home/apkinspector/Desktop/apkinspector/webapp/tools/DroidBox_4.1.1/startemu.sh test1")
		# "SuperAwesomeContacts.apk"
		static_analysis = StaticAnalysis(filename)
		session['filename'] = filename
		analyze_objs[filename] = static_analysis
		result = True
		
		manifestdata = static_analysis.get_manifest()
		permissions = static_analysis.get_permissions()
		Strings = static_analysis.get_strings()
		
		PackageClasses = static_analysis.get_class_method_list()
=======
		static_analysis = StaticAnalysis(filename)
		session['filename'] = filename
		analyze_objs[filename] = static_analysis
		return redirect('/index')
	return render_template("upload.html")
>>>>>>> f158ca4649191212b389bb5c36a86978f8621075
=======
		static_analysis = StaticAnalysis(filename)
		session['filename'] = filename
		analyze_objs[filename] = static_analysis
		return redirect('/index')
	return render_template("upload.html")
>>>>>>> f158ca4649191212b389bb5c36a86978f8621075


@main.route('/', methods=['GET', 'POST'])
@main.route('/index', methods=['GET', 'POST'])
def index():
	session_data = get_session_data()
	if (session_data == None):
		return redirect('/upload')
	result = False
	manifestdata = None
	permissions = None
	Strings = None
	PackageClasses = None
	manifestdata = session_data.get_manifest()
	permissions = session_data.get_permissions()
	Strings = session_data.get_strings()
	PackageClasses = session_data.get_class_method_list()

	return render_template("index.html",
		manifestdata = manifestdata,
		permissions = permissions,
		strings_output = Strings,
		classes_output = PackageClasses,
		dynamic=Strings)


@main.route('/class_source', methods=['GET'])
def class_source():
	session_data = get_session_data()
	if (session_data == None):
		return redirect('/upload')
	data = session_data.get_java_code(request.args["classname"])
	if data == None:
		java_output = "Failed to load java source code"
	else:
		java_output = data

	smali_data = session_data.get_smali_code(request.args["classname"])
	if smali_data == None:
		smali_output = "Failed to show smali code"
	else:
		smali_output = smali_data
	return render_template("class_source.html", java_output=java_output, smali_output = smali_output)


@main.route('/callinout', methods=['GET'])
def callinout():
	data = get_session_data()
	if (data == None):
		return redirect('/upload')
	callMethod = request.args["methodname"]
	calltxt = data.get_call_in_out(callMethod)
	return render_template("callinout.html", calltxt = calltxt)

@main.route('/cfg', methods=['GET'])
def cfg():
	data = get_session_data()
	if (data == None):
		return redirect('/index')
	methodname = request.args["methodname"]
	data.generate_cfg_xdot(methodname)
	return render_template("cfg.html", methodname = methodname)

@main.route('/method2dot.txt', methods=['GET'])
def method2dot():
	print "method2dot +++"
	# return app.send_static_file('method2dot.txt')
	try:
		data = open('method2dot.txt', "r").read()
	except IOError, e:
		print str(e)
		print "IOError"
		data = None
	return data

@main.route('/search', methods=['GET'])
def search():
	data = get_session_data()
	if (data == None):
		return redirect('/index')
	searchStr = request.args['keyword']
	searchResult = data.grep(searchStr)
	return render_template('search.html', searchResult = searchResult, keyword = searchStr)


@main.route('/dynamic', methods=['GET','POST'])
def dynamic():
	data = get_session_data()
	if (data == None):
		return redirect('/index')
	file = request.form['text']
	print 'time'
	print file
	apkfile = r"/home/apkinspector/Desktop/apkinspector/webapp/" + session['filename']
	from datetime import datetime
	i=datetime.now()
	outputfile = "/home/apkinspector/Desktop/apkinspector/webapp/tools/DroidBox_4.1.1/log"+i.strftime("%Y-%m-%d-%H:%M:%S")+".txt"
	cmd = "/home/apkinspector/Desktop/apkinspector/webapp/tools/DroidBox_4.1.1/emubootcheck.sh " +file+" " + apkfile +" " + outputfile
	print cmd
	cmd1 = "/home/apkinspector/Downloads/android-sdk-linux/tools/android create avd -n test_droid -t 1 -d 6 -b default/armeabi-v7a"
	os.system(cmd1)
	os.system(cmd)
	import time
	time.sleep(100)
	subprocess.call(r"/home/apkinspector/Downloads/android-sdk-linux/platform-tools/adb emu kill",shell=True)

	os.system("/home/apkinspector/Downloads/android-sdk-linux/tools/android delete avd -n test_droid")
	#outputfile = "/home/apkinspector/Desktop/apkinspector/webapp/tools/DroidBox_4.1.1/test.txt"

	fo = open(outputfile,"r+")
	str = fo.read();
	finding = str.find('{"apkName"')
	print 'finding'
	print finding
	output = str[finding:]
	print 'output'
	print output
	import json
	json_string = json.loads(output)
	log = json.dumps(json_string,indent=4,sort_keys=True)
	fo.close();
	
	return render_template("test.html", calltxt = log)


@main.route('/logout')
def logout():
	session.clear()
	return redirect(url_for('main.upload'))



@main.route('/about')
def about():
	return render_template("about.html")


@main.route('/contact')
def contact():
	return render_template("contact.html")


def login_user(username, password):

	try:
		# Find and return user
		return False
	except:
		abort(500)
