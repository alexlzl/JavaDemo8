package com.test;

import java.util.Arrays;

/**
 * Created by liuzhouliang on 2018/8/22.
 * <p>
 * 在这个例子中,我们可用使用T调用HashF的sayHello()方法,
 * 编译器并没有把泛型参数类型完全擦除,而是保留了部分信息,
 * 这就是擦除的边界.这里重用了extends关键字,T为HashF或者HashF的子类,使T具有了HashF的动作.
 */
public class 擦除边界 {
    public static void main(String[] args) {
        HoldHashF<HashF> mulHashF = new HoldHashF<>(new HashF());
        System.out.println(Arrays.toString(mulHashF.getClass().getTypeParameters()));
    }

    static class HashF {
        public void sayHello() {
            System.out.println("hello, this is HashF");
        }
    }

    static class HoldHashF<T extends HashF> {
        private T hello;

        public HoldHashF(T hello) {
            this.hello = hello;
            this.hello.sayHello();
        }


    }
}
