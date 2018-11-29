import FantasyAdventure.Enums.Defender;
import FantasyAdventure.Enums.SpellCasting;
import FantasyAdventure.People.SpellCasters.Witch;
import FantasyAdventure.People.SpellCaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WitchTest {

    Witch witch;

    @Before
    public void before() {
        witch = new Witch(100, 0, "Riddikulus!", );
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(100, witch.getHealthPoints());
    }

    @Test
    public void canGetTreasurePoints() {
        assertEquals(0, witch.getTreasurePoints());
    }

    @Test
    public void canGetDefender() {
        assertEquals(Defender.PHENOIX, witch.getDefender());
    }

    @Test
    public void canCastSpell() {
        assertEquals(SpellCasting.FIREBALL, witch.getSpellCasting());
    }
}
