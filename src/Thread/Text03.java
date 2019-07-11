package Thread;

public class Text03 {

    public static void main(String[] args) {

        RunnableDemo demo = new RunnableDemo();
        Thread thread = new Thread(demo);
        thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }

    }

}
