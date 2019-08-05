package IODemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo01 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("1.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("123");
        bw.flush();
        bw.close();
    }
}
