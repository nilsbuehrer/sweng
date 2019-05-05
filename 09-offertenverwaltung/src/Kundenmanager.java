import java.util.HashMap;

public class Kundenmanager {
    private HashMap<Integer, Kunde> alleKunden = new HashMap<Integer, Kunde>();
    private int nextKundenNummer = 100;

    public void addKunde(String name, String adresse, String uid) {
        if (uid == "") {
            Privatkunde privatkunde = new Privatkunde(name, adresse, nextKundenNummer);
            alleKunden.put(nextKundenNummer, privatkunde);
        } else {
            Geschaeftskunde geschaeftskunde = new Geschaeftskunde(name, adresse, nextKundenNummer, uid);
            alleKunden.put(nextKundenNummer, geschaeftskunde);
        }
        nextKundenNummer++;
    }

    public Kunde getKunde(int kNumber) {
        return alleKunden.get(kNumber);
    }

    public void printAllKunden() {
        for (Kunde k : alleKunden.values()) {
            System.out.println("---------------------------");
            k.print();
        }

    }
}
