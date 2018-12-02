import FantasyAdventure.Enums.Healer;
import FantasyAdventure.People.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;

    @Before
    cleric = new Cleric(Healer.WILDBERRY);

   @Test
    public void canGetHealer() {
       assertEquals(Healer.WILDBERRY, cleric.getHealer());
    }

    @Test
    public void canHealPlayer() {
       assertEquals(30, cleric.healPlayer());
    }
    // player starts with 0 and is given BRAVE(30)
}
