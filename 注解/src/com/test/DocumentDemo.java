package com.test;

import java.lang.annotation.*;
import java.util.Arrays;

/**
 * Created by liuzhouliang on 2018/8/8.
 */

/**
 * @Inherited 可以让注解被继承，但这并不是真的继承，只是通过使用@Inherited，可以让子类Class对象使用getAnnotations()获取父类被@Inherited修饰的注解，如下：
 */
@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface DocumentA {
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface DocumentB {
}

@DocumentA
class A {
}

/**
 * A:@com.test.DocumentA()
 * an:[@com.test.DocumentA(), @com.test.DocumentB()]
 * an2:[@com.test.DocumentB()]
 * b:true
 */
//继承了A类
@DocumentB
public class DocumentDemo extends A {

    public static void main(String... args) {

        Class<?> clazz = DocumentDemo.class;
        //根据指定注解类型获取该注解
        DocumentA documentA = clazz.getAnnotation(DocumentA.class);
        System.out.println("A:" + documentA);

        //获取该元素上的所有注解，包含从父类继承
        Annotation[] an = clazz.getAnnotations();
        System.out.println("an:" + Arrays.toString(an));
        //获取该元素上的所有注解，但不包含继承！
        Annotation[] an2 = clazz.getDeclaredAnnotations();
        System.out.println("an2:" + Arrays.toString(an2));

        //判断注解DocumentA是否在该元素上
        boolean b = clazz.isAnnotationPresent(DocumentA.class);
        System.out.println("b:" + b);

        /**
         * 执行结果:
         A:@com.zejian.annotationdemo.DocumentA()
         an:[@com.zejian.annotationdemo.DocumentA(), @com.zejian.annotationdemo.DocumentB()]
         an2:@com.zejian.annotationdemo.DocumentB()
         b:true
         */
    }
}
