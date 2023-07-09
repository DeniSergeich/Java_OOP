package Hero;

public abstract class Magic extends BaseHero{
    int mana;
    public Magic(int x, int y) {
        super(6,6,1,3,6, x, y);
        this.mana = 100;
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
