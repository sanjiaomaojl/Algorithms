package IODemo;

import java.io.FileWriter;
import java.io.IOException;

public class Demo03Writer {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("a.txt", true);
            fw.write("I LOVE YOU1 BABY!");

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
