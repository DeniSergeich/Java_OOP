package Hero;

import java.util.ArrayList;

public class Monk extends Magic {


    public Monk(int x, int y){
        super(x, y);
        super.type = "Монах";
    }

    @Override
    public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> team2) {
    }

    public String getInfo() {
        return String.format("%s  Mp:%d",super.getInfo(), this.mana);
    }
}
