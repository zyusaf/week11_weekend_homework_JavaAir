import java.lang.reflect.Array;
import java.util.ArrayList;

public class FlightManager {

    private Flight flight;
    private int totalBags;

    public FlightManager(Flight flight) {
        this.flight = flight;
        this.totalBags = 0;

    }

    public int getTotalBags(){
        return this.totalBags;
    }

    public double getTotalWeightForPassengers() {
        return flight.getPlane().getPlaneMaxWeight() / 2;
    }

    public double getWeightForEachPassenger(){
        return getTotalWeightForPassengers() / flight.getPlane().getPlaneCapacity();
    }

    public ArrayList getListOfPassengerBags(){
        ArrayList<Integer> passengerBags = new ArrayList<>();
        for (Passenger passenger: this.flight.getPassengers()){
            passengerBags.add(passenger.getNumberOfBags());
        }
        return passengerBags;
    }

    public int getPassengerBagsListLength(){
        return getListOfPassengerBags().size();
    }

    public double getWeightBookedForFlight(){
        ArrayList<Integer> passengerBags = this.getListOfPassengerBags();
        int totalBags = 0;
        for (Integer bags: passengerBags){
            totalBags += bags;
        }
        return totalBags * getWeightForEachPassenger();
    }

    public double getRemainingReservedWeight() {
        return getTotalWeightForPassengers() - getWeightBookedForFlight();
    }
}
