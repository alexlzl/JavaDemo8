/**
 * Created by liuzhouliang on 2018/10/15.
 * <p>
 * 引用方法==================
 * <p>
 * 关于方法引用的总结：
 * <p>
 * 方法引用是 Lambda 的语法糖，可以进一步简化 Lambda 的书写。
 * <p>
 * 方法引用有四种应用场景： 1. 调用静态方法的情况，2.调用一个满足条件的类对象的实例方法（这个对象通常为局部变量） 3. 满足条件的类的任意对象的实例方法 4. 构造参数
 * <p>
 * 在使用的过程中建议不要直接写出方法引用，通过先写 Lambda 表达式，然后通过编辑器转化为 方法引用的方式。毕竟 IntelliJ（2017.1之后的版本） 这么强大。
 */
public class Test1 {
    /**
     * 关于方法引用的总结：
     * <p>
     * 方法引用是 Lambda 的语法糖，可以进一步简化 Lambda 的书写。
     * <p>
     * 方法引用有四种应用场景： 1. 调用静态方法的情况，2.调用一个满足条件的类对象的实例方法（这个对象通常为局部变量） 3. 满足条件的类的任意对象的实例方法 4. 构造参数
     * <p>
     * 在使用的过程中建议不要直接写出方法引用，通过先写 Lambda 表达式，然后通过编辑器转化为 方法引用的方式。毕竟 IntelliJ（2017.1之后的版本） 这么强大。
     * 方法引用=======================如Lambda表达式一样也是一个语法糖，可以用来简化开发。
     * <p>
     * 在我们使用Lambda表达式的时候，”->”右边部分是要执行的代码，即要完成的功能，可以把这部分称作Lambda体。有时候，当我们想要实现一个函数式接口的那个抽象方法，但是已经有类实现了我们想要的功能，这个时候我们就可以用方法引用来直接使用现有类的功能去实现。
     * <p>
     * 这么说有点绕，直接来看例子吧
     * <p>
     * 有个函数式接口Consumer，里面有个抽象方法accept能够接收一个参数但是没有返回值，这个时候我想实现accept方法，让它的功能为打印接收到的那个参数，那么我可以使用Lambda表达式这么做
     * <p>
     * 那为什么可以这么用呢？
     * 大家可以发现上面的accept方法跟println方法是不是很像，都是接收一个参数类型为String参数，并且无返回值。
     * <p>
     * 这就是方法引用的规定，实现抽象方法的参数列表，必须与方法引用方法的参数列表保持一致！至于返回值就不作要求
     *
     * @param args
     */
    public static void main(String[] args) {
        Consumer consumer = string -> System.out.println(string);
        /**
         * 但是其实我想要的这个功能PrintStream类（也就是System.out的类型）的println方法已经实现了，在上面我就是使用它来完成我想要的功能，其实这一步还可以再简单点，如
         */
        Consumer consumer1 = System.out::println;
        consumer1.accept("tttt");
        test4();
    }

    public interface Consumer {
        void accept(String string);
    }
    /**
     * 引用方法
     引用方法有下面几种方式
     对象引用::实例方法名
     类名::静态方法名
     类名::实例方法名
     */
    /**
     * 对象引用::实例方法名==============1
     */
    public void test1() {
        Consumer consumer1 = System.out::println;

    }

    /**
     * 类名::静态方法名====================2
     * <p>
     * Math是一个类而abs为该类的静态方法。Function中的唯一抽象方法apply方法参数列表与abs方法的参数列表相同，都是接收一个Long类型参数。
     */
    public void test2() {
        //Function<Long, Long> f = x -> Math.abs(x);
        Function<Long, Long> f = Math::abs;
        Long result = f.apply(-3L);
    }

    interface Function<T, B> {
        Long apply(long l);
    }


    /**
     * 若Lambda表达式的参数列表的第一个参数，是实例方法的调用者，第二个参数(或无参)是实例方法的参数时，就可以使用这种方法，如
     */

    public void test3() {
        //BiPredicate<String, String> b = x,y() -> x.equals(y);
        BiPredicate<String, String> b = String::equals;
        b.test("abc", "abcd");
    }

    public interface BiPredicate<S1, S2> {
        void test(String s1, String s2);
    }

    /**
     * 引用构造器====================3
     */
    public static void test4() {
        //Function<Integer, StringBuffer> fun = n -> new StringBuffer(n);
//        Function1<Integer, StringBuffer> fun = a -> 100;
        Function1<Integer, StringBuffer> fun = StringBuffer::new;
//        fun.apply(10);
//        StringBuffer buffer = fun.apply("2000");
//        System.out.println(buffer.toString());

    }

    public interface Function1<A, B> {
        //        StringBuffer  apply(String s);
        void apply(int a);
    }

    /**
     * 引用数组=======================4
     * 引用数组和引用构造器很像，格式为 类型[]::new，其中类型可以为基本类型也可以是类。如
     */
    public static void test5() {
//        Function3<Integer, int[]> fun = n -> new int[n];
        Function3<Integer, int[]> fun = int[]::new;
        int[] arr = fun.apply(10);
//
//        Function3<Integer, Integer[]> fun2 = Integer[]::new;
//        Integer[] arr2 = fun2.apply(10);

    }

    public interface Function3<A, B> {
        int[] apply(int n);
    }

}
