import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabincrewmember;

    @Before
    public void before(){
        cabincrewmember = new CabinCrewMember("Susanna", RankType.FLIGHTATTENDANT);
    }

    @Test
    public void cabinCrewMemberHasName(){
        assertEquals("Susanna", cabincrewmember.getStaffName());
    }

    @Test
    public void cabinCrewMemberHasRank(){
        assertEquals(RankType.FLIGHTATTENDANT, cabincrewmember.getStaffRank());
    }

    @Test
    public void cabinCrewMemberCanRelayMessage(){
        assertEquals("Return to your seats yo", cabincrewmember.canRelayMessage());
    }
}
