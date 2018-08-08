package com.test;

import java.rmi.RemoteException;

/**
 * Created by liuzhouliang on 2018/7/19.
 */
public class UserManagerImp implements UserManagerInterface {
    public UserManagerImp() throws RemoteException {

    }
    private static final long serialVersionUID = -3111492742628447261L;

    public String getUserName() throws RemoteException{
        return "TT1";
    }
    public Account getAdminAccount() throws RemoteException{
        Account account=new Account();
        account.setUsername("TT1");
        account.setPassword("1234567");
        return account;
    }
}
