package Hero;

public abstract class Warrior extends BaseHero{
    int armor;
    public Warrior(int x, int y) {
        super(10,10,2,2,10, x, y);
        this.armor = 100;
    }
}
