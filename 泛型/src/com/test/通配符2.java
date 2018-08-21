package com.test;

/**
 * Created by liuzhouliang on 2018/8/16.
 * <p>
 * 泛型的上下边界添加，必须与泛型的声明在一起 。
 */
public class 通配符2 implements InterfaceF{
    //在泛型方法中添加上下边界限制的时候，必须在权限声明与返回值之间的<T>上添加上下边界，即在泛型声明的时候添加
//public <T> T showKeyName(Generic<T extends Number> container)，编译器会报错："Unexpected bound"
    public <T extends Number> T showKeyName(Generic<T> container) {
        System.out.println("container key :" + container.getKey());
        T test = container.getKey();
        return test;
    }

    @Override
    public Object next() {
        return null;
    }
}
