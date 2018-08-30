package com.test;

/**
 * Created by liuzhouliang on 2018/8/30.
 */
public class Test3 {
    public static int a=1900;

    public void test(){
        System.out.println(a);
        {

        }
    }
    //定义一个普通的main()方法

    public static void main(String args[]){

        System.out.println("This is main method.");

    }

    //定义一个静态代码块

    static{

        System.out.println("This is static block.");

        int stVar = 0;   //这是一个局部变量，只在本块内有效

    }
}
