package com.test;

/**
 * Created by liuzhouliang on 2018/8/23.
 * <p>
 * Art
 * com.test.Cartoon
 * Drawing
 * com.test.Cartoon
 * Cartoon
 * com.test.Cartoon
 */
public class Cartoon extends Drawing {
    public  String aa="来自cartoon";
    Cartoon() {
        System.out.println("Cartoon===构造方法");
        System.out.println("Cartoon中执行==" + getClass().getName());
    }

    public void test5() {
        System.out.println("Print Cartoon5");
    }

    public void test6() {
        System.out.println("Print Cartoon6");
    }
    public void test()
    {
        System.out.println("调用Cartoon重写test");
    }
    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
        System.out.println("创建完Cartoon======");
        Drawing drawing = new Drawing();
        System.out.println("创建完Drawing======");
        Art art = new Art();
        System.out.println("创建完Art======");
        cartoon.test();
        cartoon.test3();
        Drawing one = (Drawing) cartoon;
//        one的test5()、test6()的方法都没有了
//        one.test5();//出现报错，表示存在test5
        System.out.println("-----------------------------111");
        Art two = (Art) cartoon;//two只有test（）和test2（）这两个方法，test3()...test()6的方法都没有了
        two.test();
        two.test2();//调用父类型的方法
        System.out.println("变量调用========="+two.aa);//变量调用=========来自Art
        if (one == two) {
            //执行该语句
            System.out.println("one == two");
        } else {
            System.out.println("!=");
        }

        if (cartoon == two) {
            //执行该语句
            System.out.println("cartoon == two");
        } else {
            System.out.println("!=");
        }
        /**
         * 三个引用指向同一个内存地址
         * com.test.Cartoon@4554617c
         * com.test.Cartoon@4554617c
         * com.test.Cartoon@4554617c
         */
        System.out.println(cartoon.toString());
        System.out.println(one.toString());
        System.out.println(two.toString());
    }
}
