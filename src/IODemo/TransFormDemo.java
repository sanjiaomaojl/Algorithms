package IODemo;

import java.io.*;

public class TransFormDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("GBK.txt"), "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("UTF-8.txt"), "UTF-8");
        int len;
        while ((len = isr.read()) != -1){
            osw.write(len);
        }
        isr.close();
        osw.close();
    }
}
