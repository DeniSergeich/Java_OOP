//Снайпер атакует далеко, но обладает средним уроном
package org.example;

import java.util.Random;

public class Sniper extends BaseHero{
    public Sniper(String name) {
        super(hp = 100,
                damage = 60,
                armor = 60,
                satiety = .6f,
                blockChance = new Random().nextDouble(.01f, 1),
                name = name,
                attackDistance = 10);
    }
}
