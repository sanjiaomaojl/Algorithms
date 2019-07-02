package BaseContent;

import java.util.Arrays;

public class ArraysText {
    public static void main(String[] args) {
        String str = "djksfhbhdjbdfhjbvdfjhj";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i] + "  ");
        }
    }



}
