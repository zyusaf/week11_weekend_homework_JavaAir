import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Pilot pilot;
    ArrayList<CabinCrewMember> cabinCrewMembers;
    ArrayList<Passenger> passengers;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void before(){
        pilot = new Pilot("Abed", RankType.CAPTAIN, "5432");
        cabinCrewMembers = new ArrayList<>();
        passengers = new ArrayList<>();
        passenger1 = new Passenger("Jeff", 3);
        passenger2 = new Passenger("Troy", 2);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(pilot, cabinCrewMembers, plane, "FR756", "MAN", "EDI", "13;00");
        flightManager = new FlightManager(flight);
    }

    @Test
    public void totalBagsStartsEmpty(){
        assertEquals(0, flightManager.getTotalBags());
    }

    @Test
    public void hasWeightForPassengers(){
        assertEquals(250.00, flightManager.getTotalWeightForPassengers(), 0.01);
    }

    @Test
    public void howMuchWeightForEachPassenger(){
        assertEquals(25.00, flightManager.getWeightForEachPassenger(), 0.01);
    }

    @Test
    public void listOfPassengerBagsUpdates(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(2, flightManager.getPassengerBagsListLength());
    }

    @Test
    public void howMuchWeightIsBookedForAFlight(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(125.00, flightManager.getWeightBookedForFlight(), 0.01);
    }

    @Test
    public void howMuchReservedWeightRemains(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(125.00, flightManager.getRemainingReservedWeight(), 0.01);
    }
}
