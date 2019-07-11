package Thread;

public class Text01 {
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        demo01.start();

        MyThread01 thread01 = new MyThread01();
        thread01.start();

        for (int i = 0; i < 3; i++) {
            System.out.println("main" + i);
        }

        System.out.println("当前执行线程:" + Thread.currentThread().getName());

    }
}
