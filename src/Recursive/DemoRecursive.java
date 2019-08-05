package Recursive;

public class DemoRecursive {
    public static void main(String[] args) {
        //System.out.println(sum(2));
        System.out.println(Multiply(3));
    }

    private static int Multiply(int n) {
        if (n == 1)
            return 1;
        return n * Multiply(n - 1);
    }

    private static int sum(int n) {
        if (n == 1){
            return 1;
        }
        return n + sum(n -1);
    }
}
