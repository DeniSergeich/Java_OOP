package Hero;

import Map.Coordinates;

import java.util.ArrayList;
import java.util.Random;

public class Sniper extends Warrior {
    public Sniper(int x, int y) {

        super(x, y);
        super.type = "Снайпер";
    }

    @Override
    public void step(ArrayList<BaseHero> team) {

    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
