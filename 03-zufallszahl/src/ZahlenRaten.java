import java.util.Random;
import java.util.Scanner;

public class ZahlenRaten {

    public static void main(String[] args) {

        Scanner keyScan = new Scanner(System.in);
        Random rn = new Random();
        int input = -1;
        int versuche = 0;

        int zahl = rn.nextInt(101);
        System.out.println("Rate eine Zahl zwischen 0 und 100");

        while (input != zahl) {
            input = keyScan.nextInt();
            versuche++;
            if (input > zahl) {
                System.out.println("zu gross");
            } else if (input < zahl){
                System.out.println("zu klein");
            } else {
                System.out.println("Richtig. Du hast "+versuche+" Versuche benötigt.");
            }
        }

    }
}
