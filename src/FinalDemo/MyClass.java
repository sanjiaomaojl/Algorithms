package FinalDemo;

//不可以有子类，不能作父类
public final class MyClass {
    public final void method(){
        System.out.println("不可覆盖重写的方法");
    }

    public static void main(String[] args) {
        int a = 10;
        final int b = 20;
    }
}
