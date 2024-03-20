package BStcp;

import Tcp.ServerReaderThread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("------服务器启动成功-------");
        ServerSocket socket = new ServerSocket(8080);
        while (true){
            Socket scoket1 = socket.accept();
            System.out.println("有人上线了"+scoket1.getRemoteSocketAddress());
           new ServerReaderThread1(scoket1).start();
        }
    }
}
