package Test;

public class myRunnable {
    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();


        Thread s = new Thread(my);
        s.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程执行了");
        }

    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("线程执行了" + i);
        }
    }
}