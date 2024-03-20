package Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\B.txt");
        int i;
        while ((i = fis.read()) != -1){
            System.out.println((char)i);

        }
        fis.close();
    }
}
