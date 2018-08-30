package com.test;

/**
 * Created by liuzhouliang on 2018/8/30.
 * <p>
 * 总结：只要按照这个步骤，遇到这一类问题就可以解决了。
 * <p> * <p>
 * <p> * 　　　　  1-3：类加载过程，不涉及构造方法
 * <p>
 * 　　　　1-5: 实例化过程，涉及构造方法
 * <p>
 * 　　1.类中所有属性的默认值（一举而成）
 * <p>
 * 　　2. 父类静态属性初始化，静态块，静态方法的声明（按出现顺序执行）
 * <p>
 * 　　3. 子类静态属性初始化，静态块，静态方法的声明 （按出现顺序执行）
 * <p>
 * 　　4.  调用父类的构造方法，
 * <p>
 * 　　　　　　首先父类的非静态成员初始化，构造块，普通方法的声明（按出现顺序执行）
 * <p>
 * 　　　　　　然后父类构造方法
 * <p>
 * 　　5.  调用子类的构造方法，
 * <p>
 * 　　　　　　首先子类的非静态成员初始化，构造块，普通方法的声明（按出现顺序执行）
 * <p>
 * 　　　　　　然后子类构造方法
 */
public class Parent {
    Parent() {
        System.out.println("parent===========构造函数");
    }

    static {
        System.out.println("parent===========静态块1");
    }

    public String parentStr = getParentStr();
    public static int parentInt = getParentInt();

    public String getParentStr() {
        System.out.println("parent===========初始化实例变量");
        return "parent字符串===";
    }

    static {
        System.out.println("parent===========静态块2");
    }

    public static int getParentInt() {
        System.out.println("parent===========初始化静态变量");
        return 1001;
    }

    {
        System.out.println("parent===========非静态块");
    }
}
