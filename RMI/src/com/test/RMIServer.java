package com.test;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by liuzhouliang on 2018/7/19.
 * <p>
 * 在server端只需要做两件事：
 * <p>
 * 创建并导出远程对象
 * 用Java RMI registry 注册远程对象
 */
public class RMIServer {
    public static void main(String[] args) {
        try {
            RemoteHelloWord hello = new RemoteHelloWordImpl();
            RemoteHelloWord stub = (RemoteHelloWord) UnicastRemoteObject.exportObject(hello, 9999);
            LocateRegistry.createRegistry(1099);
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("helloword", stub);
            System.out.println("绑定成功!");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
