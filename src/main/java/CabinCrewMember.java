public class CabinCrewMember extends Staff{

    public CabinCrewMember(String name, RankType rank) {
        super(name, rank);
    }

    public String canRelayMessage(){
        return "Return to your seats yo";
    }
}
