package com.porject2.TestFinal;

public class Fish extends Animal implements Pet{

    public String name;

    protected Fish(String name){
        super(name,0);
    }

    protected Fish(){
        super("",0);
    }
    @Override
    public void eat() {
        System.out.println(name + "喜欢吃昆虫");
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
        System.out.println(name + "喜欢游来游去");
    }
}
