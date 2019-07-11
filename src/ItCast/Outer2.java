package ItCast;

public class Outer2 {

    public void method(){

        class Inner2{
            int num = 10;
            public void InnerMethod(){
                System.out.println(num);
            }
        }
        Inner2 inner2 = new Inner2();
        inner2.InnerMethod();
    }
}
