package Hero;

import java.util.ArrayList;

public abstract class Shooter extends BaseHero{
    protected int arrow;
    public Shooter(int x, int y) {
        super(x,y);
        this.arrow = 10;
    }
    @Override
    public void step(ArrayList<BaseHero> teamFoe, ArrayList<BaseHero> teamFriend) {
        if (!this.isLife|| this.arrow == 0) return;
        //this.lookAround(teamFoe);
        BaseHero target = this.findNearest(teamFoe);
        this.attack(target);
        if(!this.findPeasant(teamFriend)) this.arrow -= 1;
    }
    public boolean findPeasant(ArrayList<BaseHero> team) {
        boolean result = false;
        for (BaseHero person : team) {
            if (person.type == "Крестьянин" && person.hp > 0 && person.free == true) {
                result = true;
                person.free = false;
            }
        }
        return result;
    }
    @Override
    public String getInfo(){
        return String.format("%s Hp: %d Arrows: %d", super.name, super.hp, this.arrow);
    }
}
