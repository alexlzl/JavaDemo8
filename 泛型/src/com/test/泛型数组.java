package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuzhouliang on 2018/8/16.
 */
public class 泛型数组 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String >();
        //在java中是”不能创建一个确切的泛型类型的数组”的
//        List<String>[] ls = new ArrayList<String>[10];
        //而使用通配符创建泛型数组是可以的，如下面这个例子：
        List<?>[] ls = new ArrayList<?>[10];
        List<String>[] ls1 = new ArrayList[10];

//        List<String>[] lsa = new List<String>[10]; // Not really allowed.
//        Object o = lsa;
//        Object[] oa = (Object[]) o;
        List<Integer> li = new ArrayList<Integer>();
        li.add(new Integer(3));
//        oa[1] = li; // Unsound, but passes run time store check
//        String s = lsa[1].get(0); // Run-time error: ClassCastException.
    }
}
