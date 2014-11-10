from APKtool import *
from APKInfo import *
from GetMethods import *
from CallInOut import *
from JAD import *

class StaticAnalysis:

	apktool = None
	cl = None
	apk = None
	vm = None
	vmx = None
	callInOut = None
	filename = None

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
					methods_output.append(m.get_class_name() + "->" + m.get_name()+ m.get_descriptor())
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
