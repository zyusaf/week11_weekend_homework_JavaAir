public enum PlaneType {
    BOEING747(10, 500.00),
    BOEING737(5, 250.00),
    AIRBUSA350(10, 500.00);

    private final int capacity;
    private final double weight;

    PlaneType(int capacity, double weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public double getWeight(){
        return this.weight;
    }
}
