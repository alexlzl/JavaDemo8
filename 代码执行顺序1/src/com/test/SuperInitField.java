package com.test;

/**
 * Created by liuzhouliang on 2018/8/31.
 */
public class SuperInitField {
    public SuperInitField() {
        System.out.println("parent");
    }
    static {
        System.out.println("static parent");
    }
}
