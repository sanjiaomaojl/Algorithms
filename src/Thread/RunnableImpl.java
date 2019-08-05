package Thread;

/*
添加锁机制，防止线程安全问题01
 */
public class RunnableImpl implements Runnable{

    private int tickets = 100;

    @Override
    public void run() {
        while (true){
            if (tickets < 0)
                break;
            synchronized (this){
                if ( tickets > 0){
                    System.out.println(Thread.currentThread().getName() + "正在卖第"+ tickets +"张票");
                    tickets--;
                }
            }
        }
    }
}
