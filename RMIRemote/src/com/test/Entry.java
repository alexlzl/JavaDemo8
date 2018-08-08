package com.test;


import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by liuzhouliang on 2018/7/19.
 */
public class Entry {
    public static void main(String[] args) throws AlreadyBoundException, RemoteException {
        UserManagerImp userManager = new UserManagerImp();
        UserManagerInterface userManagerI = (UserManagerInterface) UnicastRemoteObject.exportObject(userManager, 0);
        // Bind the remote object's stub in the registry
        Registry registry = LocateRegistry.createRegistry(2002);

        registry.rebind("userManager", userManagerI);
        System.out.println("server is ready");
    }
}
