package com.test;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by liuzhouliang on 2018/7/19.
 */
public class RMIClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            RemoteHelloWord hello = (RemoteHelloWord) registry.lookup("helloword");
            String ret = hello.sayHello();
            System.out.println(ret);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }
}
