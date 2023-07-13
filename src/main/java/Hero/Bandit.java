package Hero;
import java.util.ArrayList;


public class Bandit extends Warrior {


    public Bandit(int x, int y) {
        super(x,y);
        super.type = "Бандит";
        this.hp = 30;
        this.damage[0] = 5;
        this.damage[1] = 10;
        this.defense = 7;
        this.initiative = 2;
        this.speed = 2;
        this.isLife = true;

    }

    @Override
    public void step(ArrayList<BaseHero> teamFoe, ArrayList<BaseHero> team2) {

    }
    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
