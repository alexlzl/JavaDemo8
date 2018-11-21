package com.test;

/**
 * @FunctionalInterface 是在 Java 8 中添加的一个新注解，用于指示接口类型，声明接口为 Java 语言规范定义的功能接口。
 * Java 8 还声明了 Lambda 表达式可以使用的功能接口的数量。当您注释的接口不是有效的功能接口时， @FunctionalInterface 会产生编译器级错误。
 */
@FunctionalInterface
public interface WorkerInterface {

    void doWork();
}
