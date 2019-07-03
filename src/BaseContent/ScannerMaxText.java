package BaseContent;

import java.util.Scanner;

public class ScannerMaxText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 1; i < 3; i++) {
            max = array[0];
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("最大值是：" + max);
    }
}
