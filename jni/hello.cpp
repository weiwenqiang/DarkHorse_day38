#include <jni.h>
#include "com_example_day38_cplusplus_TestJniCPlusPlus.h"

JNIEXPORT jstring JNICALL Java_com_example_day38_cplusplus_TestJniCPlusPlus_helloC
  (JNIEnv * env, jobject obj){
	char* cstr = "hello from c++";
	//C++ ����Ҫ����һ�����������ҽ�ָ���Ϊһ��ָ��
	return env->NewStringUTF(cstr);
}
