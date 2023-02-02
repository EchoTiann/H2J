package com.porject2;

public class Hero1 {
    /**
     * 姓名
     */
    protected String name;

    /**
     * 血量
     */
    protected Float hp;
    /**
     * 护甲
     */
    protected Float armor;
    /**
     * 移动速度
     */
    protected Integer moveSpeed;

    /**
     * 战绩
     */
    protected Standings data;

    @Override
    public String toString() {
        return "com.porject2.Hero1{" +
                "姓名='" + name + '\'' +
                ", 血量=" + hp +
                ", 护甲=" + armor +
                ", 移动速度=" + moveSpeed +
                ", 战绩=" + data +
                '}';
    }

    public Hero1() {
    }

    public Hero1(String name, Float hp, Float armor, Integer moveSpeed, Standings data) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.moveSpeed = moveSpeed;
        this.data = data;
    }
}
