package com.test;

/**
 * Created by liuzhouliang on 2018/8/24.
 * <p>
 * new指令开辟空间，用于存放对象的各个属/性引用等，反编译字节码你会发现只有一个new指令，
 * 所以开辟的是一块空间，一块空间就放一个对象。
 * 然后，子类调用父类的属性，方法啥的，那并不是一个实例化的对象。
 * 在字节码中子类会有个u2类型的父类索引，属于CONSTANT_Class_info类型，
 * 通过CONSTANT_Class_info的描述可以找到CONSTANT_Utf8_info,然后可以找到指定的父类啊啥的。
 * 你的方法啊，属性名称都是在这个上面解析出来的，然后实际变量内容存储在new出来的空间那里。。。
 * super这个关键字只不过是访问了这个空间特定部分的数据（也就是专门存储父类数据的内存部分）
 * 。。。。。。默认的hashcode和equals（直接使用的==比较）都是一样的，所以，这根本就在一个空间里，也不存在单独的出来的父类对象。
 * <p>
 */
public class Child extends Parent {
    public Child() {
        System.out.println("Child====hashCode===========" + hashCode());
        System.out.println(super.equals(this));
    }

    public static void main(String[] args) {
        /**
         * Parent====hashCode===========1163157884
         Child====hashCode===========1163157884
         true
         */
        Child child = new Child();
    }
}
