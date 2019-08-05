package FileText;

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {
        //路径分隔符
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);
        //文件名称分隔符
        String separator = File.separator;
        System.out.println(separator);

        File file = new File("c:\\", "a.txt");
        System.out.println(file);

    }
}
