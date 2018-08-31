package com.test;

/**
 * Created by liuzhouliang on 2018/8/30.
 * 初始化顺序：先初始化父类的静态代码--->初始化子类的静态代码-->
 * (创建实例时,如果不创建实例,则后面的不执行)初始化父类的非静态代码（变量定义等）--->初始化父类构造函数--->初始化子类非静态代码（变量定义等）--->初始化子类构造函数
 * <p>
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
//        Parent parent=new Parent();
//        Child test1 = new Child();
        int a = Child.aaa;//如果引用的是父类的变量，不会引起子类的初始化
//        String str=Child.getStr();
    }
}
