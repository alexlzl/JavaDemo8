package com.test;

/**
 * Created by liuzhouliang on 2018/8/22.
 */
public class Test {

    public static void main(String[] args){
        try {
            Person person=Person.class.newInstance();
            System.out.println("实例化成功===============");
        } catch (InstantiationException e) {
            System.out.println("实例化失败===============");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("实例化失败===============");
            e.printStackTrace();
        }
    }
}
