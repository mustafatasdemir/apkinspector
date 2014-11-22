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

app = Flask(__name__)
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
		static_analysis = StaticAnalysis(filename)
		session['filename'] = filename
		analyze_objs[filename] = static_analysis
		return redirect('/index')
	return render_template("upload.html")


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
		classes_output = PackageClasses)


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


@main.route('/logout')
def logout():
	session.clear()
	return redirect(url_for('main.upload'))


def login_user(username, password):

	try:
		# Find and return user
		return False
	except:
		abort(500)
