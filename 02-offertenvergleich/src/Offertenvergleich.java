import java.util.Scanner;

public class Offertenvergleich {

    public static void main(String[] args) {

        double preisA; // Preis Lieferant A
        double preisB; // Preis Lieferant B
        int lZeitA; // Lieferzeit Lieferant A
        int lZeitB; // Lieferzeit Lieferant B

        Scanner scanner = new Scanner(System.in);

        System.out.print("Preis A > ");
        preisA = scanner.nextDouble();
        System.out.print("Preis B > ");
        preisB = scanner.nextDouble();
        System.out.print("Lieferzeit A > ");
        lZeitA = scanner.nextInt();
        System.out.print("Lieferzeit B > ");
        lZeitB = scanner.nextInt();

        scanner.close();

        System.out.println("A: " + preisA + " CHF, " + lZeitA + " Tage");
        System.out.println("B: " + preisB + " CHF, " + lZeitB + " Tage");

        if (lZeitA > 14 && lZeitB > 14) {
            System.out.println("Nichts bestellen");
        } else {
            if (preisA < preisB) {
                if (lZeitA <= 14) {
                    System.out.println("Bei A bestellen");
                } else if (lZeitB <= 14) {
                    System.out.println("Bei B bestellen");
                }
            } else if (preisB < preisA) {
                if (lZeitB <= 14) {
                    System.out.println("Bei B bestellen");
                } else if (lZeitA <= 14) {
                    System.out.println("Bei A bestellen");
                }
            } else {
                if (lZeitA <= 14 && lZeitB > 14) {
                    System.out.println("Bei A bestellen");
                } else if (lZeitB <= 14 && lZeitA > 14) {
                    System.out.println("Bei B bestellen");
                } else {
                    System.out.println("Freie Wahl");
                }
            }
        }
    }
}
