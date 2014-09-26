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
from datetime import timedelta
from flask import Flask, render_template
from flask.ext.mail import Mail
from flask.ext.moment import Moment
from flask.ext.sqlalchemy import SQLAlchemy
from config import config
import logging
from logging.handlers import RotatingFileHandler, SMTPHandler

#from handlers.TlsSMTPHandler import TlsSMTPHandler

mail = Mail()
moment = Moment()
db = SQLAlchemy()


def create_app(config_name):
	app = Flask(__name__)
	app.config.from_object(config[config_name])
	app.permanent_session_lifetime = timedelta(minutes = 10)
	config[config_name].init_app(app)
	mail.init_app(app)
	moment.init_app(app)
	db.init_app(app)

	# attach routes and custom error pages here

	from main import main as main_blueprint
	app.register_blueprint(main_blueprint)


	file_handler = RotatingFileHandler('logs/nights_watch.log',
		'a',									# Append
		1 * 1024 * 1024 * 1024,					# 10 MB
		20)										# Max 20 log files
	
	#mail_handler = SMTPHandler(
	#	mailhost=(app.config["MAIL_SERVER"], app.config["MAIL_PORT"]),
	#	fromaddr=app.config["MAIL_SENDER"],
	#	toaddrs=app.config["MAIL_TO"],
	#	subject=app.config["MAIL_SUBJECT_PREFIX"])

	log_format_file = logging.Formatter('%(asctime)s %(levelname)s: %(message)s \
	[at %(pathname)s:%(lineno)d]')

	#log_format_email = logging.Formatter('%(asctime)s %(levelname)s: %(message)s')

	file_handler.setFormatter(log_format_file)
	#mail_handler.setFormatter(log_format_email)

	app.logger.setLevel(logging.INFO)

	file_handler.setLevel(logging.INFO)
	#mail_handler.setLevel(logging.WARNING)

	app.logger.addHandler(file_handler)
	#app.logger.addHandler(mail_handler)

	app.logger.info('application started!!!')

	return app