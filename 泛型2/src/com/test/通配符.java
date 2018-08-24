package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by liuzhouliang on 2018/8/24.
 * <p>
 * "T"是定义类或方法时声明的东西，"?"是调用时传入的东西，二者是不同的概念。
 * <p>
 * https://blog.mimvp.com/article/16134.html
 * <p>
 * 所以，通配符的出现是为了指定泛型中的类型范围。
 * <p>
 * 通配符有 3 种形式。
 * <p>
 * <?> 被称作无限定的通配符。
 * <? extends T> 被称作有上限的通配符。
 * <? super T> 被称作有下限的通配符。
 */
public class 通配符<T> {


    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();
//        list.add("hello");    //ERROR
//        list.add(111);    //ERROR
    }

    public <M> void test(通配符<? extends M> p) {

    }

    /**
     * "T"是定义类或方法时声明的东西，"?"是调用时传入的东西，二者是不同的概念。
     * <p>
     * Class<T>在实例化的时候，T要替换成具体类
     * Class<?>它是个通配泛型，?可以代表任何类型
     * <p>
     * <? extends T>受限统配，表示T的一个未知子类
     * <? super T>下限统配，表示T的一个未知父类
     *
     * @param collection
     * @param <TT>
     */

    public <TT> void printCollecton(Collection<? extends TT> collection) {
        for (Object obj : collection) {
            System.out.println(obj);
        }
    }

    interface Dao<q> {
        List<q> getList();
    }

}
