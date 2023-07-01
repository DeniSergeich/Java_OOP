//Монах лечит всех на поле боя

package Hero;

import Hero.BaseHero;

import java.util.Random;

public class Monk extends BaseHero {
    private int mana;

    public Monk(String name){
        super(name);
        super.hp = 100;
        super.damage = 50;
        super.armor = 20;
        super.satiety = 100;
        super.blockChance = new Random().nextDouble(.1f,1);
        super.name = name;
        super.attackDistance = 10;
        this.mana = 100;
    }

    @Override
    public void step() {

    }

    public String getInfo() {
        return String.format("%s  Mana: %d",super.getInfo(), this.mana);
    }
}
