package ThreadMeeting;

public class Text2 {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread1 = new Thread(() -> System.out.println("创建了一个线程" + Thread.currentThread().getName()));
        thread1.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("创建了一个线程" + Thread.currentThread().getName());
            }
        }).start();

    }
}
