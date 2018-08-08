package com.test;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by liuzhouliang on 2018/7/19.
 */
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * 把Server端的Account类和接口UserManagerInterface 导出Export成jar包，命名为：RmiServerInterface.jar。导入到client中。
 */

public class ClientEntry {

    public static void main(String[] args) {

        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 2002);
            UserManagerInterface userManager = (UserManagerInterface) registry.lookup("userManager");
            System.out.println("用户名是" + userManager.getAdminAccount().getUsername()
                    + "密码" + userManager.getAdminAccount().getPassword());
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NotBoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}