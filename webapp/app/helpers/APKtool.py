import os
import sys
import Global

# use the apktool to get the smali codes and AndroidManifest.xml
# return 1: success ; return 0: fail
def callAPKtool(filename):
    outputPath = sys.path[0] + "/temp/ApktoolOutput"
    print "call apktool " + filename
    cmd = "apktool d -d -f " + filename + " -o " + outputPath
    print "finish calling apktool " + filename
    if os.system(cmd) !=0:
        return  0
    else:
        print "SUCCESS finish calling apktool " + filename
        return  1


class APKtool:    
    firstFlag = None
    lastClassName = None
    
    def __init__(self):
        print "apktool 2"
#       self.successFlag = Global.FLAG_APKTOOL
        self.successFlag = 1
        self.firstFlag = 0
        self.lastClassName = ""

    def getManifest(self):
        if self.successFlag == 0:
            print "apktool fail3"
            return [0, ""]
        print "apktool success 4"
        path = sys.path[0] + "/temp/ApktoolOutput/AndroidManifest.xml"
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
            classPath = sys.path[0] + "/temp/ApktoolOutput/smali/" + className
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
                classPath = sys.path[0] + "/temp/ApktoolOutput/" + className
                data = open(classPath, "r").read()
                return [1, data]
