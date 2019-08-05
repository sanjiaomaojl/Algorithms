package ThreadMeeting;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println("创建了一个线程" + Thread.currentThread().getName());
    }
}
