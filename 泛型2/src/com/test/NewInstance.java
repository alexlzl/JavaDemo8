package com.test;

/**
 * Created by liuzhouliang on 2018/8/22.
 * <p>
 * 泛型中不允许使用new T()这样创建新的对象,但是我们可用使用其他方法创建,
 * 第一种时使用newInstance(),这种方法必须保证有默认的构造函数;
 * 另一种是构造一个工厂对象,由工厂生成对象.
 * 由上面的例子中可以看出来,java.lang.Strin创建成功了,但是java.lang.Integerque创建失败,
 * 抛出了java.lang.InstantiationException异常,
 * 这是以为Integer的构造函数时必须有一个整型参数,这就是newInstance()的局限性,只能创建有无参构造函数的类的对象.
 */
public class NewInstance {
    public <T> T createInstance(Class<T> type) {
        try {
            T obj = type.newInstance();
            System.out.println("create sucessfully. type:" + type.getName());
            return obj;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("create failed. type:" + type.getName());
        return null;
    }

    public static void main(String[] args) {
        NewInstance newInstance = new NewInstance();
        newInstance.createInstance(String.class);
        newInstance.createInstance(Integer.class);
    }
}
