package com.test;

/**
 * Created by liuzhouliang on 2018/8/23.
 */
public class Art {
    public  String aa="来自Art";
    Art() {
        System.out.println("Art===构造方法");//2
        System.out.println("Art中执行==="+getClass().getName());
    }
    public void test()
    {
        System.out.println("调用Art test()===========");
    }
    public void test2()
    {
        System.out.println("调用Art test2()===========");
    }

}
