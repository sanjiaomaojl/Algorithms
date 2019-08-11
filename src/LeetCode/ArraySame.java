package LeetCode;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArraySame {
    public int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : nums1) {
            set.add(i);
        }

        TreeSet<Integer> set2 = new TreeSet<>();
        for (int i : nums2) {
            set.add(i);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : set){
            if (set2.contains(num))
                list.add(num);
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
