package IODemo;

public class Pz {
    public static void main(String[] args) {
        String name = "1.zheshi1";
        String[] split = name.split("\\.");
        System.out.println(split.length);
        System.out.println(split[0]);
    }
}
