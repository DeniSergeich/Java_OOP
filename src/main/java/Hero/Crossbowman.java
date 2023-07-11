package Hero;

import java.util.ArrayList;

public class Crossbowman extends Shooter {
    public Crossbowman(int x, int y){
        super(x, y);
        super.type = "Арбалетчик";
    }
    @Override
    public void step(ArrayList<BaseHero> teamFoe, ArrayList<BaseHero> teamFriend) {
        if (this.hp == 0 || this.arrow ==0) return;
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
