package FantasyAdventure.People;

import FantasyAdventure.Enums.Defender;
import FantasyAdventure.Enums.SpellCasting;

public class SpellCaster extends Player {

    protected SpellCasting spellCasting;
    protected Defender defender;

    public SpellCaster(int healthPoints, int treasurePoints, SpellCasting spellCasting, Defender defender){
        super(healthPoints, treasurePoints);
        this.spellCasting = spellCasting;
        this.defender = defender;
    }

    public SpellCasting getSpell() {
        return this.spellCasting;
    }

    public Defender getDefender() {
        return defender;
    }
}
