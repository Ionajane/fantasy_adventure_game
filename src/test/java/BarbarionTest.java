import FantasyAdventure.Enums.Weapon;
import FantasyAdventure.People.Fighters.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarionTest {

    Barbarian barbarian;

    @Before
    public void before() {
        barbarian = new Barbarian(100, 0, "Let's fight!", Weapon.AXE);
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(100, barbarian.getHealthPoints());
    }

    @Test
    public void canGetTreasurePoints() {
        assertEquals(0, barbarian.getTreasurePoints());
    }

    @Test
    public void canGetWeapon() {
        assertEquals(Weapon.AXE, barbarian.getWeapon());
    }

    @Test
    public void canFight() {
    assertEquals("Let's fight!", barbarian.getFight());
    }

//    @Test
//    public void canIncreaseHealthPoints() {
//        assertEquals();
//    }

}
