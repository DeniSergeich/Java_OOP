package Hero;

import java.util.ArrayList;


public class Sniper extends Shooter {
    public Sniper(int x, int y) {
        super(x, y);
        super.type = "Снайпер";
    }

    @Override
    public void step(ArrayList<BaseHero> teamFoe, ArrayList<BaseHero> teamFriend) {
        if (this.hp == 0 || arrow == 0) return;
        BaseHero nearestFoe = findNearest(teamFoe);
        nearestFoe.hp -= (this.damage - this.defense);
        for (BaseHero c:teamFriend) {
            if (c.getClass() == Peasant.class) return;
        }
        this.arrow -= 1;
    }

    @Override
    public String getInfo() {
        return String.format("%s Hp:%d Arrows:%d", this.name, this.hp, this.arrow);
    }
}
