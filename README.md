apkinspector
============

Follow these steps for dynamic analysis to work :

1. Install Cython-0.21.1
2. go to https://developer.android.com/sdk/index.html#Other and download sdk tools for linux
3. Untar it in the downloads folder
4. cd Downloads/android-sdk-linux/tools
5. ./android sdk
6. It launches a SDK manager, from which we need to download the platform tools for 4.1.2
7. Open the first Android 4.1.2 folder (the latest version) and select:
SDK Platform
A system image for the emulator, such as 
ARM EABI v7a System Image
8. Go to https://code.google.com/p/droidbox/downloads/list
9. Download the DroidBox411RC.tar.gz  
10. Untar the folder
11. cd DroidBox_4.1.1/images
12. copy the images
13. paste the images in cd Desktop/apkinspector/webapp/tools/DroidBox_4.1.1/images
14. cd Desktop/apkinspector/webapp/tools/DroidBox_4.1.1/numpy
15. python setup.py install –user
16. cd Desktop/apkinspector/webapp/tools/DroidBox_4.1.1/scipy
17. python setup.py install –user
18. sudo apt-get install python-matplotlib 

