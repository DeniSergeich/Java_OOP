package Hero;

import java.util.ArrayList;

public abstract class Magic extends BaseHero{
    int mana;
    public Magic(int x, int y) {
        super(x, y);
        this.mana = 100;
    }
    @Override
    public void step(ArrayList<BaseHero> teamFoe, ArrayList<BaseHero> teamFriend){
        if (!this.isLife|| this.mana <= 0) return;
        BaseHero target = this.findNearestWounded(teamFriend);
        //int health = this.getDamage();
        int health = 10;
        target.hp += health;
        this.mana -= health;
        System.out.printf("%s %s восстанавливает %s %s,  %d здоровья \n",this.type, this.name,target.type, target.name, health);
    }
    protected BaseHero findNearestWounded(ArrayList<BaseHero> team) {
        BaseHero character = team.get(0);
        for (BaseHero person : team) {
            if (person.isLife && person.isWounded()) {
                if (coordinates.getDistance(person.getCoordinates()) < coordinates.getDistance(character.getCoordinates())) {
                    character = person;
                }
            }
        }
        return character;
    }
    @Override
    public String getInfo() {
        return String.format("%s  Mp:%d",super.getInfo(), this.mana);
    }
}
