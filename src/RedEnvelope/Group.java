package RedEnvelope;

import java.util.ArrayList;
import java.util.Random;

public class Group extends Member{
    public Group() {
    }

    public Group(String name, int balance) {
        super(name, balance);
    }

    public void recive(ArrayList<Integer> list){
        int index = new Random().nextInt(list.size());
        int delta = list.remove(index);
        //本来的钱
        int money = super.getMoney();
        super.setMoney(money + delta);
    }

}
