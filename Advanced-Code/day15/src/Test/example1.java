package Test;

import java.util.ArrayList;
import java.util.Random;

public class example1 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> gift = new ArrayList<>();
        String[] name = {"口红","包包","鲜花","剃须刀","手表"};
        Random r = new Random();
        for (int i = 0;i <1000;i++){
            gift.add(name[r.nextInt(name.length)]+(i+1));

        }
        System.out.println(gift);
        SendThread xm = new SendThread(gift, "小明");
        xm.start();
        SendThread xh = new SendThread(gift, "小红");
        xh.start();
        xm.join();
        xh.join();
        System.out.println(xm.getCount());
        System.out.println(xh.getCount());
    }
}
