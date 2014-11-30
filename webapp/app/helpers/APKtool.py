import os
import sys

class APKtool:    
    firstFlag = None
    lastClassName = None
    output_path = None
    
    def __init__(self, filename):
        self.output_path = sys.path[0] + "/temp/" + filename + "/ApktoolOutput/"
        cmd = "apktool d -d -f " + filename + " -o " + self.output_path
        print "finish calling apktool " + filename
        if os.system(cmd) !=0:
            self.successFlag = 0
        else:
            print "SUCCESS finish calling apktool " + filename
            self.successFlag = 1   
        self.firstFlag = 0
        self.lastClassName = ""

    def getManifest(self):
        if self.successFlag == 0:
            print "apktool fail3"
            return [0, ""]
        print "apktool success 4"
        path = self.output_path + "AndroidManifest.xml"
        try:
            data = open(path, "r").read()
        except IOError:
            print "IOError"
            data = ""
        return [1, data]


    # get the smali codes
    def getSmaliCode(self, className):
        if self.successFlag == 0:
            return [0, ""]
        print className
            
        className = className[1:-1] + ".java"
        # this is the first time to call method "getSmaliCode"
        if self.firstFlag == 0:
            self.firstFlag ==1
            self.lastClassName = className
            classPath = self.output_path + "smali/" + className
            print "class path: " + classPath
            try:
                data = open(classPath, "r").read()
            except IOError, e:
                print str(e)
                data = ""
            return [1, data]
        
        # if the lastClassName is equal to className, the smali codes need not to be updated
        if self.firstFlag == 1:
            if self.lastClassName == className:
                return [0, ""] 
            else:
                self.lastClassName = className
                classPath = self.output_path + className
                data = open(classPath, "r").read()
                return [1, data]
