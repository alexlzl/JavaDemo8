package com.test;

/**
 * Created by liuzhouliang on 2018/8/29.
 */
public class OuterClass {
    static int k = printI();

    static int printI () {
        System.out.println("Inner class is loading before " +
                "creating OuterClass instance!");
        return InnerClass.i;
    }

    OuterClass () {
        System.out.println("static k is " + k);
        System.out.println("OuterClass constructor");
    }

    class InnerClass {
        private static final int i = 1;
    }


}
