package Tcp;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请说");
            String msg = sc.nextLine();
            if("exit".equals(msg)){
                System.out.println("退出成功，欢迎下次使用");
                dos.close();
                socket.close();
                break;
            }
            dos.writeUTF(msg);
            dos.flush();
        }

    }
}
