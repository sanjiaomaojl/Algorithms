package Basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("张京龙", 18);
        map.put("钱~~", 19);
        map.put("钱宝宝", 19);
        System.out.println(map);
        map.remove("钱~~");
        System.out.println(map);
        System.out.println(map.get("钱宝宝"));
        Integer v2 = map.get("地理热恶霸");
        boolean key = map.containsKey("赵丽颖");
        //keySet
        Set<String> strings = map.keySet();
        for (String s : strings) {
            Integer age = map.get(s);
            System.out.println(s + age);
        }
        //EntryKey
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        //迭代器
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            System.out.println(next.getKey() + next.getValue());
        }
        //foreach
        for (Map.Entry<String, Integer> entry: entrySet) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
