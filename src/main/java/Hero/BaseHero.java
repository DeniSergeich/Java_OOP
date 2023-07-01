package Hero;

public abstract class BaseHero implements BaseHeroInterfase{
    protected int maxHp;
    protected int hp;
    protected int damage;
    protected int armor;
    protected int satiety;
    protected double blockChance;
    protected String name;
    protected int attackDistance;
    public BaseHero(int hp, int damage, int armor, int satiety, double blockChance, String name, int attackDistance) {
        this.maxHp = this.hp = hp;
        this.damage = damage;
        this.armor = armor;
        this.satiety = satiety;
        this.blockChance = blockChance;
        this.name = name;
        this.attackDistance = attackDistance;
    }
    public BaseHero(String name) {
        this.name = name;
    }
    public String getInfo() {
        return String.format("Имя: %s  Hp: %d ",
                this.name, this.hp);
    }

    public void GetDamage(int damage) {
        double block = this.armor*(1-this.blockChance);
        if (this.hp - damage > 0) {
            this.hp -= ((damage*(this.satiety/100))-block);
        }
    }
    public void Attack(BaseHero target) {
        int damage = this.damage;
        target.GetDamage(damage);
    }
}
