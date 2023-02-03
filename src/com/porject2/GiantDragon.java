package com.porject2;

public class GiantDragon {
    private GiantDragon(){

    }
    private static final GiantDragon instance = new GiantDragon();
    public static GiantDragon getInstance(){
        return instance;
    }
}

