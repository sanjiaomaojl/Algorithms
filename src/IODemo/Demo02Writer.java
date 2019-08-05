package IODemo;

import java.io.FileWriter;
import java.io.IOException;

public class Demo02Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("b.txt");
        char[] chars = {'a', 'b', 'c'};
        fw.write(chars);
        fw.close();
    }
}
