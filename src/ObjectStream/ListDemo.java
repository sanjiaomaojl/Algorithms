package ObjectStream;

import java.io.*;
import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("小孩子", 8));
        list.add(new Person("中孩子", 18));
        list.add(new Person("大孩子", 38));
        list.add(new Person("老孩子", 80));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("list.txt"));
        oos.writeObject(list);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("list.txt"));
        Object o = ois.readObject();
        ois.close();
        oos.close();
        System.out.println((ArrayList<Person>)o);
    }
}
