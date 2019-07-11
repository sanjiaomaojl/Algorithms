package Thread;

//继承Thread来实现线程
public class MyThread02 extends Thread{

    public MyThread02() {
    }

    public MyThread02(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
