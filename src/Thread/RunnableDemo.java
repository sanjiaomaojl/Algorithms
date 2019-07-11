package Thread;


//实现Runnable接口来实现线程
public class RunnableDemo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
