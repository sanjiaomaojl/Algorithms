package IODemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo02FileInPutStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("b.txt");
        byte[] bytes = new byte[2];
        int read = fis.read(bytes);
        System.out.println(read);
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));
        fis.close();
    }
}
