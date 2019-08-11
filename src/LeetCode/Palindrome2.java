package LeetCode;

public class Palindrome2 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static int isPalindrome(int x) {
         int rev = 0;
         int b = x;
        while ( b != 0){
            int pop = b % 10;
            b = b / 10;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
