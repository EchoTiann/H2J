package com.Project1;

import java.util.List;
import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        List<Hero1> list = new ArrayList<>();
        list.add(new Hero1("盖伦",
                1100.00F,
                85.0F,
                345,
                new Standings(10,
                        2,
                        7,
                        1748F,
                        243,
                        1.01F,
                        "德玛西亚",
                        "德玛西亚永不灭亡")));

        list.add(new Hero1("提姆",
                800.00F,
                39.0F,
                385,
                new Standings(7,
                        3, 11,
                        978F,
                        223,
                        1.68F,
                        "哼哈哼哈",
                        "额")));
        list.forEach(System.out::println);
    }
}