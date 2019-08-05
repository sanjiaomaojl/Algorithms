package ThreadMeeting;

public class WakeMemory extends Thread{
    private BaoZi bz;

    public WakeMemory(BaoZi bz){
        this.bz = bz;
    }
    @Override
    public void run() {
        synchronized (bz){
            if (bz.flag == false){
                try {
                    bz.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("吃货正在吃"+ bz.pi + bz.xian + "的包子");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bz.flag = false;
            System.out.println("吃货把"+ bz.pi + bz.xian + "的包子吃完了");
            bz.notify();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
