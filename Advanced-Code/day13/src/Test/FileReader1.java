package Test;

import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\B.txt");
        char[] chs = new char[1024];
        int len;
        while ((len = fr.read(chs)) != -1){
        String s = new String(chs,0,len);
            System.out.println(s);
        }
        fr.close();
    }
    private static void method() throws IOException{
        FileReader fr = new FileReader("D:\\B.txt");
        int i;
        while ((i = fr.read()) !=-1){
            System.out.println((char)i);
        }
        fr.close();
    }
}
