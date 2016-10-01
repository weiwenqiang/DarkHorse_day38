LOCAL_PATH := $(call my-dir)

	include $(CLEAR_VARS)

	#LOCAL_MODULE    := pressure
	#LOCAL_SRC_FILES := pressure.c
	
	#LOCAL_MODULE    := hello
	#LOCAL_SRC_FILES := hello.cpp
	
	LOCAL_LDLIBS += -llog
	LOCAL_MODULE    := branch
	LOCAL_SRC_FILES := branch.c

	include $(BUILD_SHARED_LIBRARY)