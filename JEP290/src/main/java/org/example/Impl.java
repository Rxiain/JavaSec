package org.example;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Impl extends UnicastRemoteObject
        implements Interface {

    private static final long serialVersionUID = 1L;
    private String name = "123";

    public Impl(String name) throws RemoteException {
        super(); //`super();`是调用父类`UnicastRemoteObject`的构造函数
        this.name = name;
        // UnicastRemoteObject.exportObject(this, 0);
    }

    @Override
    public String service(String data) throws RemoteException {
        return data + name;
    }
    //实现了接口的功能
}
