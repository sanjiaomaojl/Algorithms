package PropertiesDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        //demo01();
        //demo02();
        //demo03();
        demo04();   
    }

    private static void demo04() throws IOException {
        Properties prop3 = new Properties();
        prop3.load(new FileReader("prop2.txt"));
        Set<String> set = prop3.stringPropertyNames();
        for (String s : set) {
            System.out.println(s + prop3.getProperty(s));
        }
    }

    private static void demo03() throws IOException {
        Properties prop2 = new Properties();
        prop2.setProperty("钱宝宝1", "18");
        prop2.setProperty("钱宝宝2", "19");
        prop2.setProperty("钱宝宝3", "20");

        prop2.store(new FileWriter("prop2.txt"), "");

    }

    private static void demo02() throws IOException {
        Properties prop = new Properties();

        prop.setProperty("钱宝宝1", "18");
        prop.setProperty("钱宝宝2", "19");
        prop.setProperty("钱宝宝3", "20");

        FileWriter fw = new FileWriter("PROP.TEX");
        fw.write("woyebuzhidaoxieshaya");

        prop.store(fw, "write something,actually i don't want write something");

        fw.close();
    }

    private static void demo01() {
        Properties prop = new Properties();

        prop.setProperty("钱宝宝1", "18");
        prop.setProperty("钱宝宝2", "19");
        prop.setProperty("钱宝宝3", "20");

        Set<String> set = prop.stringPropertyNames();

        for (String name : set) {
            System.out.println(name + prop.getProperty(name));
        }
    }
}
