package buffeded;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
       BufferedReader bf = new BufferedReader(new FileReader("D:\\A.txt"));
       BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\B.txt"));
        char[] s = new char[1024];
       int i;
       while ((i=bf.read())!=-1){
           bw.write(i);
       }
       bf.close();
       bw.close();
    }
}
