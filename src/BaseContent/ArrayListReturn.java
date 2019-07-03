package BaseContent;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListReturn {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(100));
        }
        ArrayList<Integer> small = getSmallList(list);
        for (int i = 0; i < small.size(); i++) {
            System.out.println(small.get(i));
        }
    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list){
        ArrayList<Integer> small = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                small.add(list.get(i));
            }
        }
        return small;
    }

}
