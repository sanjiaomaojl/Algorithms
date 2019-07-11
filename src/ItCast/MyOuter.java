package ItCast;


//num是局部变量，在栈内存中，跟着方法走，方法运行结束后，立刻出栈，局部变量就会消失
//new出来的对象在堆内存中持续存在，直到垃圾回收才会消失
public class MyOuter {

    public void method(){

        int num = 10;

        class MyInner{
            public void method(){
                //num的值不能改变，必须是一个Final的
                System.out.println(num);
            }
        }

    }

}
