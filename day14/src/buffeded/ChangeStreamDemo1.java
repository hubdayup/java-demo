package buffeded;

import java.io.*;

public class ChangeStreamDemo1 {
    public static void main(String[] args)throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\test.txt",true),"GBK");
        osw.write("哈哈");
        osw.close();
    }

    private static void read() throws IOException {
        InputStreamReader sc = new InputStreamReader(new FileInputStream("D:\\test.txt"),"gbk");
        int i;
        while ((i = sc.read())!=-1){
            System.out.println((char) i);
        }
    }
}
