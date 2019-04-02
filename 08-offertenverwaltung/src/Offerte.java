public class Offerte {

    private Kunde kunde;
    private String beschreibung;
    private double einkaufspreis = 1.0;
    private String lieferzeit = "undefined";
    private int nummer;

    public Offerte(Kunde kunde, String beschreibung, int nummer) {
        this.kunde = kunde;
        this.beschreibung = beschreibung;
        this.nummer = nummer;
        kunde.addOfferte(this);
    }

    public void print() {
        kunde.print();
        System.out.println("Beschreibung: " + beschreibung);
        System.out.println("Einkaufspreis: " + einkaufspreis);
        System.out.println("Verkaufspreis: " + getVerkaufsPreis());
        System.out.println("Lieferzeit: " + lieferzeit);
    }

    public int getNummer() {
        return nummer;
    }

    public void setEinkaufspreis(double einkaufspreis) {
        this.einkaufspreis = einkaufspreis;
    }

    public void setLieferzeit(String lieferzeit) {
        this.lieferzeit = lieferzeit;
    }

    public double getVerkaufsPreis() {
        return einkaufspreis * kunde.getMarge();
    }
}
