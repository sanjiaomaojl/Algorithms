package IODemo;

import java.io.FileWriter;
import java.io.IOException;

public class Demo04Writer {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("a.txt", true);) {
            fw.write("I LOVE YOU1 BABY!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
