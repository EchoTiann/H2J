package com.project1.charactor;

public  class Hero {

    public enum HeroType{
        TANK ("坦克"),
        WIZARD ("法师"),
        ASSASSIN ("刺客"),
        ASSIST ("辅助"),
        WARRIOR ("近战"),
        RANGED ("远程"),
        PUSH ("推进"),
        FARMING ("打野");


        private final String name;
        HeroType(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }
    public String heroName; //姓名
    public float heroHp; //血量
    public float heroArmor; //护甲
    public int heroMoveSpeed; //移动速度
    public static String copyright;
    public float heroHpToDie;

    public void setHeroHpToDie() {
        heroHp = 0;
    }
    public void recovery(float blood) {
        heroHp += blood;
    }
    public void setAll(String name, float hp, float armor, int moveSpeed) {
        this.heroName = name;
        this.heroHp = hp;
        this.heroArmor = armor;
        this.heroMoveSpeed = moveSpeed;
    }
/*
    public void attack(Hero hero, int damage) {
        hero.heroHp -= damage;
    }
*/




    public static void battleWin(){
        System.out.println("battleWin");
    }
    public static void main(String[] args) {
 /*       Hero twilight = new Hero();
        Hero temmo = new Hero();
        ADHero adHero = new ADHero();
        APHero apHero = new APHero();

        twilight = adHero;
        temmo = apHero;

        System.out.println(twilight instanceof ADHero);
        System.out.println(temmo instanceof  APHero);
        System.out.println(twilight instanceof Hero);

        twilight.setAll("暮光星灵", 1000, 100, 350);
        temmo.setAll("提莫", 800, 50, 400);

        twilight.attack(temmo, 400);
        twilight.setHeroHpToDie();
        System.out.println(twilight.heroHp);
        twilight.recovery(500);
        System.out.println(twilight.heroHp);
        System.out.println(temmo.heroHp);

        Hero.battleWin();
        System.out.println(temmo.toString());
        System.out.println(temmo);

        for (int i = 0; i < 10000000; i++) {
            Hero h1 = new Hero();
        }
*/    }
    public void finalize(){
        System.out.println("此对象正在被回收");
    }


    /*float getHp() {
        return heroHp;
    }

    float getArmor() {
        return heroArmor;
    }

    void legendary() {
        System.out.println("你已经超越神了");
    }*/


    /*void addSpeed(int speed) {
        heroMoveSpeed += speed;
    }

    void keng() {
        System.out.println("太坑了！");
    }*/

}
