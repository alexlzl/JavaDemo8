package com.test;

/**
 * Created by liuzhouliang on 2018/8/24.
 */
public class Main1 {
    public static void main(String [] args) {
        B1 b = new B1();
        A1 a = (A1) b;
        A1 aa=new A1();

        System.out.println(b.getClass());//class com.test.B1
        System.out.println(a.getClass());//class com.test.B1

        System.out.println(a instanceof A1);//true
        System.out.println(b instanceof A1);//true
        System.out.println(a instanceof B1);//true
        System.out.println(b instanceof B1);//true
        System.out.println(a instanceof A1);//true
    }
}

class A1 {
}
class B1 extends A1 {
}
