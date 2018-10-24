package com.test;

/**
 * Created by liuzhouliang on 2018/10/24.
 * <p>
 * 接口AutoCloseable是jdk1.7出现的新接口，存在于java.lang包中，
 * 可配合jdk1.7出现的try-with-resources新语法特性一起使用，
 * 用于自动关闭某个系统资源，如：文件，网络等。该接口只定义了一个方法：
 * void close(）throws Exception
 */
public class AutoCloseableDemo1 {

    public static void main(String[] args) {
        try(MyResource resource = new MyResource()){
            resource.close();
        }
    }

}
class MyResource implements AutoCloseable{

    @Override
    public void close() {
        System.out.println("closed");
    }
}