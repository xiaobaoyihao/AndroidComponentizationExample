#!/usr/bin/env bash
echo
echo ">>>>> Connected device:"
adb devices

echo
echo ">>>>> Remove old output apk:"
rm -rf ./build/outputs/apk/

echo
echo ">>>>> Running build tasks... "

startTime=$(date +%s)

.././gradlew :module1:installDebug --daemon --parallel --info

if [ $? -ne 0 ];then
	echo
	echo ">>>>> install debug apk failed, please check the error info above"
	exit
fi

echo
echo ">>>>> Launching apk on your phone..."

adb shell am start -n "com.dbs.module1/com.dbs.module1.debug.TriggerActivity" -a android.intent.action.MAIN -c android.intent.category.LAUNCHER

if [ $? -ne 0 ];then
	echo ">>>>> Launching apk failed, please check the error info above"
	exit
fi

endTime=$(date +%s)

echo ">>>>> Launching apk success: $current_time"
echo ">>>>>constTime:"$(($endTime-$startTime))"秒"
exit 0