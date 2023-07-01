//Арбалетчик, дистанция средняя, высокий урон

package Hero;

import java.util.Random;

public class Crossbowman extends BaseHero {
    public Crossbowman(String name){
        super(name);
        super.hp = 100;
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
