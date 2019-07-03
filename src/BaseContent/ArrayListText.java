package BaseContent;

import java.util.ArrayList;

public class ArrayListText {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("我们");
        list.add("爱");
        list.add("北京");
        list.add("天安门");
        list.add("故宫");
        list.add("北京大学");
        System.out.println(list);
        String remove = list.remove(2);
        System.out.println(remove);
    }
}
