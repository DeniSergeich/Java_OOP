package Hero;

import java.util.Random;

public class Bandit extends BaseHero {
    public Bandit(String name){
        super(name);
        super.maxHp = super.hp = 100;
        super.damage = 35;
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
