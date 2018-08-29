package com.test;

import java.lang.reflect.ParameterizedType;

/**
 * Created by liuzhouliang on 2018/8/22.
 * <p>
 * com.test.Person<com.test.Student>
 * clazz ---> class com.test.Student
 */
@SuppressWarnings("unchecked")
public class Person<T> {
    private Class<T> clazz;

    public Person() {
        // 使用反射技术得到T的真实类型
        System.out.println(this.getClass().getName());
        System.out.println(getClass().getName()+"==="+getClass().getSuperclass());//com.test.Student===class com.test.Person
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass(); // 获取当前new的对象的 泛型的父类 类型
//        System.out.println(pt);//com.test.Person<com.test.Student>
        this.clazz = (Class<T>) pt.getActualTypeArguments()[0]; // 获取第一个类型参数的真实类型
//        System.out.println("clazz ---> " + clazz);//clazz ---> class com.test.Student
        test();
    }

    public  void test(){
        System.out.println(this.getClass().getName());
    }

}
