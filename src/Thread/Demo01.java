package Thread;

//调用Start()方法
public class Demo01 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("run" + i);
        }
    }

}
