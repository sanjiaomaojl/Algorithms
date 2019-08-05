package FileText;

import java.io.File;

public class Demo03File {
    public static void main(String[] args) {
        //判断文件和目录是否存在
        File file = new File("D:\\CloudMusic\\CloudMusic\\skin");
        System.out.println(file.exists());

        File file1 = new File("D:\\CloudMusic\\CloudMusic\\skins");
        System.out.println(file1.exists());

        File file2 = new File("README.md");
        System.out.println(file2.exists());
        //判断构造方法中给的路径是否以文件夹结尾
        File file3 = new File("README.md");
        System.out.println(file3.isDirectory());
        //判断构造方法中给的路径是否以文件结尾
        //电脑硬盘只有文件/文件夹，两个方法互斥，前提：路径必须存在，否则都返回false
        File file4 = new File("README.md");
        System.out.println(file4.isFile());
    }
}
