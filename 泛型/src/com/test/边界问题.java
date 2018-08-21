package com.test;

import java.util.ArrayList;

/**
 * Created by liuzhouliang on 2018/8/17.
 */
public  class 边界问题 {

    /**
     * ? extends E:接收E类型或者E的子类型。
     ? super E:接收E类型或者E的父类型
     * @param args
     */
    public static  void main(String[] args){

    }

    public <E> void  test(){
        ArrayList<? extends E> al=new ArrayList<>();
        ArrayList<? super E> a2=new ArrayList<>();
    }
}
