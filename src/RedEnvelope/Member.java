package RedEnvelope;

public class Member {

    String name;
    int money;

    public Member() {
    }

    public Member(String name, int balance) {
        this.name = name;
        this.money = balance;
    }

    public void show(){
        System.out.println("我是"+name+",有"+money+"钱");
    }

    public int balance(){
        return money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
