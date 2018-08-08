package com.test;

import java.rmi.RemoteException;

/**
 * Created by liuzhouliang on 2018/7/19.
 */
public class RemoteHelloWordImpl implements RemoteHelloWord {
    @Override
    public String sayHello() throws RemoteException {
        return "Hello Word!";
    }
}
