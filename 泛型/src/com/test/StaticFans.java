package com.test;

/**
 * Created by liuzhouliang on 2018/8/16.
 */
public class StaticFans {
    //静态函数
    public static  <T> void StaticMethod(T a){
       System.out.println("harvic"+"StaticMethod: "+a.toString());
    }
    //普通函数
    public  <T> void OtherMethod(T a){
     System.out.println("harvic"+"OtherMethod: "+a.toString());
    }
}
