//Монах лечит всех на поле боя

package org.example;

import java.util.Random;

public class Monk extends BaseHero{
    private static int mana;
    public Monk(String name) {
        super(hp = 100,
                damage = 30,
                armor = 60,
                satiety = 1,
                blockChance = new Random().nextDouble(.01f, 1),
                name = name,
                attackDistance = 10);
        this.mana = 100;
    }
    public String getInfo() {
        return String.format("%s  Mana: %d",super.getInfo(), this.mana);
    }
}
