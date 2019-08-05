package Lambda;

public class ChinaCooker{
    public static void main(String[] args) {
        invokeCook(() -> System.out.println("中国菜"));
        invokeCook(() -> System.out.println("越南菜"));
        invokeCook(() -> System.out.println("川湘菜"));
    }

    public static void invokeCook(Cook cook){
        cook.makeFood();
    }

}
