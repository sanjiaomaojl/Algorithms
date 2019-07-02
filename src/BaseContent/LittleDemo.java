package BaseContent;

public class LittleDemo {
    public static void main(String[] args) {

        //toCharArray
        String str = "dkjfbhjJHDBAJSBFJDnkjdnsfjjn2194i193";
        char[] chars = str.toCharArray();
        System.out.println(chars.length);

        char c = "hello".charAt(1);
        System.out.println(c);

        //substr
        String s1 = "hello".substring(3);
        System.out.println(s1);

        //split分割字符串
        String s2 = "aaa,bbb,ccc";
        String[] array = s2.split(",");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
