package uebung_2_2_Kartenspiel;

import java.util.Arrays;

public class Kartenspiel {

	private Karte[] karten;

	public Kartenspiel(int n) {
		karten = new Karte[n]; // Definition der Länge des karten arrays

		Farbe[] farben = Farbe.values(); // Farbe.values() erstellt ein ENUM Array von Farben
		Karte.Wert[] werte = Karte.Wert.values(); // Farbe.values() erstellt ein ENUM Array von Werten

		for (int i = 0; i < karten.length; i++) {
			// ------------------------------------- - Zugriff auf Farb bzw. Wert Enum
			// ------------------------------------- - .values() liefert Einzelwerte aus dem
			// ------------------------------------- - Enum zurück
			// Generierung eines Random Wertes aus dem Enum Farben und aus dem Enum Werte
			// int randomFarbe = (int) (Math.random() * Farbe.values().length);
			// int randomWert = (int) (Math.random() * Karte.Werte.values().length);

			int randomFarbe = (int) (Math.random() * farben.length);
			int randomWert = (int) (Math.random() * werte.length);

			// Erstellung von KartenWerten mit den Werten die ich random herausgesucht hatte
			karten[i] = new Karte(farben[randomFarbe], werte[randomWert]);
		}
	}

	public Karte[] getKarten() {
		return karten;
	}

	public void mischen() {

		// Itterierung über das Kartenarray das von mir im Konstruktor mit Karten
		// befüllt wurde
		for (int i = 0; i < karten.length; i++) {
			// Generiert Random Werte aus dem zuvor befüllten KartenArray
			int ersterIndex = (int) (Math.random() * karten.length);
			int zweiterIndex = (int) (Math.random() * karten.length);

			// Hier werden die Karten im kartenArray gemischt in Abhängigkeit der Position
			Karte karte = karten[ersterIndex];
			karten[ersterIndex] = karten[zweiterIndex];
			karten[zweiterIndex] = karte;

		}

	}

	public void sortieren() {
		// Mit dieser Methode soll das Arrays.sort(...) sortiert werden
		// Wird benötigt um ein Kartenspiel zu Sortieren
		Arrays.sort(karten); // Arrays.sort(...); ruft compareTo auf
	}

	public void add(Kartenspiel neu) {
		
		Karte[] combi = new Karte[karten.length + neu.karten.length];
		System.arraycopy(this.karten, 0, combi, 0, this.karten.length);
		System.arraycopy(neu.karten, 0, combi, karten.length, neu.karten.length);
		this.karten = combi;
		
	}
	
	public String toString() {
		return Arrays.toString(karten);
	}

}
