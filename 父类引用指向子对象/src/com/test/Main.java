package com.test;

/**
 * Created by liuzhouliang on 2018/8/24.
 */

/**
 * A0 is called
 * B1 is called
 * C2 is called
 */
public class Main {
    public static void main(String[] args) {
        C c = new C(10);
    }
}

class A {
    public A() {
        System.out.println("A0 is called");
    }
}

class B extends A {
    public B(String name) {
//        super();
        System.out.println("B1 is called");
    }
}

class C extends B {
    public C(int id) {
        super(String.valueOf(id));
        System.out.println("C2 is called");
    }
}
