package Hero;

import java.util.Random;
public class Magician extends BaseHero {
    private int mana;
    public Magician(String name){
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
    @Override
    public String getInfo() {
        return String.format("%s  Mp: %d",super.getInfo(), this.mana);
    }
}
