package org.example;

import Hero.BaseHero;
import Hero.Magician;
import Hero.Sniper;

public class Main {
    public static void main(String[] args) {
        BaseHero sniper = new Sniper("Sniper");
        BaseHero magician = new Magician("Magician");
        System.out.println(sniper.getInfo());
        System.out.println(magician.getInfo());
        sniper.Attack(magician);
        magician.Attack(sniper);
        System.out.println(sniper.getInfo());
        System.out.println(magician.getInfo());
    }
}