package IODemo;

import java.io.FileReader;
import java.io.IOException;

public class DemoReader01 {
    public static void main(String[] args) throws IOException {
        FileReader fe = new FileReader("README.md");
        int len = 0;
        while ((len = fe.read()) != -1){
            System.out.print((char) len);
        }
        fe.close();
    }
}
