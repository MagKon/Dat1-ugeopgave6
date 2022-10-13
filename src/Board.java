import java.util.ArrayList;

public class Board {

    private Field[] fields = new Field[40];
    private ChanceCard[] chanceCards = new ChanceCard[10];

    /*
    * TODO:
    *   - udvid konstruktoren (jvf. Task 2.d)
    *   - tilføj statiske felter (jvf. Task 2.e, 2.f)
    *   - tilføj statisk metode (jvf. Task 2.g)
    *
    * */

    Board(String[] fielddata, String[] chanceData){
        createFields(fielddata);
        createCards(chanceData);
    }

    private Field[] createFields(String[] data){
        for(int i = 0; i < fields.length; i++){
            String s = data[i];
            String[] values = s.split(",");

            int id =  Integer.parseInt(values[0]);
            String fieldtype = values[1];
            String label = values[2];
            int cost = Integer.parseInt(values[3]);
            int income = Integer.parseInt(values[4]);
            int seriesID = Integer.parseInt(values[5]);

            Field f = null;


            switch (fieldtype) {
                case "plot": f = new Plot(id, label, cost, income, seriesID);
                break;
                case "rederi":
                case "brewery": f = new Business(id, label, cost, income, seriesID);
                    break;
                case "jail": f = new Jail(id, label, cost);
                       break;
                case "visit": f = new Visit(id, label);
                    break;
                case "parking": f = new Parking(id, label);
                    break;
                case "start": f = new Start(id, label, cost, income);
                    break;
                case "lykkefelt": f = new Chance(id, label, cost, income);
                    break;
                case "tax": f = new Tax(id, label,cost, income);
                    break;

              //  default: f = new Field(id, label, cost, income);
            }

            fields[i] = f;

        }
        return fields;
    }
    private ArrayList<ChanceCard> createCards(String[] data){
        ArrayList<ChanceCard> cards = new ArrayList<>();
        for (int i = 0; i < chanceCards.length; i++) {
            String s = data[i];
            String[] values = s.split(",");
            String name = values[0].trim();
            int cost = Integer.parseInt(values[1].trim());
            int payout = Integer.parseInt(values[2].trim());
            ChanceCard c = new ChanceCard(name, cost, payout);
            cards.add(c);

            chanceCards[i] = c;
        }
        return cards;
    }

    public Field getField(int id) {
        id--;
        if (id < 0 || id >= fields.length) {
            return null;
        }
        return fields[id];
    }


}