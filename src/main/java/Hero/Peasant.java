//Крсетьянин может кормить бойцов на поле боя, от уровня сытости зависит урон героя.
// У крестьянина есть запас еды, который он может раздавать бойцам, и все характеристики наследуемые из класса BaseHero.

package Hero;

import Hero.BaseHero;

import java.util.Random;

public class Peasant extends BaseHero {
    private int food; // запас еды у крестьянина

    public Peasant(String name){
        super(name);
        super.hp = 100;
        super.damage = 80;
        super.armor = 20;
        super.satiety = 100;
        super.blockChance = new Random().nextDouble(.1f,1);
        super.name = name;
        super.attackDistance = 10;
        this.food = 100;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
