package IODemo;

import java.io.*;

public class BufferCopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("yu.png");
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] bytes = new byte[1024];
        int len = 0;
        FileOutputStream fos = new FileOutputStream("copy.png");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes, 0, len);
        }
        bos.flush();
        bos.close();
        bis.close();
    }
}
