#!/bin/bash

/home/apkinspector/Desktop/apkinspector/webapp/tools/DroidBox_4.1.1/startemu.sh test_droid 
sleep 1200

export PATH=$PATH:/home/apkinspector/Downloads/android-sdk-linux/tools/
export PATH=$PATH:/home/apkinspector/Downloads/android-sdk-linux/platform-tools/
export ANDROID_SDK_ROOT=/home/apkinspector/Downloads/android-sdk-linux/

echo $1
echo $2
echo $3

/home/apkinspector/Desktop/apkinspector/webapp/tools/DroidBox_4.1.1/droidbox.sh $2 $1 > $3

