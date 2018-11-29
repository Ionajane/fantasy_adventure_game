package FantasyAdventure.Enums;

public enum SpellCasting {

    FIREBALL(60),
    LIGHTENING(80),
    FLOOD(30);

    public final int value;

    SpellCasting(int value) {
        this.value = value;
    }

    public int getSpellCasting() {
        return value;
    }

}
