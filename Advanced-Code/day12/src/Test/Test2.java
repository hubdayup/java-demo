package Test;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        deleteDir(new File("E:\\360驱动大师目录"));

    }
    public static void deleteDir(File dir){
        File[] files = dir.listFiles();
        for (File file : files) {
            if(file.isFile()){
                file.delete();
            }else {
                if(file.listFiles()!=null){
                    deleteDir(file);
                }
            }
        }
        dir.delete();
    }
}
