#!/usr/bin/env bash

/home/apkinspector/Downloads/android-sdk-linux/tools/emulator -avd $1 -system /home/apkinspector/Desktop/apkinspector/webapp/tools/DroidBox_4.1.1/images/system.img -ramdisk /home/apkinspector/Desktop/apkinspector/webapp/tools/DroidBox_4.1.1/images/ramdisk.img -wipe-data -prop dalvik.vm.execution-mode=int:portable &
