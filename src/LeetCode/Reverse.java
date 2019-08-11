package LeetCode;

public class Reverse {

    public static void main(String[] args) {
        Reverse re = new Reverse();
        System.out.println(re.reverses(123));

    }

    public int reverses(int x) {
        int rev = 0;
        while (x != 0){
            int pop = x % 10;
            x /= 10;

            rev = rev * 10 + pop;
        }

        return rev;
    }
}
