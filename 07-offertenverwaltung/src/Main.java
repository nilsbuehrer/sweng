public class Main {

    public static void main(String[] args) {
        Kunde k1 = new Kunde("ABC AG", "Hauptstrasse 3",100);
        k1.setMarge(2.5);
        Offerte o1 = new Offerte(k1,"Gussteil A",20);
        Offerte o2 = new Offerte(k1,"Frästeil B",21);
        Offerte o3 = new Offerte(k1,"Montagematerial C",22);
        o1.setEinkaufspreis(24);
        o2.setEinkaufspreis(54);
        o3.setEinkaufspreis(88);
        System.out.println("Verkaufspreis 1: "+o1.getVerkaufsPreis());
        System.out.println("Verkaufspreis 2: "+o2.getVerkaufsPreis());
        System.out.println("Verkaufspreis 3: "+o3.getVerkaufsPreis());
        System.out.println("Offertenvolumen: "+k1.getOffertenVolumen());
    }

}