package com.test;

import javafx.concurrent.Task;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by liuzhouliang on 2018/10/25.
 * 虽然大部分情况下stream是容器调用Collection.stream()方法得到的，但stream和collections有以下不同：
 * <p>
 * 无存储。stream不是一种数据结构，它只是某种数据源的一个视图，数据源可以是一个数组，Java容器或I/O channel等。
 * 为函数式编程而生。对stream的任何修改都不会修改背后的数据源，比如对stream执行过滤操作并不会删除被过滤的元素，而是会产生一个不包含被过滤元素的新stream。
 * 惰式执行。stream上的操作并不会立即执行，只有等到用户真正需要结果的时候才会执行。
 * 可消费性。stream只能被“消费”一次，一旦遍历过就会失效，就像容器的迭代器那样，想要再次遍历必须重新生成。
 * 对stream的操作分为为两类，中间操作(intermediate operations)和结束操作(terminal operations)，二者特点是：
 * <p>
 * 中间操作总是会惰式执行，调用中间操作只会生成一个标记了该操作的新stream，仅此而已。
 * 结束操作会触发实际计算，计算发生时会把所有中间操作积攒的操作以pipeline的方式执行，这样可以减少迭代次数。计算完成之后stream就会失效。
 */
public class Test {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
//        test5();
//        test6();
//        test7();
//        test8();
        test9();
    }

    /**
     * 函数原型为Stream<T> filter(Predicate<? super T> predicate)，作用是返回一个只包含满足predicate条件元素的Stream。
     */
    public static void test1() {
        // 保留长度等于3的字符串
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        stream.filter(string -> string.length() == 3).forEach(string -> System.out.println("filter==" + string));

    }

    /**
     * 我们对forEach()方法并不陌生，在Collection中我们已经见过。方法签名为void forEach(Consumer<? super E> action)，
     * 作用是对容器中的每个元素执行action指定的动作，也就是对元素进行遍历。
     */
    public static void test2() {
        // 保留长度等于3的字符串
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        stream.forEach(string -> System.out.println("testForEach==" + string));

    }

    /**
     * 函数原型为Stream<T> distinct()，作用是返回一个去除重复元素之后的Stream
     */
    public static void test3() {
        Stream<String> stream = Stream.of("I", "love", "you", "too", "too");
        stream.distinct()
                .forEach(str -> System.out.println(str));
    }

    /**
     * 函数原型为<R> Stream<R> map(Function<? super T,? extends R> mapper)，
     * 作用是返回一个对当前所有元素执行执行mapper之后的结果组成的Stream。
     * 直观的说，就是对每个元素按照某种操作进行转换，转换前后Stream中元素的个数不会改变，
     * 但元素的类型取决于转换之后的类型。
     */
    public static void test4() {
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        stream.map(str -> str.toUpperCase())
                .forEach(str -> System.out.println(str));
    }

    /**
     * 函数原型为<R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper)，
     * 作用是对每个元素执行mapper指定的操作，并用所有mapper返回的Stream中的元素组成一个新的Stream作为最终返回结果。
     * 说起来太拗口，通俗的讲flatMap()的作用就相当于把原stream中的所有元素都"摊平"之后组成的Stream，
     * 转换前后元素的个数和类型都可能会改变。
     */
    public static void test5() {
        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4, 5));
        stream.flatMap(list -> list.stream())
                .forEach(i -> System.out.println(i));
    }

    public static void test6() {
        List list = new ArrayList();
        list.add("i");
        list.add("love");
        list.add("YOU");
        list.add("TOO");
        Stream<String> stream = list.stream();
        stream.map(str -> str.toUpperCase()).forEach(str -> System.out.println(str));
        System.out.println(list.toString());
    }

    public static void test7() {
        Stream<String> stream = Stream.of("I", "love", "you", "tooo");
        Optional<String> longest = stream.reduce((s1, s2) -> s1.length() >= s2.length() ? s1 : s2);
//Optional<String> longest = stream.max((s1, s2) -> s1.length()-s2.length());
        System.out.println(longest.get());
    }

    public static void test8() {
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        Integer lengthSum = stream.reduce(1, (sum1, str) -> sum1 + str.length(),
                (a, b) -> a + b);
// int lengthSum = stream.mapToInt(str -> str.length()).sum();
        System.out.println(lengthSum);
    }

    public static void test9() {
        Map<Boolean, List<Integer>> collectParti = Stream.of(1, 2, 3, 4)
                .collect(Collectors.partitioningBy(it -> it % 2 == 0));
        System.out.println("collectParti : " + collectParti);
// 打印结果
// collectParti : {false=[1, 3], true=[2, 4]}

    }

    private void test10(){
    }

}
