package FantasyAdventure.Enums;

public enum Healer {

    BRAVE(20),
    STRENGTH(50),
    WILDBERRY(10),
    PEPPERUP(20);

    private final int value;

    Healer(int value) {
        this.value = value;
    }

    public int getHealer() {
        return value;
    }

}
