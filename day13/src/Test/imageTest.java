package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class imageTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\个人.jpg");
        ArrayList<Integer> list = new ArrayList<>();
        int i;
        while ((i=fis.read())!=-1){
            list.add(i);
        }
        fis.close();
        FileOutputStream fos = new FileOutputStream("D:\\个人.jpg");
        for (Integer myByte : list) {
            fos.write(myByte^2);
        }
        fos.close();
    }
}
