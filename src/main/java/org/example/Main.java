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
        for (BaseHero person:
             team) {
            if(teamOne.contains(person)) person.step(teamTwo,teamOne);
            else person.step(teamOne,teamTwo);
        }
        System.out.println();
        System.out.println("Команда 1:");
        for (BaseHero person: teamOne) {
            System.out.println(person.getInfo());
        }
        System.out.println();
        System.out.println("Команда 2:");
        for (BaseHero person: teamTwo) {
            System.out.println(person.getInfo());
        }
    }


    public static void fillList (ArrayList <BaseHero> list, int xPosition) {
        for (int i = 0; i < 10; i++) {
            int cnt = new Random().nextInt(0, 7);
            int pos = new Random().nextInt(0,2);
            if(xPosition>5) pos *= -1;
            switch (cnt) {
                case 0 -> list.add(new Bandit(xPosition+pos, i));
                case 1 -> list.add(new Crossbowman(xPosition+pos, i));
                case 2 -> list.add(new Magician(xPosition+pos, i));
                case 3 -> list.add(new Monk(xPosition+pos, i));
                case 4 -> list.add(new Peasant(xPosition+pos, i));
                case 5 -> list.add(new Sniper(xPosition+pos, i));
                case 6 -> list.add(new Spearman(xPosition+pos, i));
            }
        }
    }

}