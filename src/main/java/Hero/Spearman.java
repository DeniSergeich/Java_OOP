package Hero;

import Map.Coordinates;

import java.util.ArrayList;
import java.util.Random;

public class Spearman extends Warrior {

    public Spearman(int x, int y){

        super(x, y);
        super.type = "Копейщик";
    }

    @Override
    public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> team2) {

    }

    @Override
    public String getInfo() {

        return super.getInfo();
    }
}
