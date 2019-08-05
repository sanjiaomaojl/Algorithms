package IODemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("gbk.txt"), "GBK");
        int len;
        while ((len = isr.read()) != -1){
            System.out.print((char) len);
        }
    }
}
