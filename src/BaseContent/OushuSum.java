package BaseContent;

public class OushuSum {
    public static void main(String[] args) {
        /**
         * FOR循环
         */
        int sum1 = 0;
        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0){
                sum1 += i;
            }
        }
        System.out.println(sum1);
        /**
         * do-while循环
         */
        int sum2 = 0;
        int j = 0;
        do {
            if (j % 2 == 0){
                sum2 += j;
            }
            j++;
        }while (j <= 100);
        System.out.println(sum2);
        /**
         * while循环
         */
        int sum3 = 0;
        int i = 0;
        while (i <= 100){
            if(i % 2 == 0){
                sum3 += i;
            }
            i++;
        }
        System.out.println(sum3);
    }
}
