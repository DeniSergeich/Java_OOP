package Hero;

import Map.Coordinates;

import java.util.ArrayList;
import java.util.Random;

public class Crossbowman extends Warrior {
    public Crossbowman(int x, int y){

        super(x, y);
        super.type = "Арбалетчик";
    }
    @Override
    public void step(ArrayList<BaseHero> team) {

    }
    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
