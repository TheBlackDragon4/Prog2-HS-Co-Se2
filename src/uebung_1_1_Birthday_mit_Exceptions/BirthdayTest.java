package uebung_1_1_Birthday_mit_Exceptions;

import java.util.Scanner;

public class BirthdayTest {

	public static void datum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie das Datum ein: ");
		String s = sc.nextLine();

		try {
			Birthday birthday = new Birthday(s);
			System.out.println("Das eingegebene Datum war korrekt! " + birthday.getTheDay());
		} catch (InvalidBirthdayException e) { // Abfangen der InvalideBirthdayException wärend dem Programmdurchlauf
			// e.printStackTrace(); // Ausgabe der Fehlermeldungen auf der Konsole
			System.out.println(e.getMessage()); // Ausgabe der Message der geworfenen Exception
			datum();
		}
		
		sc.close();
		
	}

	public static void main(String[] args) {
		datum();
	}

}
