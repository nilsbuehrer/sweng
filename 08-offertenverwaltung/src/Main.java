public class Main {

    public static void main(String[] args) {
        Kundenmanager kMan = new Kundenmanager();
        kMan.addKunde("Mueller", "Gartenweg 1", "");
        kMan.addKunde("Meier AG", "Hauptstrasse 2", "CHE-123.456");
        Kunde k1 = kMan.getKunde(100);
        System.out.println("Marge von Kunde 100: "+k1.getMarge());
        if (kMan.getKunde(102) == null) {
            System.out.println("Es gibt keinen Kunden mit der Nummer 102");
        }
        kMan.printAllKunden();
    }

}