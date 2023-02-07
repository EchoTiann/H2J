package com.porject2;

import com.charactor.ADHero;
import com.charactor.Hero;
import com.charactor.Support;

public class Demo1 {

    public static void main(String[] args) {
        Hero h = new Hero();
        ADHero ad = new ADHero();
        Support s = new Support();

        h = ad;
        ad = (ADHero) h;
        h = s;
        ad = (ADHero) h;
    }
}