package Test;

public class ThreadDemo1 {
    public static void main(String[] args) {
        mythread my = new mythread();
        mythread my1 = new mythread();
        my1.start();
        my.start();
    }
}
     class mythread extends Thread {
        @Override
        public void run() {
            for (int i =0;i<200;i++) {
                System.out.println("任务进行"+i);
            }
        }
    }



