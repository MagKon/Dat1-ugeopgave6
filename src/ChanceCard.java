public class ChanceCard {
    private String name;
    private int cost;
    private int payout;

    public ChanceCard(String name, int cost, int payout) {
        this.name = name;
        this.cost = cost;
        this.payout = payout;
    }

//
//    public void createCard(String[] data){
//        this.name = data[0];
//        this.cost = Integer.parseInt(data[1]);
//        this.payout = Integer.parseInt(data[2]);
//    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getPayout() {
        return payout;
    }

    public String toString() {
        if (cost > 0) {
            return name + " - Betal " + cost;
        } else {
            return name + " - Modtag " + payout;
        }
    }
}
