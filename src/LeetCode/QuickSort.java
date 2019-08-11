package LeetCode;

public class QuickSort {

    public static void main(String[] args) {
        int[] nums = {6, 3, 8, 2, 9, 1 };
        Sort(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void Sort(int[] arr, int left, int right){

        if (left > right)
            return;

        int start = left;
        int end = right;
        int base = arr[start];

        while (start != end){
            while (start < end && arr[end] >= base){
                end--;
            }
            while (start < end && arr[start] <= base){
                start++;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        arr[left] = arr[start];
        arr[start] = base;

        Sort(arr, left, start-1);
        Sort(arr, start+1, right);

    }

}
