package com.porject2.charactor;

public class Hero {
    String name;
    int hp;

    class BattleScore {
        int kill;
        int die;
        int asSit;

        public void legendary() {
            if (kill >= 8)
                System.out.println(name + "超神！");
            else
                System.out.println(name + "尚未超神！");
        }
    }

    public static void main(String[] args) {
        Hero galen = new Hero();
        galen.name = "盖伦";

        BattleScore score = galen.new BattleScore();
        score.kill = 10;
        score.legendary();
    }
//    public abstract void attack();
}
