package com.test;

import java.lang.annotation.*;

/**
 * Created by liuzhouliang on 2018/8/8.
 * <p>
 * 元注解@Repeatable
 * <p>
 * 元注解@Repeatable是JDK1.8新加入的，它表示在同一个位置重复相同的注解。在没有该注解前，一般是无法在同一个类型上使用相同的注解的
 */
public class Test {


    //使用Java8新增@Repeatable原注解
    @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    @Repeatable(FilterPaths.class)//参数指明接收的注解class
    public @interface FilterPath {
        String value();
    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @interface FilterPaths {
        FilterPath[] value();
    }

    //使用案例
    @FilterPath("/web/update")
    @FilterPath("/web/add")
    @FilterPath("/web/delete")
    class AA {
    }
}
