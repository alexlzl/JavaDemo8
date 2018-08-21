package com.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by liuzhouliang on 2018/7/10.
 *
 * branch1
 */
public abstract class Test extends Client1{
    public static void main(String[] args) {
        try {
            String addr = InetAddress.getLocalHost().getHostAddress();
            System.out.println(addr);//10.144.37.236
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
