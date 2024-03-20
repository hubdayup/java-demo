package ClientAndSever;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Sever {
    public static void main(String[] args) throws Exception {
        System.out.println("-----服务端启动-----");
        //1.创建一个服务端对象（接韭菜），注册端口
        DatagramSocket socket = new DatagramSocket(7777);
        //2.创建一个数据包对象用于数据接收
        byte[] buffer = new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        //3.开始正式用数据包来接收客户端发送的数据
        while (true) {
            socket.receive(packet);
            //4.从字节数组中把接收到的数据打印出来
            int length = packet.getLength();
            String rs = new String(buffer,0,length);
            System.out.println(rs);
            System.out.println(packet.getAddress().getHostAddress());
            System.out.println(packet.getPort());
            System.out.println("--------------");
        }
    }
}
