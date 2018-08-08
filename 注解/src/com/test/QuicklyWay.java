package com.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by liuzhouliang on 2018/8/8.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface IntegerVaule {
    int value() default 0;
    int value1() default 0;
    String name() default "";
}

public class QuicklyWay {
    //当只想给value赋值时,可以使用以下快捷方式
    @IntegerVaule(20)
    public int age;

    //当name也需要赋值时必须采用key=value的方式赋值
    @IntegerVaule(value = 10000, name = "MONEY")
    public int money;
}
