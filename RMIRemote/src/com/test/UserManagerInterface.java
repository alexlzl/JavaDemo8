package com.test;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by liuzhouliang on 2018/7/19.
 */
public interface UserManagerInterface  extends Remote{
    public String getUserName() throws RemoteException;
    public Account getAdminAccount() throws RemoteException;
}
