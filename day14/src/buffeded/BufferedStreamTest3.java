package buffeded;

import java.io.*;
import java.util.ArrayList;

public class BufferedStreamTest3 {
    public static void main(String[] args) throws IOException {
        WriteB();
        ArrayList<Student> sc = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader ("D:\\B.txt"));
        String line;
        while ((line = br.readLine())!=null){
            String arr[] = line.split("-");
            Student stu = new Student(arr[0],Integer.parseInt(arr[1]));
            sc.add(stu);
        }
        br.close();
        for (Student student : sc) {
            System.out.println(student);
        }
    }

    private static void WriteB() throws IOException {
        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("李四",25);
        Student stu3 = new Student("王五",22);
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\B.txt"));
        bw.write(stu1.getName()+"-"+stu1.getAge());
        bw.newLine();
        bw.write(stu2.getName()+"-"+stu2.getAge());
        bw.newLine();
        bw.write(stu2.getName()+"-"+stu3.getAge());
        bw.newLine();
        bw.close();
    }
}
