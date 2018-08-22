package com.test;

/**
 * Created by liuzhouliang on 2018/8/22.
 */
public class Test2 {
    public static void main(String[] args) {
        com(String.class);
    }

    /**
     * 不使用instanceof 判断是否是同一种类型,
     * 判断目标类型和源类型的字节码对象(Class)是否是同一种类型
     * 通过class类的toString 方法,判断打印出来的类型是否相等,或者直接判断
     *
     * @param t
     */
    public static<T> void com(Class<T>	t){//泛型方法
        String string = new String();
        if(string.getClass().equals(t)){
            //if(string.getClass().toString().equals(t.toString())){ //或者 toString()

            System.out.println(true);
        }else System.out.println(false);

        //System.out.println((new String()) instanceof String);
    }

}
