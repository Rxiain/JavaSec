package org.example;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

//public class Client {
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        try {
//            Registry registry = LocateRegistry.getRegistry("localhost",2333);
//            Interface serv = (Interface) registry.lookup("service");
//            String data = "当你看到这句话时，意味着RMI运行成功";
//            System.out.println(serv.service(data));
//        }
//        catch (RemoteException | NotBoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
//}

public class Client {
    public static void main(String args[]) {
        Registry reg = LocateRegistry.createRegistry("2333");
        
    }
}
