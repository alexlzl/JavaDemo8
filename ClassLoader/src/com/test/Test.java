package com.test;

/**
 * Created by liuzhouliang on 2018/7/24.
 * <p>
 * sun.misc.Launcher$AppClassLoader@18b4aac2
 * sun.misc.Launcher$ExtClassLoader@4554617c
 * null
 */
public class Test {
    public static void main(String[] args) {
        //application class loader
        System.out.println(ClassLoader.getSystemClassLoader());
        //extensions class loader
        System.out.println(ClassLoader.getSystemClassLoader().getParent());
        //bootstrap class loader
        System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent());
    }
}
