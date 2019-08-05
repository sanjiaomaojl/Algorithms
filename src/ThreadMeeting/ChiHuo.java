package ThreadMeeting;

public class ChiHuo extends Thread{

    private BaoZi bz;

    public ChiHuo(BaoZi bz){
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true){
            synchronized (bz){
                if (bz.flag == false){
                    try {
                        //线程等待
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("吃货正在吃"+bz.pi+bz.xian+"的包子");
                method();
                bz.flag = false;
                //唤醒线程
                bz.notify();
                System.out.println("吃货已经把"+bz.pi+bz.xian+"的包子吃完了");
                System.out.println("----------------------------------------");
            }
        }
    }

    public void method(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(".");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(".");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(".");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

}
