import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    ArrayList<CabinCrewMember> cabinCrewMembers;
    ArrayList<Passenger> passengers;
    Plane plane;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void before(){
        pilot = new Pilot("Susanna", RankType.CAPTAIN, "789");
        cabinCrewMember1 = new CabinCrewMember("Lola", RankType.FLIGHTATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Tiger", RankType.FLIGHTATTENDANT);
        cabinCrewMembers = new ArrayList<>();
        cabinCrewMembers.add(cabinCrewMember1);
        cabinCrewMembers.add(cabinCrewMember2);
        passengers = new ArrayList<>();
        passenger1 = new Passenger("Jeff", 3);
        passenger2 = new Passenger("Troy", 2);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(pilot, cabinCrewMembers, plane, "FR756", "EDI", "LDN", "12:45");
    }

    @Test
    public void hasPilot(){
        assertEquals("Susanna", flight.getPilot().getStaffName());
    }

    @Test
    public void hasCabinCrew(){
        assertEquals(2, flight.getAmountOfCabinCrew());
    }

    @Test
    public void hasPlane(){
        assertEquals(PlaneType.BOEING747, flight.getPlane().getPlaneModel());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("EDI", flight.getFlightDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("LDN", flight.getFlightDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("12:45", flight.getFlightDepartureTime());
    }

    @Test
    public void hasAvailableSeats(){
        assertEquals(10, flight.getAvailableSeats());
    }

    @Test
    public void hasAvailableSeats2(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(8, flight.getAvailableSeats());
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(2, flight.getTotalPassengers());
    }
}
