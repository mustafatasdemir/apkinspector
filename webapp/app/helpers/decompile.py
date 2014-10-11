import threading
import Global
import JAD
import APKtool
from APKInfo import *

class Decompile(threading.Thread):
    # progress = None
    filename = None
    
    def __init__(self, filename):
        super(Decompile, self).__init__()
        # self.progress = progress
        self.filename = filename
        
    def run(self):
        print "decompile run"
        Global.APK = APK(self.filename)
        if Global.APK.isVaildAPK():
            # self.progress.step = 599900
            Global.VM = DalvikVMFormat(Global.APK.getDex())
            Global.VMX = analysis.VMAnalysis(Global.VM)
        
            # if self.progress.step <= 500000:
            #     self.progress.step = 500000
        
            # if Global.CONFIG["Java"] == 1:
                # print "set JAD flag"
            Global.FLAG_JAD = 0
            print "JAD run"
            Global.FLAG_JAD=JAD.decompile(self.filename)
            # if self.progress.step <= 800000:
            #     self.progress.step = 800000
#            print "java" Global.CONFIG["Java"]
#            print "smali" Global.CONFIG["Smali"] 
            # if Global.CONFIG["Smali"] ==1 or Global.CONFIG["Manifest"] ==1:
            print "start thread apktool1"
            #    Global.FLAG_APKTOOL = 0
            Global.FLAG_APKTOOL = APKtool.callAPKtool(self.filename)
            # if self.progress.step <= 990000:
            #     self.progress.step = 990000