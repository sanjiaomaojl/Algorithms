package IODemo;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01FileInPutStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        int len = 0;
        while ((len = fis.read()) != -1){
            System.out.println(len);
        }
        fis.close();
    }
}
