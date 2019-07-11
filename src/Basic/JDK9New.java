package Basic;

import java.util.List;
import java.util.Set;

public class JDK9New {
    public static void main(String[] args) {
        //长度固定不可以再添加新的元素了
        List<Object> list = List.of("a", "b", "c");
        System.out.println(list);

        //set 不可以输入重复元素，且不可以再添加新的元素了
        Set<String> set = Set.of("a", "b", "c");
        System.out.println(set);

        //map 不可以输入重复元素，且不可以再添加新的元素了
    }
}
