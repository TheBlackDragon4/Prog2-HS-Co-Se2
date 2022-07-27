package escapeRoomProjekt;

public class Game {

	public int rooms;

	// Konstruktor
	// Default - Konstrukor wird ausgeführt, wenn keine Raumanzahl angegeben wird ->
	// Somit wird nur ein Raum erstellt
	public Game() {
		this.rooms = 1;
	}

	// Mit diesem Konstruktor hast du die Wahl die Anzahl der Räume anzugeben
	public Game(int rooms) {
		this.rooms = rooms;
	}

	// Getter & Setter
	public int getRooms() { // Wahlweise Ausgabe der Raumanzahl in diesem Programm
		return rooms;
	}

	// Methoden
	// Diese Methode dient einzig und alleine des strukturierten Aufrufes der Spielelogik
	public void Spielelogik() { // Angabe bzw. Ausführung der Spielelogik
		InOut inout = new InOut(); // InOut Objekt Erstellung
		inout.ueberschrift(); // Aufruf der Überschrift
		inout.einleitung(); // Aufruf der Einleitunge

		EscapeRoom escapeRoom = new EscapeRoom(inout.anzahlRaetsel()); // Erweiterbarkeit durch Eingabe der Rätselanzahl
		escapeRoom.raetselAufruf(); // Hier wird eigentlich nur die Methode raetselAufruf aufgerufen
		escapeRoom.rightFinalPW(); // Methodenaufruf für die Zusammenstellung der richtigen Passwörter
		escapeRoom.finalesPW(); // Methodenaufruf für die Aufforderung der Eingabe des PW und Korrektheitsprüfung

	}

	// toString
	public String toString() {
		return " Anzahl der Räume: " + rooms;
	}

	// Aufruf der Spielelogik um das Programm ausführen zu können
	public static void main(String[] args) {
		Game game = new Game(1);
		game.Spielelogik();

	}

}
