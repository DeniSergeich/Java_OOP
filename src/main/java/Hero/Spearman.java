package Hero;

import Map.Coordinates;

import java.util.ArrayList;
import java.util.Random;

public class Spearman extends Warrior {

    public Spearman(int x, int y){
        super(x, y);
        super.type = "Копейщик";
        this.hp = 30;
        this.damage[0] = 10;
        this.damage[1] = 15;
        this.defense = 10;
        this.initiative = 1;
        this.speed = 3;
        this.isLife = true;
    }

    @Override
    public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> team2) {

    }

    @Override
    public String getInfo() {

        return super.getInfo();
    }
}
