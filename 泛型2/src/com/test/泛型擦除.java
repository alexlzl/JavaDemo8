package com.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuzhouliang on 2018/8/24.
 * <p>
 * 我们现在可以下结论了，在泛型类被类型擦除的时候，之前泛型类中的类型参数部分如果没有指定上限，
 * 如 <T> 则会被转译成普通的 Object 类型，如果指定了上限如 <T extends String> 则类型参数就被替换成类型上限。
 */
public class 泛型擦除 {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(23);
//      ls.add("text");//在擦除的时候add方法的类型参数被转换为Object类型，所以可以通过反射来传递费Integer类型参数
        try {
            Method method = ls.getClass().getDeclaredMethod("add", Object.class);

            /**
             * 可以看到，利用类型擦除的原理，用反射的手段就绕过了正常开发中编译器不允许的操作限制。
             */
            method.invoke(ls, "test");
            method.invoke(ls, 42.9f);
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        for (Object o : ls) {
            System.out.println(o);
        }
        //Java 不能创建具体类型的泛型数组
        /**
         * 这两行代码是无法在编译器中编译通过的。原因还是类型擦除带来的影响。

         List<Integer> 和 List<Boolean> 在 jvm 中等同于List<Object> ，所有的类型信息都被擦除，程序也无法分辨一个数组中的元素类型具体是 List<Integer>类型还是 List<Boolean> 类型。
         */

//        List<Integer>[] li2 = new ArrayList<Integer>[];
//        List<Boolean> li3 = new ArrayList<Boolean>[];
        /**
         * 借助于无限定通配符却可以，前面讲过 ？ 代表未知类型，所以它涉及的操作都基本上与类型无关，
         * 因此 jvm 不需要针对它对类型作判断，因此它能编译通过
         * ，但是，只提供了数组中的元素因为通配符原因，它只能读，不能写。
         * 比如，上面的 v 这个局部变量，它只能进行 get() 操作，不能进行 add() 操作，
         * 这个在前面通配符的内容小节中已经讲过。
         */
        List<?>[] li3 = new ArrayList<?>[10];
        li3[1] = new ArrayList<String>();
        List<?> v = li3[1];
    }

}
