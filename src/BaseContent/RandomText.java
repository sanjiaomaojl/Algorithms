package BaseContent;

import java.util.Random;
import java.util.Scanner;

public class RandomText {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100);
        System.out.println(num);
        System.out.println("请猜一猜：");
        Scanner sc = new Scanner(System.in);
        while (true){
            int a = sc.nextInt();
            if ( a > num){
                System.out.println("太大了");
            }else if (a < num){
                System.out.println("太小了");
            }else {
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}
