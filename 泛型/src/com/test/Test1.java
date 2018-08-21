package com.test;

/**
 * Created by liuzhouliang on 2018/8/15.
 */
public class Test1 {
    public static void main(String[] args){
        printMsg("a","b",100);
    }

    public static <T>  void printMsg( T... args){
        for(T t : args){
          System.out.println("泛型测试"+"t is " + t);
        }
    }
}
