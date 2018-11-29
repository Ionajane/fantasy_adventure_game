package FantasyAdventure.People.SpellCasters;
import FantasyAdventure.Enums.Defender;
import FantasyAdventure.Enums.SpellCasting;
import FantasyAdventure.People.Player;

public class Witch extends Player {

    protected SpellCasting spellCasting;
    protected Defender defender;

    public Witch(int healthPoints, int treasurePoints, SpellCasting spellCasting, Defender defender) {
        super(healthPoints, treasurePoints);
        this.spellCasting = spellCasting;
        this.defender = defender;
    }

    public Defender getDefender() {
        return defender;
    }

    public SpellCasting getSpellCasting() {
        return spellCasting;
    }
}
