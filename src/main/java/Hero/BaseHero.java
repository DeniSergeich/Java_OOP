package Hero;

import Map.Coordinates;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements BaseHeroInterfase{
    protected String name;
    protected String type;
    protected int maxHp;
    protected int hp;
    protected int damage;
    protected int defense;
    protected int initiative;
    protected int speed;
    protected Coordinates coordinates;
    public BaseHero(int damage, int defense, int initiative, int speed, int hp, int x, int y) {
        this.name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        this.maxHp = this.hp = hp;
        this.damage = damage;
        this.defense = defense;
        this.initiative = initiative;
        this.speed = speed;
        this.coordinates = new Coordinates(x,y);
    }

    public BaseHero(int x, int y){
        this.coordinates = new Coordinates(x,y);
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
            if (coordinates.getDistance(character.getCoordinates()) < coordinates.getDistance(nearest.getCoordinates())) {
                nearest = character;
            }
        }
        return nearest;
    }
    public int getInitiative(){
        return this.initiative;
    }
    public void attack(BaseHero target){
        target.hp -= this.damage;
    }
    public boolean findPeasant(ArrayList<BaseHero> team) {
        boolean result = true;
        for (BaseHero person : team) {
            result = person.type.equals("Крестьянин");
        }
        return result;
    }

}
