package com.test;

/**
 * Created by liuzhouliang on 2018/9/5.
 */
public class Test {
    public String test=getTest();


    public String getTest(){
        System.out.println("初始化test");
        return  "qqqqqqqqqqqqq";
    }

    public void setTest(){
        test="dddddddd";
        System.out.println("初始化df");
    }


}
