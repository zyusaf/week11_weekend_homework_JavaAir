public class Plane {

    PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }


    public PlaneType getPlaneModel() {
        return this.planeType;
    }

    public int getPlaneCapacity() {
        return this.planeType.getCapacity();
    }

    public double getPlaneMaxWeight() {
        return this.planeType.getWeight();
    }
}
