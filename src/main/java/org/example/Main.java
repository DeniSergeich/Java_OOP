package org.example;

import Hero.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<BaseHero> teamOne = new ArrayList<>();
        ArrayList<BaseHero> teamTwo = new ArrayList<>();
        fillList(teamOne,0);
        fillList(teamTwo,9);

        for (BaseHero c: teamOne) {
            System.out.println();
        }

        System.out.println("Команда 1:");
        System.out.println();
        for (BaseHero c:
                teamOne) {
            c.lookAround(teamTwo);
        }

        System.out.println();
        System.out.println("Команда 2:");
        System.out.println();
        for (BaseHero c:
                teamTwo) {
            c.lookAround(teamOne);
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