package Recursive;

import java.io.File;

public class DemoRecursive02 {
    public static void main(String[] args) {
        File file = new File("D:\\IDEA-workspace\\Interview");
        demo(file);
    }
    private static void demo(File file) {
        //System.out.println(file);
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory())
                demo(file1);
            else {
                String s = file1.toString();
                if (s.endsWith(".java"))
                    System.out.println(s);
            }
        }
    }
}
