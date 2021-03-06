package com.test;

/**
 * 功能性接口两种实现方式
 */
public class Test {

    public static void main(String[] args) {
        // 通过匿名内部类调用
        WorkerInterface work = new WorkerInterface() {
            @Override
            public void doWork() {
                System.out.println("通过匿名内部类调用");
            }
        };
        work.doWork();

        // 通过 Lambda 表达式调用
        // Lambda 表达式实际上是一个对象。
        // 我们可以将 Lambda 表达式赋值给一个变量，就可像其它对象一样调用。
        work = () -> System.out.println("通过 Lambda 表达式调用");
        work.doWork();
    }
}
