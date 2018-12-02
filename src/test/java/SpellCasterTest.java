import FantasyAdventure.Enums.Defender;
import FantasyAdventure.Enums.SpellCasting;
import FantasyAdventure.People.SpellCaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellCasterTest {

    SpellCaster spellCaster;

    @Before
    public void before() {
        spellCaster = new SpellCaster(0, 0, SpellCasting.FIREBALL, Defender.PHENOIX);
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(0, spellCaster.getHealthPoints());
    }

    @Test
    public void canGetTreasurePoints() {
        assertEquals(0, spellCaster.getTreasurePoints());
    }

    @Test
    public void canGetDefender() {
        assertEquals(Defender.PHENOIX, spellCaster.getDefender());
    }

    @Test
    public void canCastSpell() {
        assertEquals(SpellCasting.FIREBALL, spellCaster.getSpell());
    }

    @Test
    public void canAddHealthPoints() {
        assertEquals(1, spellCaster.addHealthPoints());
    }

    @Test
    public void canAddTreasurePoints() {
        assertEquals(1, spellCaster.addTreasurePoints());
    }
}
