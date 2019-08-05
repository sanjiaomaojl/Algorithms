package Lambda;

public class Text02 {

    public static void main(String[] args) {
        invoke(20, 30, new Calculator() {
            @Override
            public int cal(int a, int b) {
                return a + b;
            }
        });

        invoke(20, 3, (int a, int b) -> a + b);
    }

    public static void invoke(int a, int b, Calculator calculator){
        System.out.println("和为" + calculator.cal(a, b));
    }

}
