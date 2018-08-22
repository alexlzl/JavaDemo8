package com.test;

import java.util.List;

/**
 * Created by liuzhouliang on 2018/8/22.
 */
public class Test3 {
    public static void main(String[] args) {
        //编译时无法确定getObject()返回的引用类型的具体类型，下面两句都能通过编译
        System.out.println(getObject() instanceof Object);
        System.out.println(getObject() instanceof String);
        System.out.println(getObject() instanceof Test);

        //编译时可以确定类型的，能够cast则编译通过，否则编译失败
        Test test = new Test();
        System.out.println(test instanceof Test);//ok
        System.out.println(test instanceof Object); //ok
        // System.out.println(test instanceof String);//error,可以通过下面方法
        System.out.println((Object)test instanceof String);


        //跟泛型相关的注意一下
        //List是泛型类型，如果不指定泛型参数，成功编译
        System.out.println(test instanceof List);
        //如果不限定类型界限，通过编译
        System.out.println(test instanceof List<?>);

        //指定泛型参数，编译时可确定类型，如果不能cast，编译不通过
//       System.out.println(getObject() instanceof List<Test>); //error
//       System.out.println(test instanceof List<Test>);//error
    }

    public static Object getObject() {
        return new Test();
    }
}
