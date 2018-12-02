package FantasyAdventure.People.Fighters;
import FantasyAdventure.Enums.Weapon;
import FantasyAdventure.People.Fighter;


public class Barbarian extends Fighter {

    public Barbarian(int healthPoints, int treasurePoints, String fight, Weapon weapon) {
        super(healthPoints, treasurePoints, "Let's fight!", weapon);
    }

}
