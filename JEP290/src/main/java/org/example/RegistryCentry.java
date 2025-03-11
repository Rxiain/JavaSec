package org.example;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import static java.rmi.registry.LocateRegistry.createRegistry;

public class RegistryCentry {
    public static void main(String args[]) throws RemoteException {
        try {
            LocateRegistry.createRegistry(2333);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.printf("注册中心运行在2333");
        while (true);
    }
}
