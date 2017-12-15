package com.example.md5library;

/**
 * Created by jiang on 2017/12/4.
 */

public class JniUtils {

    //    jni.h中定义
//    # include <inttypes.h>      /* C99 */
//    typedef uint8_t         jboolean;       /* unsigned 8 bits */
//    typedef int8_t          jbyte;          /* signed 8 bits */
//    typedef uint16_t        jchar;          /* unsigned 16 bits */
//    typedef int16_t         jshort;         /* signed 16 bits */
//    typedef int32_t         jint;           /* signed 32 bits */
//    typedef int64_t         jlong;          /* signed 64 bits */
//    typedef float           jfloat;         /* 32-bit IEEE 754 */
//    typedef double          jdouble;        /* 64-bit IEEE 754 */
//    #else
//    typedef unsigned char   jboolean;       /* unsigned 8 bits */
//    typedef signed char     jbyte;          /* signed 8 bits */
//    typedef unsigned short  jchar;          /* unsigned 16 bits */
//    typedef short           jshort;         /* signed 16 bits */
//    typedef int             jint;           /* signed 32 bits */
//    typedef long long       jlong;          /* signed 64 bits */
//    typedef float           jfloat;         /* 32-bit IEEE 754 */
//    typedef double          jdouble;        /* 64-bit IEEE 754 */
//    #endif
    public native String getString();
    public native String getEncrypt(String password);
  //  public native int addAll(int a,int b);





















}
