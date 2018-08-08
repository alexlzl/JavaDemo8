package com.test;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by liuzhouliang on 2018/7/19.
 */
public interface RemoteHelloWord extends Remote {
    String sayHello() throws RemoteException;
}
