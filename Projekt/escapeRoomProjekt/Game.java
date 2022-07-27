package escapeRoomProjekt;

public class Game {

	public int rooms;

	// Konstruktor
	// Default - Konstrukor wird ausgef�hrt, wenn keine Raumanzahl angegeben wird ->
	// Somit wird nur ein Raum erstellt
	public Game() {
		this.rooms = 1;
	}

	// Mit diesem Konstruktor hast du die Wahl die Anzahl der R�ume anzugeben
	public Game(int rooms) {
		this.rooms = rooms;
	}

	// Getter & Setter
	public int getRooms() { // Wahlweise Ausgabe der Raumanzahl in diesem Programm
		return rooms;
	}

	// Methoden
	// Diese Methode dient einzig und alleine des strukturierten Aufrufes der Spielelogik
	public void Spielelogik() { // Angabe bzw. Ausf�hrung der Spielelogik
		InOut inout = new InOut(); // InOut Objekt Erstellung
		inout.ueberschrift(); // Aufruf der �berschrift
		inout.einleitung(); // Aufruf der Einleitunge

		EscapeRoom escapeRoom = new EscapeRoom(inout.anzahlRaetsel()); // Erweiterbarkeit durch Eingabe der R�tselanzahl
		escapeRoom.raetselAufruf(); // Hier wird eigentlich nur die Methode raetselAufruf aufgerufen
		escapeRoom.rightFinalPW(); // Methodenaufruf f�r die Zusammenstellung der richtigen Passw�rter
		escapeRoom.finalesPW(); // Methodenaufruf f�r die Aufforderung der Eingabe des PW und Korrektheitspr�fung

	}

	// toString
	public String toString() {
		return " Anzahl der R�ume: " + rooms;
	}

	// Aufruf der Spielelogik um das Programm ausf�hren zu k�nnen
	public static void main(String[] args) {
		Game game = new Game(1);
		game.Spielelogik();

	}

}
