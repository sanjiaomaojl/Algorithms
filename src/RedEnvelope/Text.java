package RedEnvelope;

import java.util.ArrayList;

public class Text {
    public static void main(String[] args) {
        Lord lord = new Lord("群主", 100);
        Group m1 = new Group("m1", 0);
        Group m2 = new Group("m2", 0);
        Group m3 = new Group("m3", 0);
        ArrayList<Integer> list = lord.send(20,3);
        m1.recive(list);
        m2.recive(list);
        m3.recive(list);
        lord.show();
        m1.show();
        m2.show();
        m3.show();
    }
}
