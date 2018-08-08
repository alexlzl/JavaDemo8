package com.test;

/**
 * Created by liuzhouliang on 2018/7/24.
 */
public class TestClassLoader {
    public static void main(String[] args){
        MyClassLoader loader = new MyClassLoader("E:");
        Class<?> c = null;
        try {
            c = loader.loadClass("com.test.Test1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(loader.getParent()+"======");
        System.out.println(c.getName()+c.getPackage());
        System.out.println(c.getClassLoader());
    }
}
