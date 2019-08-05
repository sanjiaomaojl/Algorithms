package Thread;

/*
添加锁机制，防止线程安全问题02
 */
public class RunnableImpl03 implements Runnable{

    private static int tickets = 100;

    Object obj = new Object();

    @Override
    public void run() {
        method();
    }

    public static /*synchronized*/ void method(){
        while (true){
            synchronized (RunnableImpl03.class){
                if ( tickets > 0){
                    System.out.println(Thread.currentThread().getName() + "正在卖第"+ tickets +"张票");
                    tickets--;
                }
            }
        }
    }

}
