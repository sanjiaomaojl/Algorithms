package IODemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("bew.txt"), "utf-8");
        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("GBK.txt"), "GBK");
        osw2.write("你好呀~");
        osw2.flush();
        osw2.close();
    }
}
