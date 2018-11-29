package FantasyAdventure.Enums;

public enum Healer {

    BRAVE(30),
    STRENGTH(50),
    WILDBERRY(10),
    PEPPERUP(20),
    LIFE(100);


    private final int value;

    Healer(int value) {
        this.value = value;
    }

    public int getHealer() {
        return value;
    }

}
