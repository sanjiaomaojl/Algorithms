package Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Text {
    public static void main(String[] args) {
        Person[] people  = {
                new Person("古力娜扎",18),
                new Person("迪丽热巴",19),
                new Person("钱宝宝",18),
                new Person("马尔扎哈",99)
        };

        Arrays.sort(people, (Person o1,Person o2) -> {return o1.getAge() - o2.getAge();});

        for (Person person : people) {
            System.out.println(person);
        }

    }
}
