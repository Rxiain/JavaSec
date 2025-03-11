package org.example;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Server {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(2333);
            //创建一个在端口2333上监听的RMI注册中心
            Interface service1 = new Impl("---这是对象在服务端时输入的参数");
            Context namingContext = new InitialContext();
            namingContext.rebind("rmi://localhost:2333/service",
                    service1);
            //将远程对象绑定到注册表，service1为远程接口的代理对象
        }
        catch (RemoteException | NamingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Successfully register a remote object.");
        //远程对象创建成功
    }
}
