package com.test;

/**
 * Created by liuzhouliang on 2018/8/16.
 */
public class 通配符 {
    public static void main(String[] args) {
        Generic<Integer> gInteger = new Generic<Integer>(123);
        Generic<Number> gNumber = new Generic<Number>(456);

        showKeyValue1(gNumber);
//        showKeyValue(gInteger);
// showKeyValue这个方法编译器会为我们报错：Generic<java.lang.Integer>
// cannot be applied to Generic<java.lang.Number>
// showKeyValue(gInteger);

        Generic<String> generic1 = new Generic<String>("11111");
        Generic<Integer> generic2 = new Generic<Integer>(2222);
        Generic<Float> generic3 = new Generic<Float>(2.4f);
        Generic<Double> generic4 = new Generic<Double>(2.56);

//这一行代码编译器会提示错误，因为String类型并不是Number类型的子类
//        showKeyValue1(generic1);

        showKeyValue2(generic2);
        showKeyValue2(generic3);
        showKeyValue2(generic4);
    }

    public static void showKeyValue1(Generic<Number> obj) {
        System.out.println("泛型测试" + "key value is " + obj.getKey());
    }

    public static void showKeyValue2(Generic<? extends Number> obj) {
        System.out.println("泛型测试" + "key value is " + obj.getKey());
    }
}
