package com.test;

/**
 * Created by liuzhouliang on 2018/8/30.
 */
public class Child extends Parent {
    public static int aa=101;
    static {

        System.out.println("Child==静态块1==执行=================");
    }

    public static int a = getA();
    public String name = getName();

    public Child() {
        System.out.println("Child==构造函数==执行=========" + a);
    }

    static {
        System.out.println("Child==静态块2==执行静态变量==a===" + a);
        System.out.println("Child==静态块2==执行=================");
    }

    public static int getA() {
        System.out.println("Child==执行静态变量初始化============" + a);
        return 100;
    }

    public String getName() {
        System.out.println("Child==执行实例变量初始化============" + name);
        return "name初始化内容";
    }

    {
        System.out.println("Child==非静态块执行=================");
        System.out.println("Child==非静态块执行=================name==" + name);
    }

    public static String getStr() {
        System.out.println("静态方法执行=================");
        return "test===";
    }
}
