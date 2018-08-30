package com.test;

/**
 * Created by liuzhouliang on 2018/8/29.
 * <p>
 * Inner class is loading before creating OuterClass instance!
 * static k is 1
 * OuterClass constructor
 */
public class TestInnerClassLoader {
    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        int a=OuterClass.k;
        System.out.println(a);
    }
}
