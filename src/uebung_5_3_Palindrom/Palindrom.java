package uebung_5_3_Palindrom;

import java.util.Stack;

public class Palindrom {
	// Aufgabe mit Stack nutzen

	public static boolean isPalindrom(String text) {

		// IDEE:
		// String Objekt muss übergeben werden
		// Identifikation ob eingegebener String auch wirklich ein Palindrom ist
		// Palindrome müssen vorwärts und rückwärts gelesen identisch sind
		//
		// Erzeugen eines Stacks
		// Befüllen dieses Stacks mithilfe von "push"
		// Leeren des Stacks mithilfe von "pop"
		//
		// Prüfen ob sich im eigentlichen Stack überhaupt ein Wert befindet oder eben
		// nicht
		// Jeder einzelne Wert muss dann entnommen werden und somit muss nachgeprüft
		// werden, ob alles ein Letter ist oder eben nicht

		Stack<Character> oneStack = new Stack<Character>(); // muss erst mit Werten befüllt werden

		char werte = ' '; // erstellen eines char Arrays um alle Werte frei hin und her nehmen zu können

		// Durchlauf des String Objektes und Handhabung einzelner Operationen
		for (int i = 0; i < text.length(); i++) {

			werte = text.charAt(i); // Durch CharAt werden alle Werte in ein Char konvetiert

			// Überprüfung ob m überhaupt ein Buchstabe ist
			if (Character.isLetter(werte)) {
				oneStack.push(werte); // Stack wird durch / mit hilfe von "push" befüllt.
			}

		}

		boolean isPalindrom = true; // Zwischenspeicher, Hier gehen wir einmal davon aus, das der STring ein
									// Palindrom ist
		char letter = ' '; // erstellen eines neuen char Arrays um alle Werte zwischenspeichern zu können

		for (int i = 0; i < text.length() && !oneStack.isEmpty(); i++) {

			letter = text.charAt(i);

			// Eingabe eines Strings mit einem Leerzeichen würde hier aufgrund der Prüfung
			// auf "letter" auch funktionieren
			if (!Character.isLetter(letter)) { // Überprüfen ob der Wert an Position x überhaupt ein Buchstabe ist,
												// ansonsten wird dieser Index übersprungen
				continue; // Weiter mit nächsten Schritt
			}

			// Überprüfung, ob Wert an Position "i" dem Wert entspricht an oberster Stelle
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
