package Test;

import java.util.ArrayList;
import java.util.Random;

public class SendThread extends Thread {
    private ArrayList<String> gift;
    private int count;


    public SendThread(ArrayList<String> gift, String name) {
        super(name);
        this.gift = gift;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        Random r = new Random();
        while (true){
            synchronized (gift){
                if(gift.size()<10){
                    break;
                }
                String rs = gift.remove(r.nextInt(gift.size()));
                System.out.println(name+"发出了"+rs);
                count++;
            }

        }

    }
    public void setCount(){
        count=this.count;
    }
    public int getCount(){
        return count;
    }
}
