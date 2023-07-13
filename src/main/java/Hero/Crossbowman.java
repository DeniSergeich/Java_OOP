package Hero;

import java.util.ArrayList;

public class Crossbowman extends Shooter {
    public Crossbowman(int x, int y) {
        super(x, y);
        super.type = "Арбалетчик";
        this.hp = 30;
        this.damage[0] = 10;
        this.damage[1] = 15;
        this.defense = 3;
        this.initiative = 5;
        this.speed = 3;
        this.isLife = true;
    }

//    @Override
//    public void step(ArrayList<BaseHero> teamFoe, ArrayList<BaseHero> teamFriend) {
//        if (this.hp == 0 || this.arrow ==0) return;
//        //this.lookAround(teamFoe);
//        BaseHero target = this.findNearest(teamFoe);
//        this.attack(target);
//        if(!this.findPeasant(teamFriend)) this.arrow -= 1;
//    }
    @Override
    public String getInfo() {
        return String.format("%s %s Hp:%d Arrows:%d",this.type, this.name, this.hp, this.arrow);
    }
}
