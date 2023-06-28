//Бандит (разбойник) ходит и незаметно крадет еду у остальных персонажей,брони нет, не получает урон

package org.example;

import java.util.Random;

public class Bandit extends BaseHero{

    public Bandit(String name) {
        super(hp = 100,
                damage = 20,
                armor = 0,
                satiety = 1,
                blockChance = 1,
                name = name,
                attackDistance = 1);
    }
}
