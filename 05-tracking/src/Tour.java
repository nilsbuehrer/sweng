import java.text.SimpleDateFormat;
import java.util.Date;

public class Tour {

    private String ziel;
    private String datum;

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
    }
}
