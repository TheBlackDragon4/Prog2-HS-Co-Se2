package escapeRoomProjekt;

import java.util.Arrays;

public class Riddle {

	private int anzahlRaetsel;
	private boolean[] raetsel;

	// Konstruktor
	public Riddle() { // Default - Konstruktor
	}

	/**
	 * Konstruktor um ein Boolean Array zu erstellen, dass an jeder Position des
	 * Arrays (L�nger der Anzahl der R�tsel) ein false schreibt
	 * 
	 * @param anzahlRaetsel - �bergabe der Variable f�r die Angabe der R�tselanzahl
	 */
	public Riddle(int anzahlRaetsel) { // Mitgabe des Array der L�nge nach Wahl Bsp.: L�nge 5
		raetsel = new boolean[anzahlRaetsel];
		this.anzahlRaetsel = anzahlRaetsel;

		for (int i = 0; i < raetsel.length; i++) { // L�uft durch R�tsel Array durch
			raetsel[i] = false; // Array wird mit false bef�llt
		}

	}

	// Getter & Setter
	public int getAnzahlRaetsel() { // Wahlweise Ausgabe der R�tselanzahl
		return anzahlRaetsel;
	}

	public boolean[] getRaetsel() { // Wahlweise Ausgabe des Boolean Arrays
		return raetsel;
	}

	// Methoden
	/**
	 * Hier wird von der EscapeRoom Klasse die Position des Arrays �bergeben,
	 * verrechnet und Ausgegeben mithilfe einer Modulo Operation
	 * 
	 * @param positioninArray - Arrayindex�bergabe
	 * @return (int) (inputresult % 10) - Wert wird mit Modulo 10 verrechnet
	 */
	public int raetselOne(int positioninArray) { // hierbei handelt es sich um das erste R�tsel mit Namen "raetselOne"
		InOut inOut = new InOut(); // inOut Objekt wird hier erstellt

		inOut.raetselOneEinleitung(); // In diesem Bereich befinden sich die Einleitungstexte der entsprechenden
										// R�tsel

		// Richtige L�sungswerte
		int rightNumberOne = 200;
		double rightNumberTwo = 4.5; // Diese drei Variablen zeigen die richtigen Ergebnisse an
		double rightnumberThree = -2.98;

		// R�tselberechnung
		double inputresult;
		do {
			inputresult = inOut.raetselOneAbfragen(); // Abfrage der enstsprechenden Werte durch Bedienereingaben
		} while (inputVerification(rightNumberOne + rightNumberTwo + rightnumberThree, inputresult,
				positioninArray) == false); // �berpr�fung ob die eingegebenen Werte richtig sind

		inOut.zwischenSequenz(positioninArray); // Ausgabe der Zwischensequenz
		return (int) (inputresult % 10); // Ergebnis des ersten R�tsel -> �bergabe an EscapeRoom da f�r finalesPW
	}

	/**
	 * Hier wird von der EscapeRoom Klasse die Position des Arrays �bergeben,
	 * verrechnet und Ausgegeben mithilfe einer Modulo Operation
	 * 
	 * @param positioninArray - Arrayindex�bergabe
	 * @return inputBuildingPosition % 10 - Wert wird mit Modulo 10 verrechnet
	 */
	public int raetselTwo(int positioninArray) { // Inputs wegmachen
		InOut inOut = new InOut(); // inOut Objekt wird hier erstellt

		inOut.raetselTwoEinleitung(); // In diesem Bereich befinden sich die Einleitungstexte der entsprechenden
										// R�tsel

		// Richtige L�sungswerte
		int rightBuilding = 3; // Diese variable Zeigt das richtige Ergebnisse an

		// R�tselberechnung
		int inputBuildingPosition;
		do {
			inputBuildingPosition = inOut.raetselTwoAbfragen(); // Abfrage der entsprechenden Werte durch
																// Bedienereingaben
		} while (inputVerification(rightBuilding, inputBuildingPosition, positioninArray) == false);

		inOut.zwischenSequenz(positioninArray); // Ausgabe der Zwischensequenz
		return inputBuildingPosition % 10; // Ergebnis des ersten R�tsel
	}

	/**
	 * Hier wird von der EscapeRoom Klasse die Position des Arrays �bergeben,
	 * verrechnet und Ausgegeben mithilfe einer Modulo Operation
	 * 
	 * @param positioninArray - Arrayindex�bergabe
	 * @return inputAnzahl % 10 - Wert wird mit Modulo 10 verrechnet
	 */
	public int raetselThree(int positioninArray) { // Inputs wegmachen
		InOut inOut = new InOut(); // inOut Objekt wird hier erstellt

		inOut.raetselThreeEinleitung(); // In diesem Bereich befinden sich die Einleitungstexte der entsprechenden
										// R�tsel

		// Richtige L�sungswerte
		String raetselHaschString = "\n#+�^�+#\r\n" + "+oxoxo+\r\n" + "#xoxox#\r\n" + "+oxoxo+\r\n" + "#+�^�+#";
		int counter = 0; // Korrekter Wert
		int current = 0; // Aktueller Wert
		int last = -2;

		for (int i = -1; i < raetselHaschString.length();) {
			current = raetselHaschString.indexOf("#", ++i); // Hier wird herausgefunden an welcher Position die Werte
															// vorhanden
			if (current != -1 && current != last) { // Pr�ft ob Aktueller Wert -1 also NOT Match oder ob Character
													// gefunden wurde
				last = current;
				counter++;
			}
		}

		// R�tselberechnung
		int inputAnzahl;
		do {
			inputAnzahl = inOut.raetselThreeAbfragen(); // Abfrage der enstsprechenden Werte durch Bedienereingaben
		} while (inputVerification(counter, inputAnzahl, positioninArray) == false); // Abfrage ob die Eingabe korrekt
																						// war oder ist

		inOut.zwischenSequenz(positioninArray); // Ausgabe der Zwischensequenz
		return inputAnzahl % 10; // Ergebnis des ersten R�tsel -> �bergabe an EscapeRoom da f�r
	}

	/**
	 * Vergleich / �berpr�fung der entsprechend mitgegebenen Werte
	 * 
	 * @result Ausgabe von true und false nach entsprechender �berpr�fung
	 * @param correctResult - �bergabe des korrekten Ergebnisses
	 * @param inputResult   - �bergebe des eingegebenen Ergebnisses von Bediener
	 * @param position      - Position innerhalb des Arrays
	 */
	public boolean inputVerification(double correctResult, double inputResult, int position) {
		if (correctResult == inputResult) {
			for (int i = 0; i < raetsel.length; i++) {
				raetsel[position] = true;
			}
			return true;
		} else {
			for (int i = 0; i < raetsel.length; i++) {
				raetsel[position] = false;
			}
			return false;
		}
		
	}

	/**
	 * �berpr�fung einzelner Werte im Raetsel Array auf true und false
	 * 
	 * @return true oder false je nachdem ob im Array true oder false steht
	 */
	public boolean isFinish() {

		for (boolean b : raetsel) {
			if (!b)
				return false;
		}
		return true;
	}

	// toString
	public String toString() {
		return " Anzahl der R�tsel: " + anzahlRaetsel + ", Inhalte des R�tselArrays: " + Arrays.toString(raetsel);
	}

}
