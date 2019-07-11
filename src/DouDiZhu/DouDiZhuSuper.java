package DouDiZhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

//升级版斗地主+增加排序功能
public class DouDiZhuSuper {
    public static void main(String[] args) {
        List<String> colors = List.of("♥", "♠", "♣", "♦");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        ArrayList<Integer> pokerIndex = new ArrayList<>();
        HashMap<Integer, String> poker = new HashMap<>();

        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "小王");
        pokerIndex.add(index);
        index++;

        //组装牌
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index, color+number);
                pokerIndex.add(index);
                index++;
            }
        }
        //打乱牌
        Collections.shuffle(pokerIndex);

        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();


        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer key = pokerIndex.get(i);
            if (i > 50)
                diPai.add(key);
            else if (i % 3 == 0){
                player1.add(key);
            }
            else if (i % 3 == 1){
                player2.add(key);
            }
            else if (i % 3 == 2){
                player3.add(key);
            }
        }

        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(diPai);

        kanPai("钱宝宝", player1, poker);
        kanPai("张京龙", player2, poker);
        kanPai("送钱童子", player3, poker);
        kanPai("底牌", diPai, poker);

    }

    private static void kanPai(String name, ArrayList<Integer> list, HashMap<Integer, String> poker) {

        System.out.print(name + ":");
        for (Integer key : list) {
            System.out.print(poker.get(key));
        }
        System.out.println();

    }

}
