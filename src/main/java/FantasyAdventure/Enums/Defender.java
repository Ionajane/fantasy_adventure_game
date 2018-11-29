package FantasyAdventure.Enums;

public enum Defender {

    DRAGON(60),
    PHENOIX(20),
    PYTHON(10);

    public final int value;

    Defender(int value) {
        this.value = value;
    }

    public int getDefender() {
        return value;
    }
}
