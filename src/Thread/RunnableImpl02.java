package Thread;

/*
添加锁机制，防止线程安全问题02
 */
public class RunnableImpl02 implements Runnable{

    private int tickets = 100;

    @Override
    public void run() {
        method();
    }

    public synchronized void method(){
        while (true){
            if ( tickets > 0){
                System.out.println(Thread.currentThread().getName() + "正在卖第"+ tickets +"张票");
                tickets--;
            }
        }
    }

}
