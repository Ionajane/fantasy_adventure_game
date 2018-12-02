package FantasyAdventure.People;
import FantasyAdventure.Enums.Healer;

public class Cleric  {

    protected Healer healer;

    public Cleric(Healer healer) {
        this.healer = healer;
    }

    public Healer getHealer() {
        return healer;
    }

    // if player has less than 100 healthPoints add
    // points from healer enum they have picked.

    public int healPlayer(Player player) {
        if (player.healthPoints < 100);
        return player.healthPoints; // + healer enum {
//            else return 0/null;
//        }
    }

    // how do I add a enum to an if statement dynamically
    // so that the healthPoints of player will increase with the potion for example?



}
