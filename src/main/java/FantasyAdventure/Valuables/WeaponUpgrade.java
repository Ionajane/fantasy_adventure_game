package FantasyAdventure.Valuables;

public enum WeaponUpgrade {

    FALCATASWORD(30),
    BLACKARROW(20),
    BALROGWHIP(50);

    private final int value;

    WeaponUpgrade(int value) {
        this.value = value;
    }

    public int getWeaponUpgrade() {
        return value;
    }
}
