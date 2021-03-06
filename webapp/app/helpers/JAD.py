import os
import sys
import zipfile

# delete all files and dirs in the "./temp/" dictionary
# return 0: success;
def clear(filename):
    cmd = "rm -rf " + " temp/" + filename + "/*"
    return os.system(cmd)

# use the dex2jar to generate the .jar file.
# Then move .jar file to the "./temp/" dictionary
# At last, unzip the .jar file to "./temp/" dictionary
# return 1: success ; return 0: fail
def dex2jar(filename):
    cmd1 = "tools/dex2jar/dex2jar.sh " + filename
    if os.system(cmd1) !=0:
        return 0
    newfilename = os.path.split(filename)[-1]
    newfilename = os.path.splitext(newfilename)[0] + "_dex2jar.jar"
    cmd2 = "mv " + newfilename + " temp/" + filename
    if os.system(cmd2) != 0:
        return 0
    print "start unzip"
    if unzip(filename, newfilename) != 0:
        return 0    
    return 1

# unzip the .jar file
# return 0: success;
def unzip(filename, newfilename):
    cmd = "unzip -o " + "temp/" + filename + "/" + newfilename + " -d" + "temp/" + filename + "/unzip"
    return os.system(cmd)

def create_temp_folder(filename):
    cmd = "mkdir -p temp/" + filename
    if os.system(cmd) != 0:
        return 0
    return 1

# decompile the apk to the Javacodes
# parameter:
#       filename: the full absolute path of the apk file
# return 1: success; return 0:fail
def decompile(filename):
    if clear(filename) != 0:
        return 0

    if create_temp_folder(filename) != 1:
        return 0
        
    if dex2jar(filename) != 1:
        return 0
    
    print "jad decompile"
    cmd = "tools/jad158e.linux.static/jad -o -r -sjava -d" + " temp/" + filename + "/java " + "temp/" + filename + "/unzip/**/*.class"
    # cmd = "tools/jad158g.mac.intel/jad -o -r -sjava -d" + " temp/" + filename + "/java " + "temp/" + filename + "/unzip/**/*.class"
    
    if os.system(cmd) != 0:
        return 0
 
    return 1



    
    
    
