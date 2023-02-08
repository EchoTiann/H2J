package com.porject2.TestFinal;

public class Cat extends Animal implements Pet {
    String name;

    public Cat(String name) {
        super(name, 4);
        this.name = name;
    }

    public Cat() {
        super("", 4);
    }

    @Override
    public void eat() {
        System.out.println(name + "爱吃肉类！");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String gatName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println(name + "喜欢上窜下跳的玩，喜欢被人撸");
    }
}
