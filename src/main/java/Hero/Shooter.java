package Hero;

public abstract class Shooter extends BaseHero{
    protected int arrow;

    public Shooter(int damage,int x, int y) {
        super(damage,6,5,3,20, x, y);
        this.arrow = 10;

    }
    @Override
    public String getInfo(){
        return String.format("%s Hp: %d Arrows: %d", super.name, super.hp, this.arrow);
    }
}
