package com.test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by liuzhouliang on 2018/8/22.
 */
public class 获取泛型类型 {
    public static void main(String[] args) {
        So so = new So();
        Class c = so.getClass();
        //获取c的父类
        Type type = c.getGenericSuperclass();
        /*
         * 判断type是否属于ParameterizedType的实例
		 * 若是则强转
		 * ParameterizedType可以得到泛型的类型
		 */
        if (type instanceof ParameterizedType) {
            ParameterizedType pType = (ParameterizedType) type;
            Type[] types = pType.getActualTypeArguments();
            System.out.println(types[0].getTypeName());//java.lang.String

            System.out.println(types[1].getTypeName());// java.lang.Integer
        }
    }

}

class Fa<T1, T2> {
}

class So extends Fa<String, Integer> {
}