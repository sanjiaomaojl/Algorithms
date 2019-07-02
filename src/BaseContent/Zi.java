package BaseContent;

public class Zi extends Fu{

    int num = 20;

    public Zi(){
        this(123);
        System.out.println("456");
    }

    public Zi(int n){
        super();

        System.out.println("456");
    }

    public void method(){
        super.method();
        int num = 20;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
