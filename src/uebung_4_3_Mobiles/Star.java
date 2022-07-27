package uebung_4_3_Mobiles;

// Klasse für die entsprechenden Sterne
public class Star implements Mobile {
	
	// Gewicht muss positiv sein sonst Wurf der IllegalArgumentException
	protected double gewicht; // Gewicht darf durch Dekoration verändert werden

	public Star(double gewicht) {
		this.gewicht = gewicht;
	}

	// Überprüfung ob das Gewicht positiv oder negativ ist
	public double weight() throws IllegalArgumentException {

		if (gewicht <= 0) { // kann in den Konstruktor geschrieben werden
			throw new IllegalArgumentException("Der Wert muss positiv sein.");
		} else {
			return gewicht;
		}

	}

	public void balance() {
		// Der Stern ist immer Ausbalanciert und daher muss in dieser Methode nichts
		// implementiert werden.
	}
	
	public String toString() {
		return ", Sterngewicht: [" + gewicht + "], ";
	}

}
