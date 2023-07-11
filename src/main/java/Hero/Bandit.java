package Hero;
import java.util.ArrayList;


public class Bandit extends Warrior {


    public Bandit(int x, int y) {
        super(x, y);
        super.type = "Бандит";
    }

    @Override
    public void step(ArrayList<BaseHero> teamFoe, ArrayList<BaseHero> team2) {

    }
    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
