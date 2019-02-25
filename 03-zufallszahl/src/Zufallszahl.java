import java.util.Random;

public class Zufallszahl {

    public static void main(String[] args) {
        Random rn = new Random();
        int zahl = rn.nextInt(11);
        System.out.println(zahl);
    }
}
