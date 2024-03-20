package Test;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest2 {
    public static void main(String[] args) {
        tickettast2 tk1 = new tickettast2();
        tickettast2 tk2 = new tickettast2();
        tickettast2 tk3 = new tickettast2();
        tk1.setName("窗口1");
        tk2.setName("窗口2");
        tk3.setName("窗口3");
        tk1.start();
        tk2.start();
        tk3.start();
    }
}

class tickettast2 extends Thread {
    private static int tickets = 20000;
    private ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {

        while (true) {
                lock.lock();
                if (tickets == 0) {
                    lock.unlock();
                    break;
                }

                System.out.println(getName() + "卖出了第" + tickets + "号票");
                tickets--;
                lock.unlock();
            }
        }
    }


