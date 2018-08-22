package com.test;

/**
 * Created by liuzhouliang on 2018/8/22.
 * 之前描述了泛型不能使用instanceof,因为类型擦除,但是可用动态的调用isInstance(),具体请看如下的例子:
 */
public class Isinstance<T> {
    private Class<T> type;

    public Isinstance(Class<T> type) {
        this.type = type;
    }

    private boolean equalType(Object arg) {
        return type.isInstance(arg);
    }

    public static void main(String[] args) {
        Isinstance<Integer> isinstance = new Isinstance<>(Integer.class);

        System.out.println(isinstance.equalType(new Integer(1)));//true
        System.out.println(isinstance.equalType(new String("11")));//false
    }
}
