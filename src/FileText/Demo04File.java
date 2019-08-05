package FileText;

import java.io.File;
import java.io.IOException;

public class Demo04File {
    public static void main(String[] args) {
        
//        File file = new File("README1.md");
//        if (file.exists() == false){
//            try {
//                //只能创建文件
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println(file.exists());
        //创建单级空文件夹
        File file1 = new File("新建文件夹");
        if (!file1.exists()){
            file1.mkdir();
        }
        System.out.println(file1.exists());
//        //创建多级空文件夹
//        File file2 = new File("新建文件夹2\\钱宝宝");
//        if (!file2.exists()){
//            file2.mkdirs();
//        }
//        System.out.println(file2.exists());
//        File file3 = new File("新建文件夹2\\钱宝宝");
//        if (!file2.exists()){
//            file2.mkdirs();
//        }
//        System.out.println(file2.exists());

        delete(file1);
    }

    private static void delete(File file) {
        file.delete();
    }
}
