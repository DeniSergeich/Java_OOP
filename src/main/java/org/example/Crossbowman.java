//Арбалетчик, дистанция средняя, высокий урон

package org.example;

import java.util.Random;

public class Crossbowman extends BaseHero{
    public Crossbowman(String name) {
        super(hp = 100,
                damage = 60,
                armor = 20,
                satiety = 1,
                blockChance = new Random().nextDouble(.01f, 1),
                name = name,
                attackDistance = 5);
    }
}
