package DataDemo;

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = new int[3];
        System.arraycopy(array1, 1, array2, 0, 3);
        System.out.println(Arrays.toString(array2));
    }
}
