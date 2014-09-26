import os
import sys
import zipfile

from startQT import SYSPATH

# delete all files and dirs in the "./temp/" dictionary
# return 0: success;
def clear():
    cmd = "rm -rf " + SYSPATH + "/temp/*"
    return os.system(cmd)
 
## use ded to generate the .jar file
def decompile(filename):
    if clear() != 0:
        return 0

    cmd1 = SYSPATH + "/ded/ded.sh " + filename + " -d" + SYSPATH + "/temp/java " 
    print "DED decompile JAD"
    if os.system(cmd1) != 0:
        print "DED wrong JAD"
        return 0

    cmd2 = "mv " + SYSPATH + "/temp/java/retargeted/1/* " + SYSPATH + "/temp/java "
    if os.system(cmd2) != 0:
        return 0
    cmd3 = "rm -rf " + SYSPATH + "/temp/java/retargeted " + SYSPATH + "/temp/java/optimized  " + SYSPATH + "/temp/java/optimized-decompiled  "
    if os.system(cmd3) != 0:
        return 0
    
    return 1

