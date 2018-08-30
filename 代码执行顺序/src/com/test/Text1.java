package com.test;

/**
 * Created by liuzhouliang on 2018/8/30.
 * <p>
 * 1:j   i=0    n=0
 * 2:构造块   i=1    n=1
 * 3:t1   i=2    n=2
 * 4:j   i=3    n=3
 * 5:构造块   i=4    n=4
 * 6:t2   i=5    n=5
 * 7:i   i=6    n=6
 * 8:静态块   i=7    n=99
 * 9:j   i=8    n=100
 * 10:构造块   i=9    n=101
 * 11:init   i=10    n=102
 * <p>
 * <p>
 * （注意：类加载过程中，可能调用了实例化过程（因为static可以修饰方法，属性，代码块，内部类），
 * 此时则会暂停类加载过程而先执行实例化过程（被打断），
 * 执行结束再进行类加载过程，下面就是典型的暂停类加载。
 */
public class Text1 {
    public static int k = 0;
    public static Text1 t1 = new Text1("t1");
    public static Text1 t2 = new Text1("t2");
    public static int i = print("i");
    public static int n = 99;
    public int j = print("j");

    static {
        print("静态块");
    }

    {
        print("构造块");
    }


    public Text1(String str) {
        System.out.println((++k) + ":" + str + "   i=" + i + "    n=" + n);
        ++i;
        ++n;
    }

    public static int print(String str) {
        System.out.println((++k) + ":" + str + "   i=" + i + "    n=" + n);
        ++n;
        System.out.println("i=="+i);
        return ++i;
    }

    public static void main(String args[]) {
        Text1 t = new Text1("init");
    }
}
