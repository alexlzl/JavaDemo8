/**
 * Created by liuzhouliang on 2018/10/15.
 * <p>
 * 引用方法==================
 */
public class Test1 {
    /**
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
     * 在引用构造器的时候，构造器参数列表要与接口中抽象方法的参数列表一致,格式为 类名::new。如
     */
    public static void test4() {
        //Function<Integer, StringBuffer> fun = n -> new StringBuffer(n);
        Function1<Integer, StringBuffer> fun = StringBuffer::new;
        StringBuffer buffer = fun.apply("2000");
        System.out.println(buffer.toString());

    }

    public interface Function1<A, B> {
        StringBuffer apply(String s);
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
