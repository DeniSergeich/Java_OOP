package org.example;

import Hero.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BaseHero bandit = new Bandit("Разбойник");
        BaseHero crossbowman = new Crossbowman("Арбалетчик");
        BaseHero sniper = new Sniper("Снайпер");
        BaseHero magician = new Magician("Маг");
        BaseHero monk = new Monk("Монах");
        BaseHero peasant = new Peasant("Крестьянин");
        BaseHero spearman = new Spearman("Копейщик");


        ArrayList<BaseHero> teamOne = new ArrayList<>();
        ArrayList<BaseHero> teamTwo = new ArrayList<>();
        fillList(teamOne);
        fillList(teamTwo);
        for (BaseHero c:
                teamOne) {
            System.out.println(c.getInfo());
        }
        System.out.println("------------------------");
        for (BaseHero c:
                teamTwo) {
            System.out.println(c.getInfo());
        }
    }


    public static void fillList (ArrayList < BaseHero > list) {
        for (int i = 0; i < 10; i++) {
            int cnt = new Random().nextInt(0, 7);
            switch (cnt) {
                case 0: {
                    list.add(new Bandit("Разбойник"));
                    break;
                }
                case 1: {
                    list.add(new Crossbowman("Арбалетчик"));
                    break;
                }
                case 2: {
                    list.add(new Magician("Маг"));
                    break;
                }
                case 3: {
                    list.add(new Monk("Монах"));
                    break;
                }
                case 4: {
                    list.add(new Peasant("Крестьянин"));
                    break;
                }
                case 5: {
                    list.add(new Sniper("Снайпер"));
                    break;
                }
                default: {
                    list.add(new Spearman("Копейщик"));
                    break;
                }
            }
        }
    }
}