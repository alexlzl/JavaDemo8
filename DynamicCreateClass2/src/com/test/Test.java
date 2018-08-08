package com.test;

/**
 * Created by liuzhouliang on 2018/7/20.
 */

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;


public class Test {
    public static void main(String[] args) throws Exception {

        //这里只是产生一个JAVA文件,简单的IO操作=========================1
        String rt = "\r\n";
        String source = "package com.test;" + "" + rt
                + "public class Dealer implements Store" + rt + "{" + rt + "private Store s;" + rt +
                "public Dealer(Store s)" + rt + " {" + "  this.s = s;" + rt
                + " }" + rt +

                " public void sell()" + " {" + rt
                + "  System.out.println(\"price markup....\");" + rt
                + "  s.sell();" + " }" + rt +
                "}";

        String fileName = System.getProperty("user.dir")//获取到项目的根路径
                + "/DynamicCreateClass2/src/com/test/Dealer.java";
        File f = new File(fileName);
        FileWriter fw = new FileWriter(f);
        fw.write(source);
        fw.flush();
        fw.close();

        // compile下面开始编译这个Store.java=======================2
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null,
                null, null);
        Iterable units = fileMgr.getJavaFileObjects(fileName);
        CompilationTask t = compiler.getTask(null, fileMgr, null, null, null,
                units);
        t.call();
        fileMgr.close();

        // 加载到内存==============================3
        URL[] urls = new URL[]{new URL("file:/"
                + System.getProperty("user.dir") + "/DynamicCreateClass2/src")};
        URLClassLoader ul = new URLClassLoader(urls);
        Class c = ul.loadClass("com.test.Dealer");
        System.out.println(c);

//客户端调用

//        Constructor ctr = c.getConstructor(Store.class);
//        Store s = (Store)ctr.newInstance(new Supermarket());//这里看到,这个我们这个代理类必须实现Store的原因
//        s.sell();
    }
}
