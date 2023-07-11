package org.example;

import Hero.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<BaseHero> teamOne = new ArrayList<>();
        ArrayList<BaseHero> teamTwo = new ArrayList<>();
        ArrayList<BaseHero> team = new ArrayList<>();
        fillList(teamOne,0);
        fillList(teamTwo,9);
        team.addAll(teamOne);
        team.addAll(teamTwo);
        team.sort(Comparator.comparingInt(BaseHero::getInitiative));
        System.out.println("Команда 1:");
        System.out.println();
        teamOne.forEach(c -> System.out.println(c.getInfo()));
        System.out.println();
        System.out.println("Команда 2:");
        System.out.println();
        teamTwo.forEach(c -> System.out.println(c.getInfo()));
        System.out.println();
        System.out.println("*************************");
        for (BaseHero c:
             team) {
            if(teamOne.contains(c)) c.step(teamTwo,teamOne);
            else c.step(teamOne,teamTwo);
        }
        System.out.println();
        System.out.println("Команда 1:");
        System.out.println();
        for (BaseHero c:
                teamOne) {
            c.getInfo();
        }
        System.out.println();
        System.out.println("Команда 2:");
        System.out.println();
        for (BaseHero c:
                teamTwo) {
            c.getInfo();
        }
    }


    public static void fillList (ArrayList <BaseHero> list, int xPosition) {
        for (int i = 0; i < 10; i++) {
            int cnt = new Random().nextInt(0, 7);
            switch (cnt) {
                case 0: {
                    list.add(new Bandit(xPosition, i));
                    break;
                }
                case 1: {
                    list.add(new Crossbowman(xPosition, i));
                    break;
                }
                case 2: {
                    list.add(new Magician(xPosition, i));
                    break;
                }
                case 3: {
                    list.add(new Monk(xPosition, i));
                    break;
                }
                case 4: {
                    list.add(new Peasant(xPosition, i));
                    break;
                }
                case 5: {
                    list.add(new Sniper(xPosition, i));
                    break;
                }
                default: {
                    list.add(new Spearman(xPosition, i));
                    break;
                }
            }
        }
    }

}