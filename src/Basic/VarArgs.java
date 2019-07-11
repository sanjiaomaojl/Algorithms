package Basic;

public class VarArgs {

    public static void main(String[] args) {
        System.out.println(add(10, 20, 30));

    }

    //可变参数只能有一个
    //方法的参数有多个，可变参数必须放在末尾
    public static int add(int...arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static int add(String a, int...arr){
        return 0;
    }

}
