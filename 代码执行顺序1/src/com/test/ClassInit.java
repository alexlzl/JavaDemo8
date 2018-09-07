package com.test;

/**
 * Created by liuzhouliang on 2018/8/31.
 */
public class ClassInit {
    public static String dd = "ClassInit static field.";
    static
    {
        System.out.println(dd);
    }
    public static void main(String[] args) {
        SuperInitField p = new SuperInitField();
        SuperInitField c = new SubInitField();
        //SuperInitField p = new SuperInitField();
    }
}
