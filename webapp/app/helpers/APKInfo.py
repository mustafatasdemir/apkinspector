# -*- coding: utf-8 -*-
import sys
import time
import os

sys.path.append(sys.path[0]+"/tools/androguard/")
sys.path.append(sys.path[0]+"/tools/androguard/androguard/core/bytecodes")
sys.path.append(sys.path[0]+"/tools/androguard/androguard/core/analysis")
sys.path.append(sys.path[0]+"/tools/androguard/androguard/core/")

import androguard, analysis, androlyze
import bytecode
from dvm import *

class APK:
    filename = None
    apk = None
    
    def __init__(self, filename):
        self.filename = filename
        print filename
        self.apk = androlyze.APK(filename)
        print self.apk.is_valid_APK()

    def isVaildAPK(self):
        return self.apk.is_valid_APK()
    
    def getFilename(self):
        return str(self.apk.get_filename())
        
    def getVersionCode(self):
        return str(self.apk.get_androidversion_code())
    
    def getVersionName(self):
        return str(self.apk.get_androidversion_name())
        
    def getPackage(self):
        return str(self.apk.get_package())
    
    def getReceivers(self):
        retStr = ""
        receivers = self.apk.get_receivers()
        for i in receivers:
            retStr += i +"\n"
        if retStr != "":
            retStr = retStr[:-1]
        return (retStr, len(receivers))
    
    def getServices(self):
        retStr = ""
        services = self.apk.get_services()
        for i in services:
            retStr += i +"\n"
        if retStr != "":
            retStr = retStr[:-1]     
        return (retStr, len(services))        

# check permissions
    def getPermissions(self):       
        retStr = ""        
        permissions = self.apk.get_permissions()
        for i in permissions:
            retStr += i +"\n"

        if retStr != "":
            retStr = retStr[:-1]
        return (retStr, len(permissions))
    
    def getDex(self):
        return self.apk.get_dex()
    
