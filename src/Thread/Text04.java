package Thread;

public class Text04 {
    public static void main(String[] args) {

        //第一段
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "--->" + i);
            }
        });
        thread.start();

        //第二段
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "--->" + i);
            }
        }).start();
    }
}
