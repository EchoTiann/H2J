package com.project1;

import com.charactor.Hero;
import com.property.Item;

public class Main {
    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.heroName = "盖伦";
        garen.heroHp = 616.28f;
        System.out.println(garen.heroName + " 当前的血量是 " +garen.heroHp);
        garen.heroArmor = 27.536f;
        garen.heroMoveSpeed = 350;
        System.out.println("回血1000");
        garen.recovery(1000.0f);
        System.out.println("现在的血量是:" + garen.heroHp);

        Hero teemo = new Hero();
        teemo.heroName = "提莫";
        teemo.heroHp = 383f;
        teemo.heroArmor = 14f;
        teemo.heroMoveSpeed = 330;
        teemo.recovery(30.0f);

        Item blood = new Item();
        blood.itemName = "血瓶";
        blood.itemPrice = 50;

        Item shoe = new Item();
        shoe.itemName = "草鞋";
        shoe.itemPrice = 300;

        Item sword = new Item();
        sword.itemName = "长剑";
        sword.itemPrice = 350;

        for(var hero : Hero.HeroType.values()) {
//            switch (hero) {
//                case TANK:
//                    System.out.println(hero.getName());
//                    break;
//                case ASSASSIN:
//                    System.out.println(hero.getName());
//                    break;
//                case ASSIST:
//                    System.out.println(hero.getName());
//                    break;
//                case FARMING:
//                    System.out.println(hero.getName());
//                    break;
//            }
            System.out.println(hero);
        }
    }
}