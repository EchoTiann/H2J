package com.project1;

import com.project1.charactor.ADHero;
import com.project1.charactor.Hero;
import com.project1.charactor.Support;

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