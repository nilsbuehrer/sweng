import java.util.Scanner;

public class UserInterface {
	
	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		System.out.print("Ziel der Tour: ");
		Tour t = new Tour(keyScan.nextLine());
		
		String input = "";
		while (!input.equals("q")) {
			System.out.print("Höhe eingeben oder q zum Beenden: ");
			input = keyScan.nextLine();
			if (!input.equals("q")) {
				double hoehe = Double.parseDouble(input);
				t.saveWegpunkt(hoehe);
			}
		}
		t.print();
		keyScan.close();
	}
}
