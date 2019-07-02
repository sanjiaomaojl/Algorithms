package BaseContent;

public class StringText {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3};
        String array1 = getArray(array);
        System.out.println(array1);

        System.out.println("one");
        System.out.println("one");

    }

    public static String getArray(int[] array){
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1){
                result += "word" + array[i] + "]";
            }else {
                result += "word" + array[i] + "#";
            }
        }
        return result;

    }

}
