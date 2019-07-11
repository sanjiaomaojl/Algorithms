package Thread;

public class ThreadDemoSleep {

    //线程停留 1秒
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 60; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

}
