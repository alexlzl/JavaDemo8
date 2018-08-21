package com.test;

/**
 * Created by liuzhouliang on 2018/8/17.
 */
public class Test2 {
    public Class<?> clazz;
//    public Class<T> clazz;
    public static <T> T createInstance(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Fruit fruit = createInstance(Fruit.class);
        People people = createInstance(People.class);
    }


}
