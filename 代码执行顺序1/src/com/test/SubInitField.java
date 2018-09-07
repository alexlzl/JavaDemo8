package com.test;

/**
 * Created by liuzhouliang on 2018/8/31.
 */
class SubInitField extends SuperInitField {
    public SubInitField() {
        System.out.println("child");
    }
    static {
        System.out.println("static child");
    }
}
