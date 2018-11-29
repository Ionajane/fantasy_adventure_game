package FantasyAdventure.Valuables;

public enum Treasure {

    RUBY(20),
    SILVER(30),
    GOLD(70);

    public final int value;

    Treasure(int value) {
        this.value = value;
    }

    public int getTreasure() {
        return value;
    }
}
