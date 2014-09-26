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
import unittest
from app import create_app, db
from app.helpers.AWSHelper import AWSHelper
from app.helpers.UserHelper import UserHelper
from app.models import Team, TeamIAM, Employee


class Helpers(unittest.TestCase):

	""" Includes unit tests for helper classes under 'helpers' folder
	"""

	def setUp(self):
		self.app = create_app('testing')
		self.app_context = self.app.app_context()
		self.app_context.push()
		db.create_all()

	def tearDown(self):
		db.session.remove()
		db.drop_all()
		self.app_context.pop()


	@unittest.skip("")
	def test_test(self):
		self.assertTrue(True)