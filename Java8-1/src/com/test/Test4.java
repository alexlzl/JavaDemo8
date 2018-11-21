package com.test;

import java.util.Arrays;
import java.util.List;

/**
 * 下面的示例中，我们给定一个列表，然后求列表中每个元素的平方和。这个例子中，我们使用了 reduce() 方法，这个方法的主要作用是把 Stream 元素组合起来。
 * Lambda 表达式和匿名类之间的区别
 * this 关键字。对于匿名类 this 关键字解析为匿名类，而对于 Lambda 表达式，this 关键字解析为包含写入 Lambda 的类。
 * 编译方式。Java 编译器编译 Lambda 表达式时，会将其转换为类的私有方法，再进行动态绑定。
 */
public class Test4 {
    public static void main(String[] args) {
        // old way
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
//        int sum = 0;
//        for(Integer n : list) {
//            int x = n * n;
//            sum = sum + x;
//        }
//        System.out.println(sum);

// new way
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int sum = list.stream().map(x -> x * x).reduce((x, y) -> x + y).get();
        System.out.println(sum);
    }
}
