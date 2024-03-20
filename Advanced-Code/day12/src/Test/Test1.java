package Test;

import java.io.File;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        File dir = extracted();
    }

    private static File extracted() {
        Scanner SC = new Scanner(System.in);
        System.out.println("请输入文件夹的路径");
        while (true)
        {
            String path = SC.nextLine();
           File dir = new File(path);
           if(!dir.exists()){
               System.out.println("请输入正确的文件夹路径");

           }else if(dir.exists()){
               System.out.println("输入的是文件路径不是文件夹路径");
           }else {
               return dir;
           }
        }
    }
}
