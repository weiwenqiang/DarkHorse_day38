#include <jni.h>
#include <android/log.h>
#define LOG_TAG "System.out"
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__)

void JNICALL Java_com_example_day38_branch_TestJniBranchC_callC
(JNIEnv * env, jobject obj) {
	//分支出C进程
	int pid = fork();
	//如果为0，分支成功
	if(pid==0) {
		while(1) {
			LOGI("hello xiao zhi");
			sleep(1);
		}
	}
}
