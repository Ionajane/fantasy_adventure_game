import FantasyAdventure.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;

    @Before
    public void before() {
        room = new Room("Level One");
    }

    @Test
    public void canGetName() {
        assertEquals("Level One", room.getName());
    }
}
