package zusatzaufgabe_Exceptions;

import java.util.Scanner;

public class ChestException {

	/**
	 * Fehlerf�lle:
	 * 
	 * Zahl zu klein oder zu gro� (<1 || >8) 2 Buchstaben 2 Zahlen zu viele Zeichen
	 * die angegeben wurden zu wenige Zeichen Buchstaben zu hoch bzw. zu klein
	 * Gro�schreibung bzw. Kleinschreibung leere Eingabe ("", " ") leerzeichen in
	 * der Mitte falsche Reihenfolge ("la")
	 * 
	 * 
	 * Zusammenfassung: falsche Zeichenanzahl - zu wenig Zeichen - zu viele Zeichen
	 * - leerzeichen in der Mitte ("a l") -> "Bitte keine Leerzeichen in der Mitte
	 * der Feldbezeichnung angeben" - leere Eingabe erstes Zeichen kein g�ltiger
	 * Buchstabe zweites Zeichen keine g�ltige Zahl
	 * 
	 * "a9" -> keine g�ltige Zahl, bitte Zahl zwischen 1 und 8 angeben.
	 * 
	 * "s9" -> kein g�ltiger Buchstabe -> "a9" -> kein g�ltige Zahl -> "a8" oder
	 * "s9" -> kein g�ltier Buchstabe und keine gr�ltige Zahl -> "a8"
	 * 
	 * @param message
	 * 
	 * 
	 * @param text
	 * @return
	 * @throws IllegalFieldException
	 */

	public boolean checkChessField(String txt) throws FieldErrorException { // Pr�ft ob eingegebner Wert ein G�ltigen
																			// Wert hat
//		char space = ' '; // Angabe eines spaces
		String txtModify; // Speicherung des modifizierten Textes

		txtModify = txt.replaceAll("\\s", ""); // Entfernung aller Leerzeichen

		if (txtModify.length() != 2) {
			throw new FieldErrorException("Angabe muss aus zwei Zeichen bestehen");
		} else if (!checkValidLetter(txtModify) && !checkValidNumber(txtModify)) {
			throw new FieldErrorException(
					"Eingegebener Buchstabe gr��er als 'g' UND Eingegebene Zahlenwerte sind < 1 und oder > 7");
		} else if (!checkValidLetter(txtModify)) {
			throw new FieldErrorException("Eingegebener Buchstabe gr��er als 'g' ");
		} else if (!checkValidNumber(txtModify)) {
			throw new FieldErrorException("Eingegebene Zahlenwerte sind < 1 und oder > 7 ");
		}

		return true;
	}

	public boolean checkValidLetter(String txt) {
		// Geht auch :
//		char[] validLetter = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
//		for (int i = 0; i < validLetter.length; i++) {
//			if (txt.charAt(0) == validLetter[i]) {
//				return true;
//			}
//		}
//		return false;

		txt = txt.toLowerCase(); // Wandelt Gro�buchstaben in Kleinbuchstaben um
		char c = txt.charAt(0);
		if (c < 'a' || c > 'h') {
			return false;
		}
		return true;
	}

	public boolean checkValidNumber(String txt) {
		// Geht auch :
//		char[] validNumber = { '1', '2', '3', '4', '5', '6', '7' };
//		for (int i = 0; i < validNumber.length; i++) {
//			if (txt.charAt(1) == validNumber[i]) {
//				return true;
//			}
//		}
//		return false;

		char c = txt.charAt(1);
		if (c < '1' || c > '8') {
			return false;
		}
		return true;
	}

	public static void main(String[] args) throws FieldErrorException {

		ChestException e1 = new ChestException();
		Scanner sc = new Scanner(System.in);
		boolean b = false;

		while (!b) { // wird so lange durchlaufen bis true zur�ckgegeben wird
			try {
				System.out.print("Bitte Feldbezeichnung eingeben (zwischen A & G und zwischen 1 & 7): ");
				String txt = sc.nextLine();
				b = e1.checkChessField(txt);
				System.out.println("Eingabe ist korrekt!");
			} catch (FieldErrorException e) {
				System.out.println(e.getMessage());
			}
		}
		sc.close();

	}

}
