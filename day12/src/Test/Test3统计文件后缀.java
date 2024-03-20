package Test;

import java.io.File;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class Test3统计文件后缀 {
    static HashMap<String,Integer> hm = new HashMap<>();
    static int count;
    public static void main(String[] args) {
        File file = new File("E:\\.idea");
        getCount(file);
        hm.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                System.out.println(key+":"+value);
            }
        });
        System.out.println("无后缀的个数："+count);
    }
    public static void  getCount(File dir){
        File[] files = dir.listFiles();
        for (File file : files) {
            if(file.isFile()){
                String fileName = file.getName();
                if(fileName.contains(".")){//获取后缀名
                    String[] sArr = fileName.split("\\.");
                    String type = sArr[sArr.length -1];
                    if(!hm.containsKey(type)){
                        //统计
                        hm.put(type,1);
                    }else {
                        hm.put(type,hm.get(type)+1);
                    }
                }else {//没有后缀单独统计
                    count++;
                }
            }else {//文件夹的话递归使用
                if(file.listFiles() != null){
                getCount(file);
            }

            }
        }
    }
}
