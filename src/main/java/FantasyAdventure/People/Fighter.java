package FantasyAdventure.People;
import FantasyAdventure.Enums.Weapon;

public class Fighter extends Player{

    protected String fight;
    protected Weapon weapon;

    public Fighter(int healthPoints, int treasurePoints, String fight, Weapon weapon){
        super(healthPoints, treasurePoints);
        this.fight = fight;
        this.weapon = weapon;
    }

    public String getFight() {
        return "Let's fight!";
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

}
