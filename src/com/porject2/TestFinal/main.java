package com.porject2.TestFinal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Cat whiteCat = new Cat();
        whiteCat.name = "西瓜";
        whiteCat.eat();
        whiteCat.play();
        whiteCat.setName("Renee");
        whiteCat.eat();
    }
}
