package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by liuzhouliang on 2018/8/22.
 *
 * 类型擦除=========================================
 */
public class Test {
    public static void main(String[] args) {
        //声明不同类型的list
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        //查看他们的类型
        System.out.println(list1.getClass() == list2.getClass());//true
        /**
         * getTypeParameters()将返回一个TypeVariable的数组,表示有泛型声明的的表示的类型参数,如上面看到的,
         * 只能用作参数占位符的标识符,并非有用的信息.
         *
         *  在泛型代码内部,无法获取任何有关泛型参数类型的信息.
         *
         *  总结:Java泛型时使用擦除来实现的,这意味着当你使用泛型时,任何具体的类型信息都被擦除了,
         *  你唯一知道的就是你正在使用一个对象,在运行时被擦除成"原声"的类型.
         *  因此List<String>和List<Integer>在运行时事实上时相同的类型,这两种形式都被擦除成他们原生的类型,即List.
         */
        Glass glass = new Glass();
        SunGlass<Integer> sunGlass = new SunGlass();
        MulGlass<Integer, String> mulGlass = new MulGlass();
        System.out.println(Arrays.toString(glass.getClass().getTypeParameters()));//[]
        System.out.println(Arrays.toString(sunGlass.getClass().getTypeParameters()));//[A]
        System.out.println(Arrays.toString(mulGlass.getClass().getTypeParameters()));//[C, T]

        List<Integer> list=new ArrayList<>();
       if(list instanceof List){
           System.out.println("=============");
       }
    }

    static class Glass {

    }

    static class SunGlass<A> {

    }

    static class MulGlass<C, T> {

    }

    class LostInfo {

    }
}
