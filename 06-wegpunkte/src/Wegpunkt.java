
public class Wegpunkt {

    private double hoehe;
    private long zeit;

    public Wegpunkt(double hoehe) {
        this.hoehe = hoehe;
        this.zeit = System.currentTimeMillis();
    }

    public double getHoehe() {
        return hoehe;
    }

    public long getZeit() {
        return zeit;
    }
}
