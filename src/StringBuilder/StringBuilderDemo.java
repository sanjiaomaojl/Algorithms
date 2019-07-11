package StringBuilder;

import java.util.ArrayList;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("wo");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);

        for (int i : list) {
            System.out.println(i);
        }

    }
}
