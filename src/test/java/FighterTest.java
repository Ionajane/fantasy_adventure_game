import FantasyAdventure.Enums.Weapon;
import FantasyAdventure.People.Fighter;
import FantasyAdventure.People.Fighters.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    Fighter fighter;

    @Before
    public void before() {
        fighter = new Fighter(0, 0, "Let's fight!", Weapon.AXE);
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(0, fighter.getHealthPoints());
    }

    @Test
    public void canGetTreasurePoints() {
        assertEquals(0, fighter.getTreasurePoints());
    }

    @Test
    public void canGetWeapon() {
        assertEquals(Weapon.AXE, fighter.getWeapon());
    }

    @Test
    public void canFight() {
        assertEquals("Let's fight!", fighter.getFight());
    }

    @Test
    public void canAddHealthPoints() {
        assertEquals(1, fighter.addHealthPoints());
    }

    @Test
    public void canAddTreasurePoints() {
        assertEquals(1, fighter.addTreasurePoints());
    }

}
