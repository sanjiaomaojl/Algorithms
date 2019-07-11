package ItCast;

public class InnerClass {
    public static void main(String[] args) {
        Body body = new Body();
        body.method();
        Body.Heart heart = new Body().new Heart();
        heart.beat();

        Outer.Inner inner = new Outer().new Inner();
        inner.method();

        Outer2 outer2 = new Outer2();
        outer2.method();
    }
}
