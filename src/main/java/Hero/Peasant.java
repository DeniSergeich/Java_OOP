package Hero;

import java.util.ArrayList;
import java.util.Random;

public class Peasant extends Warrior {

    public Peasant(int x, int y){
        super(x,y);
        super.type = "Крестьянин";
        this.hp = 10;
        this.damage[0] = 1;
        this.damage[1] = 1;
        this.defense = 10;
        this.initiative = 1;
        this.speed = 3;
        this.isLife = true;
    }

    @Override
    public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> team2) {
        if (!this.free) this.free = true;
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
