package com.Project1;

public class Hero {
    String name; //姓名
    float hp; //血量
    float armor; //护甲
    int moveSpeed; //移动速度

    public void setAll(String name,float hp,float armor,int moveSpeed){
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.moveSpeed = moveSpeed;
    }

    public static void main(String[] args) {
        Hero twlight = new Hero();

        twlight.setAll("暮光星灵",1000,100,350);

        System.out.println(twlight.name);
    }
    float getHp() {
        return hp;
    }

    float getArmor() {
        return armor;
    }

    void legendary() {
        System.out.println("你已经超越神了");
    }

    void recovery(float blood) {
        hp += blood;
    }

    void addSpeed(int speed) {
        moveSpeed += speed;
    }

    void keng() {
        System.out.println("太坑了！");
    }

}
