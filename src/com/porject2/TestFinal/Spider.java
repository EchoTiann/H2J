package com.porject2.TestFinal;

public class Spider extends Animal{


    protected Spider() {
        super("蜘蛛",8);
    }

    @Override
    public void eat() {
        System.out.println("蜘蛛喜欢吃昆虫");
    }
}
