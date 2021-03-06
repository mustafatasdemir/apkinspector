from APKtool import *
from APKInfo import *
from GetMethods import *
from CallInOut import *
from JAD import *
from xdotParser import *
import os, fnmatch

class StaticAnalysis:

	apktool = None
	cl = None
	apk = None
	vm = None
	vmx = None
	callInOut = None
	filename = None
	methodMapping = {}

	def __init__(self, filename):
		self.filename = filename
		self.apk = APK(filename)
		# initialize
		if self.apk.isVaildAPK():
			self.vm = DalvikVMFormat(self.apk.getDex())
			self.vmx = analysis.VMAnalysis(self.vm)
			print "JAD run"
			if decompile(filename) == 0:
				print "Failed to decompile using JAD"
				return
			self.apktool = APKtool(filename)
			self.cl = CLASS(self.apk, self.vm, self.vmx)
			methodInvokeList = self.cl.get_methodInvoke()
			self.callInOut = CallInOut(methodInvokeList)


	def get_permissions(self):
		(permissions, permission_count) = self.apk.getPermissions()
		permissions = permissions.split('\n')
		return permissions

	def get_manifest(self):
		return self.apktool.getManifest()

	def get_strings(self):
		return self.vm.get_strings()

	def get_class_method_list(self):
		package = self.apk.getPackage()
		countSlash = package.count('.', 0, len(package))
		pattern = package.replace('.', '/', countSlash)
		Classes = self.cl.get_classlist()
		PackageClasses = []
		for i in Classes:
			if i[1:].startswith(pattern):
				classObj = {}
				methods = self.cl.get_methods_class(i)
				methods_output = []
				for m in methods:
					mname = m.get_class_name() + "->" + m.get_name()+ m.get_descriptor()
					methods_output.append(mname)
					self.methodMapping[mname] = m
				classObj["classname"] = i
				classObj["methods"] = methods_output
				PackageClasses.append(classObj)
		return PackageClasses

	def get_java_code(self, classpath):
		classname = classpath[1:-1]
		inputpath = "temp/" + self.filename + "/java/" + classname + ".java"
			# "edu/cmu/wnss/funktastic/superawesomecontacts/AboutActivity.java"
		try:
			data = open(inputpath, "r").read()
		except IOError, e:
			print str(e)
			print "IOError"
			data = None
		return data


	def get_smali_code(self, classpath):
		classname = classpath[1:-1]
		inputpath = "/" + classname + "/"
		[flag, data] = self.apktool.getSmaliCode(inputpath)
		if flag == 0:
			return None
		elif flag == 1:
			return data

	def get_call_in_out(self, methodname):		
		callInContent = "************************Call In*************************\n"
		callOutContent = "***********************Call Out************************\n"
		callInList = self.callInOut.searchCallIn(methodname)
		callOutList = self.callInOut.searchCallOut(methodname)

		for i in callInList:
			temp = i.split("^")
			callInContent += temp[0] + "  (" + temp[1] + ")" + "\n"

		for i in callOutList:
			temp = i.split("^")
			callOutContent += temp[0] + "  (" + temp[1] + ")" + "\n"

		calltxt = callInContent + "\n\n\n" + callOutContent
		return calltxt

	def generate_cfg_xdot(self, methodname):
		m = self.methodMapping[methodname]
		xdot = XDot(m, self.vm, self.vmx)
		xdot.method2xdot()

	def grep(self, keyword):
		result = []
		classname = ""
		pathname = './temp/' + self.filename + '/java'
		for fileName in self.find_files(pathname, '*.java'):
			with open(fileName) as f:
				contents = f.read()
			if keyword in contents:
		    	# sample classname: Ledu/cmu/wnss/funktastic/superawesomecontacts/AboutActivity;
				classname = "L" + fileName[(7 + len(self.filename) + 6):-5] + ";"
				print "Classname: " + classname
				result.append(classname)
		return result

	def find_files(self, directory, pattern):
	    for root, dirs, files in os.walk(directory):
	        for basename in files:
	            if fnmatch.fnmatch(basename, pattern):
	                fileName = os.path.join(root, basename)
	                yield fileName


