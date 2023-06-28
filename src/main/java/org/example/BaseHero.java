package org.example;

public abstract class BaseHero {
    protected static int hp; // параметр здоровья
    protected static int damage; // параметр урона
    protected static int armor; // параметр брони
    protected static double satiety; // параметр сытости (влияет на урон)
    protected static double blockChance; // шанс блока части урона
    protected static String name; // имя персонажа
    protected static int attackDistance; // дистанция атаки
    public BaseHero(int hp, int damage, int armor, double satiety, double blockChance, String name, int attackDistance) {
        this.hp = hp;
        this.damage = damage;
        this.armor = armor;
        this.satiety = satiety;
        this.blockChance = blockChance;
        this.name = name;
        this.attackDistance = attackDistance;
    }
    public String getInfo() {
        return String.format("Name: %s  Hp: %d ",
                this.name, this.hp);
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= (1-this.blockChance)*damage*(1 - (this.satiety / 100));
        }
    }
    public void Attack(BaseHero target) {
        int damage = BaseHero.damage;
        target.GetDamage(damage);
    }


}
