package escapeRoomProjekt;

import java.util.Arrays;

public class EscapeRoom {

	private String finalPW;
	private int anzahlRaetsel;
	private int[] arrayPW;

	// Konstruktor
	/**
	 * Standardkonstruktor mit der Mindstanzahl von 3 Rätseln mit dieser Anzahl wird
	 * ein Array erstellt mit der Länge der Rätselanzahl
	 */
	public EscapeRoom() { // Default - Konstruktor
		this.anzahlRaetsel = 3;
		this.arrayPW = new int[anzahlRaetsel];
	}

	/**
	 * Konstruktor für den manuell Aufruf für die Rätselanzahl mit dieser Anzahl
	 * wird ein Array erstellt mit der Länge der Rätselanzahl
	 * 
	 * @param anzahlRaetsel - Übergibt die Anzahl der Rätsel
	 */
	public EscapeRoom(int anzahlRaetsel) {
		this.anzahlRaetsel = anzahlRaetsel;
		this.arrayPW = new int[anzahlRaetsel];
	}

	// Getter & setter
	public String getFinalPW() {
		return finalPW;
	}

	// Mögliche Übergabe der Rätselanzahl
	public int getAnzahlRaetsel() {
		return anzahlRaetsel;
	}

	// Mögliche Übergabe des entsprechenden Array Passworts
	public int[] getArrayPW() {
		return arrayPW;
	}

	// Methode
	public void raetselAufruf() {
		int zahlRaetsel = (int) (Math.random() * 3 + 1); // Random -> Zufällige Werte von 1 bis 3 generiert
		int indexRaetsel = (int) (Math.random() * anzahlRaetsel); // Random -> Wert zwischen 0 und anzahl Rätsel wird
																	// generiert

		Riddle riddle = new Riddle(anzahlRaetsel); // Erstellung eines entsprechenden riddle Objektes
		while (!riddle.isFinish()) { //

			zahlRaetsel = (int) (Math.random() * anzahlRaetsel + 1); // Random -> Wert zwischen 0 und anzahlRaetsel wird
																		// generiert

			while (riddle.getRaetsel()[indexRaetsel] == true) { // riddle.getRaetsel -> Rückgabe von Array [indexRaetsel]
				indexRaetsel = (int) (Math.random() * anzahlRaetsel);
			}

			switch (zahlRaetsel) { // Erstellten Wert zwischen 1 und 3 generiert und in Switch Case aufrufen lassen
			case 1: {
				arrayPW[indexRaetsel] = riddle.raetselOne(indexRaetsel); // Rätselaufruf und Schreiben des
																			// Rückgabewertes in arrayPW an Position von
																			// indexRaetsel
				break;
			}
			case 2: {
				arrayPW[indexRaetsel] = riddle.raetselTwo(indexRaetsel); // Rätselaufruf und Schreiben des
																			// Rückgabewertes in arrayPW an Position von
																			// indexRaetsel
				break;
			}
			case 3: {
				arrayPW[indexRaetsel] = riddle.raetselThree(indexRaetsel); // Rätselaufruf und Schreiben des
																			// Rückgabewertes in arrayPW an Position von
																			// indexRaetsel
				break;
			}
			}

		}

	}

	/**
	 * Hier wird das korrekte Passwort in einen StringBuffer zusammengefügt und
	 * zurückgegeben um das Rätsel zu beenden
	 */
	public void rightFinalPW() {

		StringBuffer stringBuffer = new StringBuffer(); // Erstellung eines StringBuffer Objektes
		for (int a : arrayPW) { // lesenden Zugriff auf das PasswortArray
			stringBuffer.append(a);
		}
		finalPW = stringBuffer.toString(); // Schreiben in Variable von StringBuffer.toString();

	}

	/**
	 * Hier wird das Passwort vom Bediener im Laufe des Rätsels eingegeben
	 */
	public void finalesPW() {

		InOut inOut = new InOut(); // Objekt von inOut wurde / wird erstellt
		String finalesPWUser;
		do {
			finalesPWUser = inOut.abfragePW(); // Abfrage des einzugebenden Passwortes durch den Bediener
		} while (finalPW.equals(finalesPWUser) == false); // Überprüfung ob von Bediener eingegebenes Passwort korrekt
															// ist oder nicht
		inOut.korrektesPW(); // Ausgabe des Textes bei korrekt eingegebenen Passwortes

	}

	// toString
	public String toString() {
		return " Finales Passwort: " + finalPW + ", Anzahl der Rätsel: " + anzahlRaetsel + ", Passwort Array: "
				+ Arrays.toString(arrayPW);
	}

}
