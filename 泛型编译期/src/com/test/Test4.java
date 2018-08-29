package com.test;

import java.util.Date;

/**
 * Created by liuzhouliang on 2018/8/29.
 */
public class Test4 {
    static int k = printI();

    static int printI() {
        System.out.println("Inner class is loading before " +
                "creating OuterClass instance!");
        return InnerClass.i;
    }

    Test4() {
        System.out.println("static k is " + k);
        System.out.println("OuterClass constructor");
    }

    /**
     * 非静态内部类不可以有static修饰的成员变量，
     * 以及不可以有static final修饰的除基本数据类型和字符串直接量声明的String以外的属性。
     */
    class InnerClass {
        private static final int i = 1;
        String s = new String("abc");
//        static Date date = new Date();编译异常
    }


}
