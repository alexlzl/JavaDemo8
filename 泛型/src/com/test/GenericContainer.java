package com.test;

/**
 * Created by liuzhouliang on 2018/8/21.
 */
public class GenericContainer<T> {
    private T obj;

    public GenericContainer() {
    }

    // Pass type in as parameter to constructor
    public GenericContainer(T t) {
        obj = t;
    }

    /**
     * @return the obj
     */
    public T getObj() {
        return obj;
    }

    /**
     * @param
     */
    public void setObj(T t) {
        obj = t;
    }

    public static  <T> void  main(String[] args) {
        //如果没有声明泛型类参数类型，仍然要进行强转
        GenericContainer genericContainer = new GenericContainer<String>();
        genericContainer.setObj("abc");
        String s = (String) genericContainer.getObj();
//        String ss =  genericContainer.getObj();
        GenericContainer<String> genericContainer1 = new GenericContainer();
        genericContainer1.setObj("abc");
//        genericContainer1.setObj(1);编译异常
        String s1 = genericContainer1.getObj();
    }
}
