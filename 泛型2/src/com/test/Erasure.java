package com.test;

import java.lang.reflect.Method;

/**
 * Created by liuzhouliang on 2018/8/24.
 */
public class Erasure<T> {
    T object;

    public Erasure(T object) {
        this.object = object;
    }

    public void add(T object) {

    }

    public static void main(String[] args) {
        Erasure<String> erasure = new Erasure<String>("hello");
        Class eclz = erasure.getClass();
        //erasure class is:com.test.Erasure
        System.out.println("erasure class is:" + eclz.getName());

        Method[] methods = eclz.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(" method:" + m.toString());
        }
    }

}
