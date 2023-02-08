package com.porject2.TestFinal;

public abstract class Animal {

    protected String type;
    protected int legs;

    protected Animal(String type,int legs){
        this.legs = legs;
        this.type = type;
    }
    public abstract void eat();

    public void walk(String type,int legs) {
        System.out.println(type + "用" + legs + "条腿走路");
    }
}
