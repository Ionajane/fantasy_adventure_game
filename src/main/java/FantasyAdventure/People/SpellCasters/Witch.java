package FantasyAdventure.People.SpellCasters;
import FantasyAdventure.Enums.Defender;
import FantasyAdventure.Enums.SpellCasting;
import FantasyAdventure.People.SpellCaster;

public class Witch extends SpellCaster {

    //instance variables

    protected SpellCasting spellCasting;
    protected Defender defender;

    public Witch(int healthPoints, int treasurePoints, SpellCasting spellCasting, Defender defender) {
        super(healthPoints, treasurePoints, spellCasting, defender);

    }

    public Defender getDefender() {
        return defender;
    }

    public SpellCasting getSpellCasting() {
        return spellCasting;
    }
}
