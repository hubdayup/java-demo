package Test;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest1 {
    public static void main(String[] args) {
        tickettast2 tk1 = new tickettast2();

        Thread t1 = new Thread(tk1,"窗口1");
        Thread t2 = new Thread(tk1,"窗口2");
        Thread t3 = new Thread(tk1,"窗口3");
        t1.start();
        t2.start();
        t3.start();
    }



}
class tickettast implements Runnable{
    private int tickets = 2000;
  private ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {

            while (true) {
                lock.lock();
                if (tickets == 0){
                    lock.unlock();
                    break;
                }
                System.out.println(Thread.currentThread().getName()+"卖出了第"+tickets+"号票");
                tickets--;
                lock.unlock();
            }
        }
    }

