//Снайпер атакует далеко, но обладает средним уроном
package Hero;

import Hero.BaseHero;

import java.util.Random;

public class Sniper extends BaseHero {
    public Sniper(String name) {
        super(name);
        super.hp = 100;
        super.damage = 80;
        super.armor = 20;
        super.satiety = 100;
        super.blockChance = new Random().nextDouble(.1f,1);
        super.name = name;
        super.attackDistance = 10;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
