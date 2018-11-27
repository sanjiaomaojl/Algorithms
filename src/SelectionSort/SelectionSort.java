package SelectionSort;

import java.util.Collections;

public class SelectionSort {

    private SelectionSort(){}

    public static void sort(Comparable[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            //寻找[i,n)区间里最小值的索引
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if( arr[j].compareTo( arr[minIndex] ) < 0 )
                    minIndex = j;
            }
            swap(arr, i, minIndex);
        }
    }

    private static void swap(Object[] arr, int i, int j){
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        Integer[] arr = {10,9,8,7,6,5,4,3,2,1};
        SelectionSort.sort(arr);
        for( int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        System.out.println();

    }
}
