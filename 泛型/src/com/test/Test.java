package com.test;

import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuzhouliang on 2018/8/14.
 * <p>
 * 通过上面的例子可以证明，在编译之后程序会采取去泛型化的措施。
 * 也就是说Java中的泛型，只在编译阶段有效。
 * 在编译过程中，正确检验泛型结果后，会将泛型的相关信息擦出，并且在对象进入和离开方法的边界处添加类型检查和类型转换的方法。
 * 也就是说，泛型信息不会进入到运行时阶段。
 * <p>
 * 对此总结成一句话：泛型类型在逻辑上看以看成是多个不同的类型，实际上都是相同的基本类型
 */
public class Test {

    public static void main(String[] args) {
        List<String> stringArrayList = new ArrayList<String>();
        List<Integer> integerArrayList = new ArrayList<Integer>();

        Class classStringArrayList = stringArrayList.getClass();
        Class classIntegerArrayList = integerArrayList.getClass();

        if (classStringArrayList.equals(classIntegerArrayList)) {
            System.out.println("泛型测试类型相同====");
        }
        test3(test2());
    }

    public <t> void  test(Class<t> tClass){}

    public void test1(Class<?> c){}

    public static String test2(){
        return "test";
    }

    public static void test3(String s){

    }
}
