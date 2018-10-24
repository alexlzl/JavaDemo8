package com.test;

/**
 * Created by liuzhouliang on 2018/10/24.
 * <p>
 * AutoCloseable接口位于java.lang包下，从JDK1.7开始引入。AutoCloseable，顾名思义就是表示一些资源是可以自动关闭的。这到底该怎么理解呢？
 * AutoCloseable接口是为了方便资源的关闭而产生的，如果你的代码有需要资源的逻辑，不妨使用一下这个接口。
 * <p>
 * 在没有AutoCloseable接口存在的时候，我们如何关闭一些资源呢？毫无疑问，我们需要在finally中进行资源的关闭。那么在finally中关闭资源有什么不好么？
 * <p>
 * 1、自己要手动写代码做关闭的逻辑；
 * <p>
 * 2、有时候还会忘记关闭一些资源；
 * <p>
 * 3、关闭代码的逻辑比较冗长，不应该是正常的业务逻辑需要关注的；
 * <p>
 * 这些问题是导致AutoCloseable接口出现的原因。
 */


public class AutoCloseableDemo {
    public static void main(String[] args) {
        try (AutoCloseableApp app = new AutoCloseableApp()) {
            app.close();
            app.test();
            System.out.println("--执行main方法--");
        } catch (Exception e) {
            System.out.println("--exception--");
        } finally {
            System.out.println("--finally--");
        }
        try {
            System.out.println("");
        } catch (Exception e) {

        } finally {

        }

    }

    public static class AutoCloseableApp implements AutoCloseable {
        @Override
        public void close() throws Exception {
            System.out.println("--close--");
        }

        public void test() {
            System.out.println("test==================");
        }

    }

    public static class Test {

    }
}
