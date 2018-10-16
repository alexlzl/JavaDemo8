/**
 * Created by liuzhouliang on 2018/10/15.
 */
/*
* 函数式接口
*
* 方法引用的唯一用途是支持Lambda的简写。

方法引用提高了代码的可读性，也使逻辑更加清晰。（优点）
* */
interface StringFunc1 {
    String func(String n);
}

class MyStringOps1 {
    //普通方法： 反转字符串
    public String strReverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

public class Test3 {
    public static String stringOp(StringFunc1 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "lambda add power to Java";
        MyStringOps1 strOps = new MyStringOps1();//实例对象
        //MyStringOps::strReverse 相当于实现了接口方法func() ，并在接口方法func()中作了MyStringOps.strReverse()操作
        String outStr = stringOp(strOps::strReverse, inStr);

        System.out.println("Original string: " + inStr);
        System.out.println("String reserved: " + outStr);
    }
}

