public class Passenger {

    private String name;
    private int numberOfBags;

    public Passenger(String name, int numberOfBags) {
        this.name = name;
        this.numberOfBags = numberOfBags;
    }

    public String getPassengerName() {
        return name;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }
}
