package ObjectStream;

import java.io.Serializable;

public class Person implements Serializable {
    //把序列号定义为final,无论类怎么修改,序列号都不会发生改变，不会发生序列号从冲突的异常
    static final long serialVersionUID = 42L;
    String name;
    //被transient修饰的变量不能别序列化和反序列化
    //transient int age;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
