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
from datetime import datetime
from flask import render_template, session, redirect, url_for, \
current_app, request, abort
from . import main
from .. import db
from ..helpers.decompile import Decompile
from ..helpers.APKtool import APKtool

apktool = None

def session_exists():
	if "username" in session:
		return True

@main.route('/', methods = ['GET'])
@main.route('/index', methods = ['GET'])
def index():
	a = 5
	
	return render_template("index.html")

def initialize():
	decomp_thread = Decompile("SuperAwesomeContacts.apk")
	decomp_thread.start()
	decomp_thread.join()
	apktool = APKtool()
	print "hhhhhhh"


@main.route('/smali', methods = ['GET'])
def smali():
	initialize();
	classname =""
	[flag, data] = apktool.getSmaliCode(classname)
        if flag == 0:
            smali_output = "Failed to show smali code"
        elif flag == 1:
            smali_output = data
	return render_template("smali.html", smali_output = smali_output)

@main.route('/java', methods = ['GET'])
def java():
	inputpath = "temp/java/" + ""
	try:
	  	data = open(inputpath, "r").read()
	except IOError:
		print "IOError"
		data = None

	if data == None:
		java_output = "Failed to load java source code"
	else:
		java_output = data

	return render_template("java.html", java_output = java_output)


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