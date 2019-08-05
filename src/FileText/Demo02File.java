package FileText;

import java.io.File;

public class Demo02File {
    public static void main(String[] args) {
        //返回绝对路径
        File file = new File("D:\\CloudMusic\\CloudMusic\\skin");
        System.out.println(file.getAbsolutePath());
        System.out.println(new File("a.txt").getAbsolutePath());
        //获取路径 toString()和getPath()是一样的
        File file1 = new File("D:\\IDEA-workspace\\Interview\\a.txt");
        File file2 = new File("a.txt");
        System.out.println(file1.getPath());
        System.out.println(file2.toString());
        //getName() 获取构造方法传递的结尾部分 文件/文件夹
        File file3 = new File("D:\\IDEA-workspace\\Interview\\a.txt");
        System.out.println(file3.getName());
        //length()获取后遭方法指定文件的大小,以字节为单位 文件夹没有大小概念，不存在的文件字节为0
        System.out.println(file3.length());
    }
}
