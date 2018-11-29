package FantasyAdventure.Enums;

public enum Weapon {

    SWORD(10),
    MACHETE(20),
    AXE(30);

    private final int value;

    Weapon(int value) {
        this.value = value;
    }

    public int getWeapon() {
        return value;
    }
}
