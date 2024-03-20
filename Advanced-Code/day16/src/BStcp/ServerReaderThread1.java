package BStcp;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServerReaderThread1 extends Thread {
    private Socket socket;

    public ServerReaderThread1(Socket socket) {
        this.socket = socket;

    }
//
    @Override
    public void run() {
        try {
            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=UTF-8");
            ps.println();
            ps.println("<div style='color:red;font-size:120px;text-align:center'>李潇龙傻逼<div>");
            ps.close();
            socket.close();
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
