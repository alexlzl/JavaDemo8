package com.test;

/**
 * Created by liuzhouliang on 2018/8/30.
 * <p>
 * 1、 如果类存在直接父类的话，且直接父类还没有被初始化，则先初始化其直接父类
 * 2、 如果类存在一个初始化方法，就执行此方法
 *
 * 类会在首次被“主动使用”时执行初始化，为类（静态）变量赋予正确的初始值。在Java代码中，一个正确的初始值是通过类变量初始化语句或者静态初始化块给出的。而我们这里所说的主动使用 包括：
 * 1. 创建类的实例
 * 2. 调用类的静态方法
 * 3. 使用类的非常量静态字段
 * 4. 调用Java API中的某些反射方法
 * 5. 初始化某个类的子类
 * 6. 含有main()方法的类启动时
 * <p>
 * 实际上，static块的执行发生在“初始化”的阶段。初始化阶段，jvm主要完成对静态变量的初始化，静态块执行等工作。
 * <p>
 * 下面我们看看执行static块的几种情况：
 * <p>
 * 1、第一次new A()的过程会打印""；因为这个过程包括了初始化
 * <p>
 * 2、第一次Class.forName("A")的过程会打印""；因为这个过程相当于Class.forName("A",true,this.getClass().getClassLoader());
 * <p>
 * 3、第一次Class.forName("A",false,this.getClass().getClassLoader())的过程则不会打印""。因为false指明了装载类的过程中，不进行初始化。不初始化则不会执行static块。
 */
public class B {
    public static void main(String[] args) {
//        int age = A.age;
//        int age1=A.age1;//调用静态常量不会引起类加载
//        int age2 = A.age2;
        try {
//            Class<A> aClass = (Class<A>) Class.forName("com.test.A", false, B.class.getClassLoader());//加载了类没有进行了初始化
//            try {
//                A a=aClass.newInstance();
//                System.out.println("静态变量未初始化=========="+a.age1);
//            } catch (InstantiationException e) {
//                e.printStackTrace();
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
            Class.forName("com.test.A",true,B.class.getClassLoader());//加载了类并且进行了初始化
//            Class.forName("com.test.A");//加载了类并且进行了初始化
//            A a=new A();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
