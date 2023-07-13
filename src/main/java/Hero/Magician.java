package Hero;


import java.util.ArrayList;

public class Magician extends Magic {

    public Magician(int x, int y){

        super(x, y);
        super.type = "Маг";
        this.hp = 30;
        this.damage[0] = 8;
        this.damage[1] = 15;
        this.defense = 5;
        this.initiative = 6;
        this.speed = 3;
        this.isLife = true;
    }
}
