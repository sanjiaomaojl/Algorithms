package ItCast;

public class Body {
    public class Heart{
        public void beat(){
            System.out.println("心脏跳动~");
        }
    }

    public void method(){
//        Heart heart = new Heart();
//        heart.beat();
        new Heart().beat();
    }

}
