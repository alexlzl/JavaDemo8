package com.test;

import org.junit.Test;

import java.lang.annotation.Documented;

/**
 * Created by liuzhouliang on 2018/8/8.
 * https://blog.csdn.net/javazejian/article/details/71860633
 */

public class AnnotationDemo {
    //@Test注解修饰方法A
    @TestS(status= TestS.Status.FIXED,showSupport=true,name="test",testCase=Void.class,reference=@Reference(next=true),value={10,22,33})
    public static void A() {
        System.out.println("TestS.....");
    }

    //一个方法上可以拥有多个不同的注解
    @Deprecated
    @SuppressWarnings("uncheck")
    public static void B() {

    }
}
