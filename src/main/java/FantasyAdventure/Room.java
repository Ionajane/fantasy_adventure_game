package FantasyAdventure;

public class Room {

    protected String name;
    // enemies is a enum
    // treasure is another class (valuables)

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
