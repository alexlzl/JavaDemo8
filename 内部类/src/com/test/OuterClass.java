package com.test;

/**
 * Created by liuzhouliang on 2018/8/29.
 */
public class OuterClass {
    static int k = printI();

    static int printI() {
        System.out.println("Inner class is loading before " +
                "creating OuterClass instance!");
        return InnerClass.i;
    }

    OuterClass() {
        System.out.println("static k is " + k);
        System.out.println("OuterClass constructor");
    }

    /**
     * 对于java类加载顺序我们知道，首先加载类，执行static变量初始化，接下来执行对象的创建，如果我们要执行代码中的变量i初始化，
     * 那么必须先执行加载OuterClass，再加载Innerclass，最后初始化静态变量i，
     * 问题就出在加载Innerclass上面，我们可以把InnerClass看成OuterClass的非静态成员，
     * 它的初始化必须在外部类对象创建后以后进行，要加载InnerClass必须在实例化OuterClass之后完成
     * ，java虚拟机要求所有的静态变量必须在对象创建之前完成，这样便产生了矛盾。
     */
    class InnerClass {
        private static final int i = 1;
//        private static int ii;编译异常
        InnerClass(){
            System.out.println("内部类初始化==");
        }

         {
            System.out.println("内部类===静态块");
        }
    }


}
