package Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo implements Runnable {

    private int tickets = 100;

    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets + "张票");
                tickets--;
            }
            lock.unlock();
        }
    }

}
