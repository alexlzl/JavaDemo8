package com.test;

import java.security.PublicKey;

/**
 * Created by liuzhouliang on 2018/8/30.
 * <p>
 * http://www.cnblogs.com/ivanfu/archive/2012/02/12/2347817.html
 * <p>
 * 装载
 * 连接
 * 初始化
 * 其中装载阶段又三个基本动作组成：
 * <p>
 * 通过类型的完全限定名，产生一个代表该类型的二进制数据流
 * 解析这个二进制数据流为方法区内的内部数据结
 * 构创建一个表示该类型的java.lang.Class类的实例
 * 另外如果一个类装载器在预先装载的时遇到缺失或错误的class文件，它需要等到程序首次主动使用该类时才报告错误。
 * <p>
 * <p>
 * <p>
 * 连接阶段又分为三部分：
 * <p>
 * 验证，确认类型符合Java语言的语义，检查各个类之间的二进制兼容性(比如final的类不用拥有子类等)，另外还需要进行符号引用的验证。
 * 准备，Java虚拟机为类变量分配内存，设置默认初始值。
 * 解析(可选的) ，在类型的常量池中寻找类，接口，字段和方法的符号引用，把这些符号引用替换成直接引用的过程。
 * <p>
 * <p>
 * 　　当一个类被主动使用时，Java虚拟就会对其初始化，如下六种情况为主动使用：
 * <p>
 * 当创建某个类的新实例时（如通过new或者反射，克隆，反序列化等）
 * 当调用某个类的静态方法时
 * 当使用某个类或接口的非常量静态字段时
 * 当调用Java API中的某些反射方法时，比如类Class中的方法，或者java.lang.reflect中的类的方法时
 * 当初始化某个子类时
 * 当虚拟机启动某个被标明为启动类的类（即包含main方法的那个类）
 * Java编译器会收集所有的类变量初始化语句和类型的静态初始化器，将这些放到一个特殊的方法中：clinit。
 */
public class A {
    public static int age = getAge();
    public static final  int age1=100;
    public static int age2;
    public static Inner inner=getInner();

    static {
        System.out.println("执行静态块========");
    }

    {
        System.out.println("执行非静态块========");
    }

    public static int getAge() {
        System.out.println("执行静态变量初始化========");
        return 100;
    }

    public static Inner getInner() {
        return inner;
    }

    public static void testM(){
        int a=getInt();

    }
    public static int getInt(){
        System.out.println("静态方法执行变量初始化1111111111111111111");
        return 10000000;
    }

    public static class Inner{
        public static int a=getA();
        public static int getA(){
            System.out.println("初始化内部类静态变量-----------------");
            return  10001;
        }
    }
}
