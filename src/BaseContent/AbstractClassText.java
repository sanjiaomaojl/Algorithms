package BaseContent;

/**
 * 抽象类不一定要有抽象方法，相反必须需要有
 */
public abstract class AbstractClassText {

    public AbstractClassText(){
        System.out.println("父类构造方法执行！");
    }

    public abstract void method();

}
