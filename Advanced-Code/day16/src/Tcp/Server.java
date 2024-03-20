package Tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("-------服务端启动成功------");
        ServerSocket socket = new ServerSocket(8888);
        while (true){

        Socket accept = socket.accept();
         new ServerReaderThread(accept).start();

        }


    }
}