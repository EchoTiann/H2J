package com.charactor;

public class ADAPHero extends Hero implements AP,AD{
    @Override
    public void magicAttack() {
        System.out.println("进行了魔法攻击");
    }

    @Override
    public void physicAttack() {
        System.out.println("进行了物理攻击");
    }
}
