package InterfaceDemo;

public class InstacnceofDemo {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.active();
        }

        //匿名内部类
        MyInterface2 inter = () -> System.out.println("匿名内部类实现了方法");

        //λ表达式
        MyInterface2 inter2 = () -> {
            int a = 10;
            System.out.println(a);
        };

    }
}
