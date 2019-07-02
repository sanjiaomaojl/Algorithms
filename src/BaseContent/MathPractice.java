package BaseContent;

//计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有几个
public class MathPractice {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        int num = 0;
        for (int i = (int)min; i < max; i++) {
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1)
                num++;
        }
        System.out.println(num);
    }
}
