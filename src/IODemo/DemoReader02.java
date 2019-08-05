package IODemo;

import java.io.FileReader;
import java.io.IOException;

public class DemoReader02 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("README.md");
        char[] chars = new char[1024];
        int len = 0;
        while ((len = fr.read(chars)) != -1){
            System.out.println(new String(chars, 0, len));
        }
        fr.close();
    }
}
