package com.test;

/**
 * Created by liuzhouliang on 2018/8/22.
 */

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;


/**
 * class com.test.Test
 * com.test.Test<com.test.Student1>
 * class com.test.Student1
 */
public class Student1 extends Test<Student1> {
    public static void main(String[] args) {
        Student1 st = new Student1();
        Class clazz = st.getClass();
        //getSuperclass()获得该类的父类
        System.out.println(clazz.getSuperclass());// class com.test.Test
        //getGenericSuperclass()获得带有泛型的父类
        //Type是 Java 编程语言中所有类型的公共高级接口。它们包括原始类型、参数化类型、数组类型、类型变量和基本类型。
        Type type = clazz.getGenericSuperclass();
        System.out.println(type);//com.test.Test<com.test.Student1>
        //ParameterizedType参数化类型，即泛型
        ParameterizedType p = (ParameterizedType) type;
        //getActualTypeArguments获取参数化类型的数组，泛型可能有多个
        Class c = (Class) p.getActualTypeArguments()[0];//class com.test.Student1
        System.out.println(c);
    }
}

class Test<T> {

}

