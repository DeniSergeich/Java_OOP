package Hero;

import java.util.ArrayList;


public class Sniper extends Shooter {
    public Sniper(int x, int y) {
        super(x, y);
        super.type = "Снайпер";
    }

    @Override
    public void step(ArrayList<BaseHero> teamFoe, ArrayList<BaseHero> teamFriend) {
        if (super.hp == 0 || super.arrow ==0) return;
        //this.lookAround(teamFoe);
        BaseHero target = this.findNearest(teamFoe);
        this.attack(target);
        if(!this.findPeasant(teamFoe)) this.arrow -= 1;
    }

    @Override
    public String getInfo() {
        return String.format("%s %s Hp:%d Arrows:%d",this.type, this.name, this.hp, this.arrow);
    }
}
