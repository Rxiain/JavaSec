package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote {
    public String service(String data) throws RemoteException;
}
