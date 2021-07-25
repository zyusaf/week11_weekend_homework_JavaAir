public class Pilot extends Staff{

    private String licenceNumber;

    public Pilot(String name, RankType rank, String licenceNumber) {
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }

    public String getPilotLicenceNumber(){
        return this.licenceNumber;
    }

    public String pilotCanFlyPlane(){
        return "I believe I can fly";
    }
}
