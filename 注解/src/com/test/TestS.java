package com.test;

import org.junit.Test;

import java.lang.annotation.*;

/**
 * Created by liuzhouliang on 2018/8/8.
 * 关于注解支持的元素数据类型除了上述的String，还支持如下数据类型
 * <p>
 * 所有基本类型（int,float,boolean,byte,double,char,long,short）
 * <p>
 * String
 * <p>
 * Class
 * <p>
 * enum
 * <p>
 * Annotation
 * <p>
 * 上述类型的数组
 * <p>
 * 倘若使用了其他数据类型，编译器将会丢出一个编译错误，注意，声明注解元素时可以使用基本类型但不允许使用任何包装类型，同时还应该注意到注解也可以作为元素的类型，也就是嵌套注解，
 * <p>
 * 注解是不支持继承的，因此不能使用关键字extends来继承某个@interface，但注解在编译后，编译器会自动继承java.lang.annotation.Annotation接口
 * <p>
 * 请记住，即使Java的接口可以实现多继承，但定义注解时依然无法使用extends关键字继承@interface。
 */
@Documented
@Target(value = {ElementType.METHOD, ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface TestS {
    //枚举类型===============
    enum Status {
        FIXED, NORMAL
    }

    ;

    //声明枚举
    Status status() default Status.FIXED;

    //布尔类型
    boolean showSupport() default false;

    //String类型
    String name() default "";
    String age() default "";

    //class类型
    Class<?> testCase() default Void.class;

    //注解嵌套===================
    Reference reference() default @Reference(next = true);

    //数组类型
    long[] value();

}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Reference {
    boolean next() default false;
}
