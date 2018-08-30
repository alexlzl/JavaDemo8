package com.test;

/**
 * Created by liuzhouliang on 2018/8/30.
 */
public class Parent {
    Parent(){
        System.out.println("parent===========构造函数");
    }
    static {
        System.out.println("parent===========静态块1");
    }
    public String  parentStr=getParentStr();
    public  static  int parentInt=getParentInt();
    public String getParentStr(){
        System.out.println("parent===========初始化实例变量");
        return  "parent字符串===";
    }
    static {
        System.out.println("parent===========静态块2");
    }
    public static int getParentInt(){
        System.out.println("parent===========初始化静态变量");
        return  1001;
    }

    {
        System.out.println("parent===========非静态块");
    }
}
