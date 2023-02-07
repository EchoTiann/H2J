package com.charactor;

/*设计一个类Support (辅助英雄)继承Hero，提供一个heal(治疗)方法
对Support的heal方法进行重载
heal()
heal(Hero h) //为指定的英雄加血
heal(Hero h, int hp) //为指定的英雄加了hp的血*/
public class Support extends Hero implements Healer {
    @Override
    public void heal() {
        System.out.println("进行了治疗术");
    }

    public void heal(Hero h) {
        System.out.println("给英雄 " + h + " 加血");
    }

    public void heal(Hero h, int hp) {
        System.out.println("给英雄 " + h.heroName + " 加了 " + hp + "点血");
    }

    public void heal(Support support,Hero hero,int hp){
        System.out.println(support.heroName+" 给 " + hero.heroName + " 加了 " + hp + "点血");
    }
    public static void main(String[] args) {
        Support qinnv = new Support();
        Hero twilight = new Hero();
        Hero temmo = new Hero();

        twilight.setAll("暮光星灵", 1000, 100, 350);
        temmo.setAll("提莫", 800, 50, 400);
        qinnv.setAll("琴女", 300, 50, 350);
        qinnv.heal(twilight, 100);
        qinnv.heal(qinnv,temmo,200);
        System.out.println(twilight.heroHp);
    }
}
