package com.test;

/**
 * Created by liuzhouliang on 2018/8/30.
 * parent===========静态块1
 * parent===========初始化静态变量
 * parent===========静态块2
 * Child==静态块1==执行=================
 * Child==执行静态变量初始化============0
 * Child==静态块2==执行静态变量==a===100
 * Child==静态块2==执行=================
 * parent===========初始化实例变量
 * parent===========非静态块
 * parent===========构造函数
 * Child==执行实例变量初始化============null
 * Child==非静态块执行=================
 * Child==非静态块执行=================name==name初始化内容
 * Child==构造函数==执行=========100
 */
public class Test {
    public static void main(String[] args) {
//        Child.getStr();
//      int aa=  Child.a;
        Child test1 = new Child();
//        String str=Child.getStr();
    }
}
