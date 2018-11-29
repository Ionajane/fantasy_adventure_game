package FantasyAdventure.People;

public abstract class Player {

    protected int healthPoints;
    protected int treasurePoints;

    public Player(int healthPoints, int treasurePoints) {
        this.healthPoints = healthPoints;
        this.treasurePoints = treasurePoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getTreasurePoints() {
        return treasurePoints;
    }

    //checks for enemy in room
}
