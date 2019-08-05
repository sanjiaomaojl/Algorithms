package IODemo;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("也是测试哦");
        PrintStream ps = new PrintStream("kmk.txt");
        //change something
        System.setOut(ps);
        System.out.println("测试一下");
    }
}
