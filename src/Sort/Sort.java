package Sort;

public class Sort {

    //选择排序
    public static void selectionSort(int[] arr){

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int mainIndex = i;
            //寻找[1,n)之间的最小值的索引
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mainIndex])
                    mainIndex = j;
            }

            swap(arr, i, mainIndex);

        }

    }

    //插入排序
    public static void insertionSort(int[] arr){

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            //寻找arr[i]合适的插入位置
            int e = arr[i];
            int j; //j保存元素e应该插入的位置
            for (j = i; j > 0 && arr[j] > e ; j--) {
                arr[j] = arr[j -1];
            }
            arr[j] = e;
        }

    }

    //交换位置
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {12, 20, 5, 16, 15, 1, 30, 45, 23, 9};
        //selectionSort(arr);
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
