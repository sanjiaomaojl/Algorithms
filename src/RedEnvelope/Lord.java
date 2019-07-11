package RedEnvelope;

import java.util.ArrayList;

public class Lord extends Member{

    public Lord() {
    }

    public Lord(String name, int balance) {
        super(name, balance);
    }

    public ArrayList<Integer> send(int totalMoey, int count){
        int money = super.getMoney();
        ArrayList<Integer> list = new ArrayList<>();
        super.setMoney(super.money - totalMoey);
        int avg = totalMoey / count;
        int mod = totalMoey % count;
        for (int i = 0; i < count; i++) {
            if (i < count-1){
                list.add(avg);
            }else {
                list.add(avg + mod);
            }
        }
        return list;
    }
}
