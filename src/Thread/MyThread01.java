package Thread;

//改变线程的名字
public class MyThread01 extends Thread{
    @Override
    public void run() {
        getName();
        System.out.println(getName());
    }
}
