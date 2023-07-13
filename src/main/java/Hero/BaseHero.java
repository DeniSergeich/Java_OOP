package Hero;

import Map.Coordinates;
import Map.Names;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements BaseHeroInterfase{
    protected String name;
    protected String type;
    protected int maxHp;
    protected int hp;
    protected int[] damage = new int[2];
    protected int defense;
    protected int initiative;
    protected int speed;
    protected Coordinates coordinates;
    protected boolean free = true;
    protected boolean isLife;
    public BaseHero(int minDamage, int maxDamage, int defense, int initiative, int speed, int hp, int x, int y) {
        this.name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        this.maxHp = this.hp = hp;
        this.damage[0] = minDamage;
        this.damage[1] = maxDamage;
        this.defense = defense;
        this.initiative = initiative;
        this.speed = speed;
        this.coordinates = new Coordinates(x,y);
    }

    public BaseHero(int x, int y){
        this.coordinates = new Coordinates(x,y);
        this.name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
    public String getInfo() {
        return String.format("%s %s  Hp:%d ",this.type,
                this.name, this.hp);
    }

    public String toString(){
        return this.name;
    }

    public Coordinates getCoordinates(){
        return coordinates;
    }

    public void lookAround(ArrayList<BaseHero> team){
        BaseHero nearestFoe = findNearest(team);
        System.out.printf("%s заметил %s на расстоянии %d\n", this.name, nearestFoe.toString(),
                coordinates.getDistance(nearestFoe.getCoordinates()));
    }

    protected BaseHero findNearest(ArrayList<BaseHero> team) {
        BaseHero nearest = team.get(0);
        for (BaseHero character : team) {
            if(character.isLife) {
                if (coordinates.getDistance(character.getCoordinates()) < coordinates.getDistance(nearest.getCoordinates())) {
                    nearest = character;
                }
            }
        }
        return nearest;
    }
    public int getInitiative(){
        return this.initiative;
    }
    public void attack(BaseHero target){
        int damage = getDamage();
        target.hp -= (damage - this.defense);
        System.out.printf("%s %s атакует %s %s, и наносит ему %d урона \n",this.type, this.name,target.type, target.name, damage);
        if(target.hp <= 0) target.isLife = false;
    }
//    public void health(BaseHero target){
//        int health = getDamage();
//        target.hp += health;
//        System.out.printf("%s %s восстанавливает %s %s,  %d здоровья \n",this.type, this.name,target.type, target.name, health);
//
//    }
    public int getDamage(){
        return new Random().nextInt(this.damage[0], this.damage[1]+1);
    }
    public boolean isWounded(){
        return this.hp < this.maxHp;
    }



}
