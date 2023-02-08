package com.project1.property;

public class Armor extends Item {

    int ac;
    public static void main(String[] args) {
        Armor armor = new Armor();
        armor.ac = 10;
        armor.itemPrice = 350;
        armor.itemName = "锁子甲";
        System.out.println(armor.toString());
    }

    @Override
    public String toString() {
        return ac +"" + itemPrice + "" + itemName;
    }
}
