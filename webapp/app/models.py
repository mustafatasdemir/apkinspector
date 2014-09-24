# Copyright 2014, Quixey Inc.
# 
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
from werkzeug.security import generate_password_hash, check_password_hash

from app import db

class User(db.Model):
	__tablename__ = "users"
	id = db.Column(db.Integer, primary_key = True)
	nickname = db.Column(db.String(64), index = True)
	email = db.Column(db.String(120), index = True)
	password_hash = db.Column(db.String(128))
	is_active = db.Column(db.Boolean, default = True)
	is_email_client = db.Column(db.Boolean, default = False)

	def __repr__(self):
		return '<User %r>' % (self.nickname)

	@property
	def password(self):
		raise AttributeError("Password is not a readable attribute")

	@password.setter
	def password(self, password):
		self.password_hash = generate_password_hash(password)

	def verify_password(self, password):
		return check_password_hash(self.password_hash, password)