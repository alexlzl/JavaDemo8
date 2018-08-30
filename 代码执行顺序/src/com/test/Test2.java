package com.test;

/**
 * Created by liuzhouliang on 2018/8/30.
 * <p>
 * （注意：类加载过程中，可能调用了实例化过程（因为static可以修饰方法，属性，代码块，内部类），
 * 此时则会暂停类加载过程而先执行实例化过程（被打断），
 * 执行结束再进行类加载过程，下面就是典型的暂停类加载。
 */
public class Test2 {
    public static int age = getAge();
    public static Test2 test = new Test2("第二次构造对象");//在加载类的过程中，如果遇到静态变量是对象的创建，会暂停类的加载，完成创建对象
    public int i = print("i");

    //    public static int n = 99;
//    public int j = print("j");
//    static {
//        print("静态块");
//    }
//
//    {
//        print("构造块");
//    }
    public Test2(String type) {
        System.out.println("Test2构造方法===" + type);
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2("第一次构造对象");
    }

    public static int getAge() {
        System.out.println("静态属性初始化===");
        return 190;
    }

    public int print(String str) {
        System.out.println("实例属性初始化===");
        return 1001;
    }

}
