#!/bin/bash

if [ $# -lt 1 ] || [ $# -gt 2 ];then
	echo "Usage: $0 APK <duration in seconds>"
	exit 1;
fi

python "/home/apkinspector/Desktop/apkinspector/webapp/tools/DroidBox_4.1.1/scripts/droidbox.py" $1 $2
