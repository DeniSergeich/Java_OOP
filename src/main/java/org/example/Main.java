package org.example;

public class Main {
    public static void main(String[] args) {
        BaseHero sniper = new Sniper("Снайпер");
        BaseHero magician = new Magician("Маг");
        System.out.println(sniper.getInfo());
        System.out.println(magician.getInfo());
        magician.Attack(sniper);
        System.out.println(sniper.getInfo());
        sniper.Attack(magician);
        System.out.println(magician.getInfo());
    }
}