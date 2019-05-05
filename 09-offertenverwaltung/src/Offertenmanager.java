import java.util.HashMap;

public class Offertenmanager {

    private HashMap<Integer, Offerte> alleOfferten = new HashMap<Integer, Offerte>();
    private Kundenmanager kundenmanager;
    private int nextOffertenNummer = 1;

    public Offertenmanager(Kundenmanager k) {
        this.kundenmanager = k;
    }

    public void addOfferte(int kNumber, String beschreibung) {

    }

    public Offerte getOfferte(int oNumber) {
        return null;
    }

    public void printAllOfferten() {

    }
}
