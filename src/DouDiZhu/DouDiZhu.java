package DouDiZhu;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu{


    public static void main(String[] args) {

        //扑克
        ArrayList<String> poker = new ArrayList<>();
        //花色
        ArrayList<String> flowerColor = new ArrayList<>();
        flowerColor.add("♥");
        flowerColor.add("♠");
        flowerColor.add("♣");
        flowerColor.add("♦");
        //数字
        ArrayList<String> num = new ArrayList<>();
        num.add("A");
        for (int i = 2; i < 11; i++) {
            num.add(String.valueOf(i));
        }
        num.add("J");
        num.add("Q");
        num.add("K");
        //大小王
        poker.add("大王");
        poker.add("小王");

        for (String flowerColors : flowerColor) {
            for (String nums : num) {
                poker.add(flowerColors + nums);
            }
        }

        Collections.shuffle(poker);

        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();

        for (int i = 0; i < poker.size() - 3; i++) {
            if (i % 3 == 0){
                p1.add(poker.get(i));
            }
            if (i % 3 == 1){
                p2.add(poker.get(i));
            }
            if (i % 3 == 2){
                p3.add(poker.get(i));
            }
        }
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        poker.removeAll(p1);
        poker.removeAll(p2);
        poker.removeAll(p3);
        System.out.println(poker);

        ArrayList<String> text = new ArrayList<>();
        text.addAll(p1);
        System.out.println(p1);
        Collections.sort(p1);
        System.out.println(p1);
    }

    //错误的写法
    public int compare(String o1, String o2) {
        if (o1 == "大王")
            o1 = "17";
        else if (o1 == "小王")
            o1 = "16";
        else if (o1.substring(1) == "2")
            o1 = "15";
        else if (o1.substring(1) == "A"){
            o1 = "14";
        }else if (o1.substring(1) == "J"){
            o1 = "11";
        }else if (o1.substring(1) == "Q"){
            o1 = "12";
        }else if (o1.substring(1) == "K"){
            o1 = "13";
        }
        int x = Integer.parseInt(o1.substring(1));
        int y = Integer.parseInt(o2.substring(1));
        return x - y;
    }
}
