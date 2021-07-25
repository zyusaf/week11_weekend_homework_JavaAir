import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Predator", RankType.CAPTAIN, "789");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Predator", pilot.getStaffName());
    }

    @Test
    public void pilotRank(){
        assertEquals(RankType.CAPTAIN, pilot.getStaffRank());
    }

    @Test
    public void pilotHasLicenceNumber(){
        assertEquals("789", pilot.getPilotLicenceNumber());
    }

    @Test
    public void pilotCanFly(){
        assertEquals("I believe I can fly", pilot.pilotCanFlyPlane());
    }
}
