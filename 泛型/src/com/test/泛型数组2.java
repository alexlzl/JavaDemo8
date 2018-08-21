package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuzhouliang on 2018/8/16.
 */
public class 泛型数组2<t> {
    public static void main(String[] args) {
        List<?>[] lsa = new List<?>[10]; // OK, array of unbounded wildcard type.
        Object o = lsa;
        Object[] oa = (Object[]) o;
        List<Integer> li = new ArrayList<Integer>();
        li.add(new Integer(3));
        oa[1] = li; // Correct.
        Integer i = (Integer) lsa[1].get(0); // OK
    }
}
