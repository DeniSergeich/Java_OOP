package Hero;

import java.util.ArrayList;


public class Sniper extends Shooter {
    public Sniper(int x, int y) {
        super(x, y);
        super.type = "Снайпер";
        this.hp = 30;
        this.damage[0] = 7;
        this.damage[1] = 12;
        this.defense = 2;
        this.initiative = 5;
        this.speed = 3;
        this.isLife = true;
    }

//    @Override
//    public void step(ArrayList<BaseHero> teamFoe, ArrayList<BaseHero> teamFriend) {
//
//    }

    @Override
    public String getInfo() {
        return String.format("%s %s Hp:%d Arrows:%d",this.type, this.name, this.hp, this.arrow);
    }
}
