package Basic;

public class StringTest {
    public static void main(String[] args) {
        String str = "qwert yu";
        String str1 = "qejrinf";
        System.out.println(str.indexOf("q"));
        System.out.println(str.charAt(5));
        System.out.println(str.length());
        //判断字符串是否以指定字符串开始或者结尾
        System.out.println(str.startsWith("q"));
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
    }
}
