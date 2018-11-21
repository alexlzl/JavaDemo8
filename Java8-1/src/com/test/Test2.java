package com.test;

import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        for (Integer n : list) {
            System.out.println(n);
        }
        // 使用 -> 的 Lambda 表达式
        list.forEach(n -> System.out.println(n));
        // 使用 :: 的 Lambda 表达式
        list.forEach(System.out::println);
    }
}
