import FantasyAdventure.Enums.Healer;
import FantasyAdventure.People.Cleric;
import FantasyAdventure.People.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Player player;

    @Before
    cleric = new Cleric();

   @Test
    public void canGetHealer() {
       assertEquals(Healer.WILDBERRY, cleric.getHealer());
    }

    @Test
    public void canHealPlayer() {
       player = new Player(0, 0);
       player.add(Healer.BRAVE);
       assertEquals(30, cleric.healPlayer(player));
    }
    // player starts with 0 and is given BRAVE(30)
}
