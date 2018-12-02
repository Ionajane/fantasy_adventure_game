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

    public int addHealthPoints() {
        return healthPoints + 1;
    }

    public int addTreasurePoints() {
        return treasurePoints + 1;
    }

    //checks for enemy in room
}
