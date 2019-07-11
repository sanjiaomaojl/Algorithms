package Basic;

import java.util.HashMap;

public class StringDemo {
    public static void main(String[] args) {
        String str = "kgnzhjnfhjsnkcjsjfjkdsnfc";
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(chars[i]))
                map.put(chars[i], map.get(chars[i]) + 1);
            else
                map.put(chars[i], 1);
        }
        System.out.println(map);
    }
}
