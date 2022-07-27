package uebung_2_2_Kartenspiel;

public class Karte implements Comparable<Karte> {

	// 3 Vorteile von ENUMS:
	// klar definierter Wertebereich
	// performanter
	// besser lesbar

	// Erstellung eines Werte Enums mit Informationen
	// Befüllung der Enum - Werte
//	public enum Farbe {KARO, HERZ, PIK, KREUZ}; // Alternativ  -> Siehe eigene ENUM Klasse
	public enum Wert {
		SIEBEN, ACHT, NEUN, ZEHN, BAUEN, DAME, KOENIG, ASS
	}; // Alternativ in Extraklasse

	// Initialisierung von Instanzvariablen
	// Initialisierung der Enums als private
	private final Farbe farbe;
	private final Wert wert;

	public Karte(Farbe f, Wert w) {
		this.farbe = f;
		this.wert = w;
	}

	public Farbe getFarbe() {
		return farbe;
	}

//	public void setFarbe(Farbe farbe) {
//		this.farbe = farbe;
//	}

	public Wert getWert() {
		return wert;
	}

//	public void setWert(Werte wert) {
//		this.wert = wert;
//	}

	// Hier sollen Objekte miteinander verglichen werden
	public int compareTo(Karte k) {

//		return this.farbe.ordinal() - this.farbe.ordinal();
		// oder:
		return k.farbe.ordinal() - this.farbe.ordinal(); // Bei Vertrauschung invertierte Berechnung
		// oder:
//		if (k.farbe.equals(this.farbe)) { // Prüft ob die Kartenwerte gleich sind
//			return 0; // Gibt 0 zurück und zeigt, dass die Werte identisch sind
//		} else if (k.farbe.ordinal() < this.farbe.ordinal()) { // ordinal() gibt eine ID, eine Zahl zurück
//			return 1; // Gibt eine 1 zurück und somit einen Fehler -> Sortierung kann stattfinden
//			// return 10000000000000000000;
//		} else if (k.farbe.ordinal() > this.farbe.ordinal()) {
//			return -1; // Im Array befindlicher Farbwert ist größer als der des schon vorhandenen ENUMS
//			// return -100000000000000000;
//		} else {
//			return 0;
//		}

	}

	// Prüfung ob zwei Werte inhaltsgleich sind
	public boolean equals(Object o) {

		// Überprüft ob das mitgegebene Objekt NULL ist oder ob ein Wert enthalten ist
		if (o == null) {
			return false;
		}

		if (this == o) {
			return true;
		}

		// Prüft ob Objekt ein Objekt des Typs Karte ist
		if (getClass() != o.getClass()) {
			return false;
		}

		// geht, da hier das Objekt o ein Objekt kann hier gecasted werden
		Karte k = (Karte) o;

		// Ist Inhaltsgleich wenn das Objekt die gleiche Farbe und den gleichen Wert
		// besizt
		if (!this.farbe.equals(k.farbe)) {
			return false;
		}

		if (!this.farbe.equals((k.wert))) {
			return false;
		}

		return true;

	}

	public int hashCode() {
		int hash = 17;
		int p = 37;

		hash = p * hash + farbe.hashCode() + wert.hashCode(); // % p vermeidet Überlauf

		// hash = p*hash + farbe.ordinal() + wert.ordinal(); // als Alternative

		return hash;
	}

	public String toString() {
		return "" + farbe + " " + wert;
	}

}
