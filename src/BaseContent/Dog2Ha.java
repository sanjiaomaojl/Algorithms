package BaseContent;

public class Dog2Ha extends Dog{

    @Override
    public void eat() {
        super.eat();
        System.out.println("也吃狗粮~");
    }

    @Override
    public void sleep() {
        System.out.println("抱着睡~");
    }
}
