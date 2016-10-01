#include <jni.h>
#include "com_example_day38_cplusplus_TestJniCPlusPlus.h"

JNIEXPORT jstring JNICALL Java_com_example_day38_cplusplus_TestJniCPlusPlus_helloC
  (JNIEnv * env, jobject obj){
	char* cstr = "hello from c++";
	//C++ 最需要传入一个变量，并且将指针变为一级指针
	return env->NewStringUTF(cstr);
}
