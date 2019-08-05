package IODemo;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo03FileInPutStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream ("b.txt");
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1){
            System.out.println(new String(bytes, 0, len));
        }
        fis.close();
    }
}
