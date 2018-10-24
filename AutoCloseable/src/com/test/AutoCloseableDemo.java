package com.test;

import java.io.*;

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
 * <p>
 * 这个方法关闭调用对象，释放可能占用的所有资源。在带资源的try语句的末尾，会自动调用该方法，因此消除了显式调用close()方法的需要。
 * <p>
 * Closeable接口也定义了close()方法。实现了Closeable接口的类的对象可以被关闭。从JDK7开始，Closeable扩展了AutoCloseable。因此，在JDK7中，所有实现了Closeable接口的类也都实现了AutoCloseable接口。
 * <p>
 * 实现了Flushable接口的类的对象，可以强制将缓存的输出写入到与对象关联的流中。该接口定义了flush()方法，如下所示：
 * <p>
 * void flush() throws IOException
 * 刷新流通常会导致缓存的输出被物理地写入到底层设备中。写入流的所有I/O类都实现了Flushable接口。
 * <p>
 * 注：关于带资源的try语句的3个关键点：
 * <p>
 * 由带资源的try语句管理的资源必须是实现了AutoCloseable接口的类的对象。
 * 在try代码中声明的资源被隐式声明为fianl。
 * 通过使用分号分隔每个声明可以管理多个资源。
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
        }
        catch (Exception e) {

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

    public static void test1() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(new File("/home/fuhd/text")), "UTF8"), 1024)) {
            System.out.println(reader.readLine());    //这里直接读一行
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
