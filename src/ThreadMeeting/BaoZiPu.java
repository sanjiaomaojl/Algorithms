package ThreadMeeting;

public class BaoZiPu extends Thread{

    private BaoZi bz;

    public BaoZiPu(BaoZi bz){
        this.bz = bz;
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            synchronized (bz){
                if (bz.flag ==  true){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (bz.flag == false){
                    if (i % 2 == 0){
                        bz.pi = "冰激凌皮";
                        bz.xian = "三鲜馅";
                        System.out.print("包子铺正在生产"+bz.pi+bz.xian+"的包子");
                        method();
                        i++;
                    }else if (i % 2 ==1){
                        bz.pi = "芝士";
                        bz.xian = "奶油馅";
                        System.out.print("包子铺正在生产"+bz.pi+bz.xian+"的包子");
                        method();
                        i++;
                    }
                    bz.flag = true;
                }
                bz.notify();
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
