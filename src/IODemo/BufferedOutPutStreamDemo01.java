package IODemo;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutPutStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("buffer.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("something...".getBytes());
        bos.flush();
        bos.close();
    }
}
