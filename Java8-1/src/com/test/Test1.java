package com.test;

public class Test1 {
    public static void main(String[] args) {
        // Old way
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world");
            }
        }).start();
        // New way
        new Thread(
                () -> System.out.println("Hello world")
        ).start();
    }
}
