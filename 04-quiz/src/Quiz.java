import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {

        Scanner keyScan = new Scanner(System.in);
        int [] antwort = {12,24,324,21};
        String [] frage = new String[4];
        int input;
        int korrekteAntworten = 0;

        frage[0] = "Wie viel gibt 2*6?";
        frage[1] = "Wie viele Stunden hat ein Tag?";
        frage[2] = "Wie hoch ist der Eiffelturm?";
        frage[3] = "Wie viele Zeilen Code hat dieses Programm?";

        for (int i = 0; i < frage.length; i++) {
            System.out.print("Frage " + (i+1) + ": " + frage[i] + " ");
            input = keyScan.nextInt();
            if (input == antwort[i]) {
                System.out.println("Richtig");
                korrekteAntworten++;
            } else {
                System.out.println("Falsch");
            }
            System.out.println();
        }
        keyScan.close();
        printSummary(frage.length, korrekteAntworten);
    }

    static void printSummary(double total, double richtig) {
        System.out.println("Richtig: "+richtig+" von "+total);
        if (richtig < total/3 ) {
            System.out.println("Du hast noch Potenzial!");
        } else if (richtig >= (total/3)*2) {
            System.out.println("Super, gratuliere!");
        } else {
            System.out.println("Nicht schlecht!");
        }
    }
}
