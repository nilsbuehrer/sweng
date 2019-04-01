import java.util.ArrayList;

public class Kunde {

    private String name;
    private String adresse;
    private double marge = 2;
    private int nummer;
    private ArrayList<Offerte> offerten = new ArrayList<Offerte>();

    public Kunde(String name, String adresse, int nummer) {
        this.name = name;
        this.adresse = adresse;
        this.nummer = nummer;
    }

    public void print() {
        System.out.println("\nKunde: " + this.name);
        System.out.println("Adresse: " + this.adresse);
        System.out.println("Kundennummer: " + this.nummer);
        System.out.println("Marge: " + this.marge);
    }

    public int getNummer() {
        return nummer;
    }

    public double getMarge() {
        return marge;
    }

    public void setMarge(double marge) {
        this.marge = marge;
    }

    public double getOffertenVolumen() {
        double offertenVolumen = 0;

        for (Offerte o :
                offerten) {
            offertenVolumen += o.getVerkaufsPreis();
        }

        return offertenVolumen;
    }

    public void addOfferte(Offerte offerte) {
        offerten.add(offerte);
    }
}
