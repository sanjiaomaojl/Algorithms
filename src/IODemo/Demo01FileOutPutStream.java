package IODemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01FileOutPutStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        fos.write(97);
        byte[] bytes = "你好".getBytes();
        fos.write(bytes);
        fos.close();
    }
}
