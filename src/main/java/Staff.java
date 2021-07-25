public abstract class Staff {

    private String name;
    protected RankType rank;

    public Staff(String name, RankType rank){
        this.name = name;
        this.rank = rank;
    }

    public String getStaffName(){
        return this.name;
    }

    public RankType getStaffRank(){
        return rank;
    }
}
