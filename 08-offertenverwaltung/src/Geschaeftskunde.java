public class Geschaeftskunde extends Kunde {

    private String uid;

    public Geschaeftskunde(String name, String adresse, int nummer, String uid) {
        super(name, adresse, nummer);
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    public void print() {
        super.print();
        System.out.println("UID: " + uid);
    }
}
