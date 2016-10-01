#include <jni.h>
#include <stdio.h>
#include <stdlib.h>

int getPressure(){
	//...����ѹ....����õ�ѹ��ֵ
	return rand() % 101;
}

int monitor;
JNIEXPORT void JNICALL Java_com_example_day38_pressure_TestJniPressure_startMonitor
  (JNIEnv * env, jobject obj){
	monitor =1;
	while(monitor){
		//��ȡ��¯ѹ��
			int pressure = getPressure();

			jclass clazz = (*env)->FindClass(env, "com/example/day38/pressure/TestJniPressure");

			jmethodID methodId = (*env)->GetMethodID(env, clazz, "show", "(I)V");

			(*env)->CallVoidMethod(env, obj, methodId, pressure);

			sleep(1);//˯1��
	}

}

JNIEXPORT void JNICALL Java_com_example_day38_pressure_TestJniPressure_stopMonitor
  (JNIEnv * env, jobject obj){
	monitor = 0;
}
