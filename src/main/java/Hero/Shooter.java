package Hero;

public abstract class Shooter extends BaseHero{
    protected int arrow;
    protected int range;

    public Shooter(int x, int y) {
        super(15,6,1,3,6, x, y);
        this.arrow = 10;
        this.range = 10;
    }
    @Override
    public String getInfo(){
        return String.format("%s Hp: %d Arrows: %d", super.name, super.hp, this.arrow);
    }
}
