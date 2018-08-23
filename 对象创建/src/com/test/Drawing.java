package com.test;

/**
 * Created by liuzhouliang on 2018/8/23.
 */
public class Drawing extends Art {
    public  String aa="来自Drawing";
    Drawing() {
        System.out.println("Drawing===构造方法");//3
        System.out.println("Drawing中执行=="+getClass().getName());
    }

    public void test3() {
        System.out.println("Print Draw3");
    }

    public void test4() {
        System.out.println("Print Draw4");
    }
    public void test()
    {
        System.out.println("Drawing重写test");
    }
}

