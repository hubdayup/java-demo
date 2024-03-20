package buffeded;

import java.io.*;

public class SerizliaStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        write();
        read();

    }

    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\B.txt"));
        Object o = ois.readObject();
        System.out.println(o);
        ois.close();
    }

    private static void write() throws IOException {
        Student stu = new Student("张三",23);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\B.txt"));
        oos.writeObject(stu);
        oos.close();
    }
}
