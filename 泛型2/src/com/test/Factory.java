package com.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liuzhouliang on 2018/8/22.
 * 使用工厂对象的方法具体怎么创建一个类的对象是有用户自己控制的,没有newInstance()的条件限制,用户可用根据自己的需求编写不同类型的工厂.
 */
public class Factory {
    Map<Class, IFatory> factoryMap = new HashMap<>();

    public void addFactory(Class type, IFatory fatory) {
        factoryMap.put(type, fatory);
    }

    public <T> T createInstance(Class<T> type) {
        IFatory<T> factory = factoryMap.get(type);
        T item = factory.newInstance();
        return item;
    }

    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.addFactory(Integer.class, new IntegerFactory());
        factory.addFactory(String.class, new StringFactory());

        Integer intValue = factory.createInstance(Integer.class);
        System.out.println(intValue.toString());
        String stringValue = factory.createInstance(String.class);
        System.out.println(stringValue.toString());
    }
}

//接口
interface IFatory<T> {
    T newInstance();
}

//Integer工厂
class IntegerFactory implements IFatory<Integer> {

    @Override
    public Integer newInstance() {
        return new Integer(0);
    }
}

//String工厂
class StringFactory implements IFatory<String> {

    @Override
    public String newInstance() {
        return String.valueOf("hello word");
    }
}