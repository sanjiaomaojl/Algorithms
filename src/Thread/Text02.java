package Thread;

public class Text02 {

    public static void main(String[] args) {

        MyThread02 mt = new MyThread02();
        mt.setName("钱宝宝");
        mt.start();

        MyThread02 mt2 = new MyThread02();
        mt2.setName("张京龙");
        mt2.start();

        new MyThread02("送财童子").start();

    }

}
