package Recursive;

import java.io.File;
import java.io.FileFilter;

public class DemoRecursive03 {
    public static void main(String[] args) {
        File file = new File("D:\\IDEA-workspace\\Interview");
        demo(file);
    }
    private static void demo(File file) {
        //System.out.println(file);
        File[] files = file.listFiles(pathname -> {
            if (pathname.isDirectory())
                return true;
            else
                return pathname.toString().endsWith(".java");
        });
        for (File file1 : files) {
            if (file1.isDirectory())
                demo(file1);
            else {
                System.out.println(file1);
            }
        }
    }
}
