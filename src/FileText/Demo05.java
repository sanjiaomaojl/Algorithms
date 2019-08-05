package FileText;

import java.io.File;

public class Demo05 {
    public static void main(String[] args) {
        //Show01();
        show02();
    }

    private static void show02() {
        File file = new File("D:\\IDEA-workspace\\Interview");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }

    private static void Show01() {
        File file = new File("D:\\IDEA-workspace\\Interview");
        String[] strings = file.list();
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
