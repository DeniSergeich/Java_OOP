package Hero;

import Map.Coordinates;

import java.util.ArrayList;
import java.util.Random;

public class Peasant extends Warrior {

    public Peasant(int x, int y){

        super(x, y);
        super.type = "Крестьянин";
    }

    @Override
    public void step(ArrayList<BaseHero> team) {

    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
