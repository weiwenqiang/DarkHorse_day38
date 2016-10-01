#include <jni.h>
#include <stdio.h>
#include <stdlib.h>

int getPressure(){
	//...检测电压....运算得到压力值
	return rand() % 101;
}

int monitor;
JNIEXPORT void JNICALL Java_com_example_day38_pressure_TestJniPressure_startMonitor
  (JNIEnv * env, jobject obj){
	monitor =1;
	while(monitor){
		//获取锅炉压力
			int pressure = getPressure();

			jclass clazz = (*env)->FindClass(env, "com/example/day38/pressure/TestJniPressure");

			jmethodID methodId = (*env)->GetMethodID(env, clazz, "show", "(I)V");

			(*env)->CallVoidMethod(env, obj, methodId, pressure);

			sleep(1);//睡1秒
	}

}

JNIEXPORT void JNICALL Java_com_example_day38_pressure_TestJniPressure_stopMonitor
  (JNIEnv * env, jobject obj){
	monitor = 0;
}
