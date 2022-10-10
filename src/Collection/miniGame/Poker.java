package Collection.miniGame;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author HuangGuoFu
 * @Date 2022/10/10 9:19
 **/


public class Poker {
    public static void main(String[] args) {
        // 创建一个牌盒子
        ArrayList<String> pokerBox = new ArrayList<>();
        // 创建花色
        ArrayList<String> colors = new ArrayList<>();
        // 创建牌数
        ArrayList<String> numbers = new ArrayList<>();

        // 添加花色
        colors.add("♦");
        colors.add("♥");
        colors.add("♣");
        colors.add("♠");

        // 添加牌数
        for (int i = 2; i <= 10; i++) {
            numbers.add(i + "");
        }
        numbers.add("A");
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        // 组合出除了大小鬼之外的牌数
        for (String color : colors) {
            for (String number : numbers) {
                String card = color + number;
                pokerBox.add(card);
            }
        }


        // 添加大小鬼牌
        pokerBox.add("大♛");
        pokerBox.add("小♛");

        // 打乱牌牌的顺序
        Collections.shuffle(pokerBox);

//        for (String box : pokerBox) {
//            System.out.print(box + " ");
//        }

        // 创建玩家
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        // 留三张底牌
        ArrayList<String> diPai = new ArrayList<>();

        // 将底牌添加到底牌集合中
        for (int i = 0; i < pokerBox.size(); i++) {
            String card = pokerBox.get(i);
            if (i >= 51) {
                diPai.add(card);
            } else {
                if (i % 3 == 0) {
                    player1.add(card);
                } else if (i % 3 == 1) {
                    player2.add(card);
                } else {
                    player3.add(card);
                }
            }

        }

        // 遍历player1、player2、player3
        System.out.print("player1 ");
        for (String s : player1) {
            System.out.print(s + " ");
        }
        System.out.println("\n");
        System.out.print("player2 ");
        for (String s : player2) {
            System.out.print(s + " ");
        }
        System.out.println("\n");
        System.out.print("player3 ");
        for (String s : player3) {
            System.out.print(s + " ");
        }
        System.out.println("\n");
        for (String s : diPai) {
            System.out.print(s + " ");
        }
    }
}
