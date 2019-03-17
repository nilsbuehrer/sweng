import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Tour {

    private String ziel;
    private String datum;
    private ArrayList<Wegpunkt> wegpunkte = new ArrayList<Wegpunkt>();

    public Tour(String ziel) {
        this.ziel = ziel;

        Date currentDate = new Date(System.currentTimeMillis());
        SimpleDateFormat fDate = new SimpleDateFormat("dd.MM.yyyy");

        this.datum = fDate.format(currentDate);

    }

    public String getZiel() {
        return ziel;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void print() {
        System.out.println("Tour vom " + getDatum());
        System.out.println("Ziel: " + getZiel());
        SimpleDateFormat fTime = new SimpleDateFormat("HH:mm:ss");

        for (Wegpunkt wegpunkt :
                wegpunkte) {
            System.out.println("Zeit: " + fTime.format(new Date(wegpunkt.getZeit())) + " Höhe: " + wegpunkt.getHoehe());

        }
    }

    public void saveWegpunkt(double hoehe) {
        wegpunkte.add(new Wegpunkt(hoehe));
    }
}
