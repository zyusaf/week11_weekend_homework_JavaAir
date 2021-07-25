import java.util.ArrayList;

public class Flight {
    private Passenger passenger;
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, ArrayList<CabinCrewMember> cabinCrew, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilot = pilot;
        this.cabinCrew = cabinCrew;
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Pilot getPilot(){
        return this.pilot;
    }

    public int getAmountOfCabinCrew(){
        return this.cabinCrew.size();
    }

    public Plane getPlane(){
        return this.plane;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getFlightDestination() {
        return this.destination;
    }

    public String getFlightDepartureAirport() {
        return this.departureAirport;
    }

    public String getFlightDepartureTime() {
        return this.departureTime;
    }

    public int getAvailableSeats(){
        return this.plane.planeType.getCapacity() - passengers.size();
    }

    public void bookPassenger(Passenger passenger){
        if (getAvailableSeats() > 0){
            passengers.add(passenger);
        }
    }

    public ArrayList<Passenger> getPassengers(){
        return this.passengers;
    }

    public int getTotalPassengers(){
        return this.passengers.size();
    }
}
