import java.util.Scanner;

public class ZahlenRatenGegenteil {

    public static void main(String[] args) {

        Scanner keyScan = new Scanner(System.in);
        int input = -1;
        int zahl = 50;
        int versuche = 0;
        double differenz = 50.0;

        System.out.println("Denke dir eine Zahl zwischen 0 und 99 und drücke dann Enter.");
        System.out.println("Ok. Ich beginne jetzt zu raten.\n" +
                "Antworte mir mit 1 für richtig, 2 für kleiner und 3 für grösser.");

        while (input != 1) {
            System.out.println("Ist es die "+zahl+"?");
            input = keyScan.nextInt();
            versuche++;
            differenz /= 2;
            if (input == 2) {
                zahl -= Math.ceil(differenz);
            } else if (input == 3){
                zahl += Math.ceil(differenz);
            } else if (input == 1){
                System.out.println("Uff, das war schwierig. Ich habe "+versuche+" Versuche benötigt.");
            } else {
                System.out.println("Bitte gib einen korrekten Wert ein.");
                versuche--;
            }
        }

    }
}
