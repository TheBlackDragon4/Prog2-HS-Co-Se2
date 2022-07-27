package uebung_5_3_Palindrom;

import java.util.Stack;

public class Palindrom {
	// Aufgabe mit Stack nutzen

	public static boolean isPalindrom(String text) {

		// IDEE:
		// String Objekt muss �bergeben werden
		// Identifikation ob eingegebener String auch wirklich ein Palindrom ist
		// Palindrome m�ssen vorw�rts und r�ckw�rts gelesen identisch sind
		//
		// Erzeugen eines Stacks
		// Bef�llen dieses Stacks mithilfe von "push"
		// Leeren des Stacks mithilfe von "pop"
		//
		// Pr�fen ob sich im eigentlichen Stack �berhaupt ein Wert befindet oder eben
		// nicht
		// Jeder einzelne Wert muss dann entnommen werden und somit muss nachgepr�ft
		// werden, ob alles ein Letter ist oder eben nicht

		Stack<Character> oneStack = new Stack<Character>(); // muss erst mit Werten bef�llt werden

		char werte = ' '; // erstellen eines char Arrays um alle Werte frei hin und her nehmen zu k�nnen

		// Durchlauf des String Objektes und Handhabung einzelner Operationen
		for (int i = 0; i < text.length(); i++) {

			werte = text.charAt(i); // Durch CharAt werden alle Werte in ein Char konvetiert

			// �berpr�fung ob m �berhaupt ein Buchstabe ist
			if (Character.isLetter(werte)) {
				oneStack.push(werte); // Stack wird durch / mit hilfe von "push" bef�llt.
			}

		}

		boolean isPalindrom = true; // Zwischenspeicher, Hier gehen wir einmal davon aus, das der STring ein
									// Palindrom ist
		char letter = ' '; // erstellen eines neuen char Arrays um alle Werte zwischenspeichern zu k�nnen

		for (int i = 0; i < text.length() && !oneStack.isEmpty(); i++) {

			letter = text.charAt(i);

			// Eingabe eines Strings mit einem Leerzeichen w�rde hier aufgrund der Pr�fung
			// auf "letter" auch funktionieren
			if (!Character.isLetter(letter)) { // �berpr�fen ob der Wert an Position x �berhaupt ein Buchstabe ist,
												// ansonsten wird dieser Index �bersprungen
				continue; // Weiter mit n�chsten Schritt
			}

			// �berpr�fung, ob Wert an Position "i" dem Wert entspricht an oberster Stelle
			// des Stacks
			if (letter != oneStack.pop()) {
				isPalindrom = false;
				break;
			}

		}
		return isPalindrom;

	}

	public static void main(String[] args) {

		String text = "a hannah";
		boolean p = Palindrom.isPalindrom(text);

		if (p != true) {
			System.out.println("Eingegebenes Wort: '" + text + "' ist kein Palindrom. ");
		} else {
			System.out.println("Eingegebenes Wort: '" + text + "' ist ein Palindrom. ");
		}

	}

}
