package Recursive;

import java.io.File;
import java.io.FilenameFilter;

public class DemoRecursive04 {
    public static void main(String[] args) {
        File file = new File("D:\\IDEA-workspace\\Interview");
        demo(file);
    }
    private static void demo(File file) {
         File[] files  = file.listFiles((dir, name) ->
                 new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java"));
    }
}
