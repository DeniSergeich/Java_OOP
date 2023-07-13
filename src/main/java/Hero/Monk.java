package Hero;

import java.util.ArrayList;

public class Monk extends Magic {


    public Monk(int x, int y){
        super(x, y);
        super.type = "Монах";
        this.hp = 10;
        this.damage[0] = 8;
        this.damage[1] = 15;
        this.defense = 5;
        this.initiative = 4;
        this.speed = 3;
        this.isLife = true;
    }

    @Override
    public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> team2) {
    }
}
