//Крсетьянин может кормить бойцов на поле боя, от уровня сытости зависит урон героя.
// У крестьянина есть запас еды, который он может раздавать бойцам, и все характеристики наследуемые из класса BaseHero.

package org.example;

import java.util.Random;

public class Peasant extends BaseHero {
    private int food; // запас еды у крестьянина
    public Peasant(String name){
        super(hp = 100,
                damage = 20,
                armor = 50,
                satiety = 1,
                blockChance = new Random().nextDouble(.01f, 1),
                name = name,
                attackDistance = 1);
        this.food = 100;
    }

}
