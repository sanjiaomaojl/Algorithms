package IODemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInPutStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("buffer.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int len;
        while ((len = bis.read()) != -1){
            System.out.println(len);
        }
        bis.close();
    }
}
