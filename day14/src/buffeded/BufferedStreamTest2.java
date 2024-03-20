package buffeded;

import java.io.*;
import java.util.TreeSet;

public class BufferedStreamTest2 {
    public static void main(String[] args) throws IOException {
        TreeSet<String> sc = new TreeSet<>();
        BufferedReader br = new BufferedReader(new FileReader("D:\\A.txt"));
        String line;
        while((line = br.readLine() )!= null){
            sc.add(line);
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\A.txt"));
        for (String s : sc) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
