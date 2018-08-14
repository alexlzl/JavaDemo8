package com.test;

import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuzhouliang on 2018/8/14.
 */
public class Test {

    public static void main(String [] args){
        List<String> stringArrayList = new ArrayList<String>();
        List<Integer> integerArrayList = new ArrayList<Integer>();

        Class classStringArrayList = stringArrayList.getClass();
        Class classIntegerArrayList = integerArrayList.getClass();

        if(classStringArrayList.equals(classIntegerArrayList)){
          System.out.println("泛型测试类型相同");
        }
    }
}
