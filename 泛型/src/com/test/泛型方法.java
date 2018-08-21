package com.test;

/**
 * Created by liuzhouliang on 2018/8/16.
 * 从结果中我们可以看到，这两种方法的结果是完全一样的，但他们还有些区别的，区别如下：
 * 方法一，可以像普通方法一样，直接传值，任何值都可以（但必须是派生自Object类的类型，比如String,Integer等），函数会在内部根据传进去的参数来识别当前T的类别。但尽量不要使用这种隐式的传递方式，代码不利于阅读和维护。因为从外观根本看不出来你调用的是一个泛型函数。
 * 方法二，与方法一不同的地方在于，在调用方法前加了一个<String>来指定传给<T>的值，如果加了这个<String>来指定参数的值的话，那StaticMethod（）函数里所有用到的T类型也就是强制指定了是String类型。这是我们建议使用的方式。
 * 同样，常规泛型函数的使用也有这两种方式：
 */
public class 泛型方法 {

    public static void main(String[] args) {
        //静态方法
        StaticFans.StaticMethod("adfdsa");//使用方法一
        StaticFans.<String>StaticMethod("adfdsa");//使用方法二

//常规方法
        StaticFans staticFans = new StaticFans();
        staticFans.OtherMethod(new Integer(123));//使用方法一
        staticFans.<Integer>OtherMethod(new Integer(123));//使用方法二
    }
}
