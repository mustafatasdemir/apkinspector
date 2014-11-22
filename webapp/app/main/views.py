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
from ..helpers.Static import *

app = Flask(__name__, static_url_path='')
app.config['UPLOAD_FOLDER'] = "."
app.config['SECRET_KEY'] = 'F34TF$($e34D'

analyze_objs = {}

def get_session_data():
	if 'filename' in session:
		if session['filename'] in analyze_objs:
			return analyze_objs[session['filename']]
	return None

@main.route('/', methods=['GET', 'POST'])
@main.route('/index', methods=['GET', 'POST'])
def index():
	result = False
	manifestdata = None
	permissions = None
	Strings = None
	PackageClasses = None

	if request.method == 'POST':
		file = request.files['file']
		filename = file.filename
		filetype = file.filename.split('.', 1)[1]
		file.save(os.path.join(app.config['UPLOAD_FOLDER'], filename))
		# "SuperAwesomeContacts.apk"
		static_analysis = StaticAnalysis(filename)
		session['filename'] = filename
		analyze_objs[filename] = static_analysis
		result = True
		manifestdata = static_analysis.get_manifest()
		permissions = static_analysis.get_permissions()
		Strings = static_analysis.get_strings()
		PackageClasses = static_analysis.get_class_method_list()

	return render_template("index.html", result=result,
		manifestdata = manifestdata,
		permissions = permissions,
		strings_output = Strings,
		classes_output = PackageClasses)


@main.route('/class_source', methods=['GET'])
def class_source():
	session_data = get_session_data()
	if (session_data == None):
		return redirect('/index')
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
		return redirect('/index')
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


@main.route('/logout')
def logout():
	session.clear()
	return redirect(url_for('main.index'))



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
