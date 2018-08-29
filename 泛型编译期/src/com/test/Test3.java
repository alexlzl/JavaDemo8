package com.test;

import java.util.ArrayList;

/**
 * Created by liuzhouliang on 2018/8/29.
 */
public class Test3 {
    public static void main(String[] args){
        ArrayList<String> arrayList1=new ArrayList(); //第一种 情况
        ArrayList arrayList2=new ArrayList<String>();//第二种 情况
        arrayList2.add(100);
//        arrayList1.add(100);
    }
}
