package IODemo;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("print.txt");
        ps.println("fmkf");
        ps.write(97);
        ps.close();
    }
}
