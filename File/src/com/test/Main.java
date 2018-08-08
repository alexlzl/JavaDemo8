package com.test;

import java.io.File;
import java.io.IOException;

/**
 * Created by liuzhouliang on 2018/8/1.
 */
public class Main {
    public static void main(String[] args) {

        File file = new File("e:\\test_file.txt");
        Main.judeFileExists(file);

        File dir = new File("e:\\test_dir");
        Main.judeDirExists(dir);
    }

    // 判断文件是否存在
    public static void judeFileExists(File file) {

        if (file.exists()) {
            System.out.println("file exists");
        } else {
            System.out.println("file not exists, create it ...");
            try {
                file.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

    // 判断文件夹是否存在
    public static void judeDirExists(File file) {

        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println("dir exists");
            } else {
                System.out.println("the same name file exists, can not create dir");
            }
        } else {
            System.out.println("dir not exists, create it ...");
            file.mkdir();
        }

    }
}
