package Hero;


import java.util.ArrayList;

public class Magician extends Magic {

    public Magician(int x, int y){

        super(x, y);
        super.type = "Маг";
    }
    @Override
    public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> team2) {

    }
    @Override
    public String getInfo() {
        return String.format("%s  Mp:%d",super.getInfo(), this.mana);
    }
}
