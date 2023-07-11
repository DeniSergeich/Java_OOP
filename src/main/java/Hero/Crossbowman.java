package Hero;

import java.util.ArrayList;

public class Crossbowman extends Shooter {
    public Crossbowman(int x, int y){

        super(x, y);
        super.type = "Арбалетчик";
    }
    @Override
    public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> team2) {

    }
    @Override
    public String getInfo() {
        return String.format("%s Hp:%d Arrows:%d", super.name, super.hp, this.arrow);
    }
}
