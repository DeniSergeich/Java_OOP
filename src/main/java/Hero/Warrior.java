package Hero;

public abstract class Warrior extends BaseHero{
    int armor;
    public Warrior(int x, int y) {
        super(30,10,2,2,30, x, y);
        this.armor = 100;
    }
}
