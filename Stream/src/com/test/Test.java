package com.test;

import java.util.stream.Stream;

/**
 * Created by liuzhouliang on 2018/10/24.
 * <p>
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
 * 如果你熟悉Apache Spark RDD，对stream的这个特点应该不陌生。
 */
public class Test {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        stream.forEach(str -> System.out.println(str));
    }

}
