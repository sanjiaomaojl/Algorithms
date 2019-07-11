package InterfaceDemo;

public interface MyInterface {
    int NUM = 10;

    //java8可以定义默认方法
    default void methodDefault(){
        System.out.println("默认方法");
    }

    //java8可以定义静态方法
    //只能通过接口名称进行调用，不能通过实现类进行调用
    static void methodStatic(){
        System.out.println("静态方法");
    }

    //java9可以定义私有方法
    //普通私有方法
    private void methodPrivate(){
        System.out.println("普通私有方法");
    }

    //静态私有方法
    private static void methodStaticPrivate(){
        System.out.println("静态私有方法");
    }
}
