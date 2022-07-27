package uebung_4_3_Mobiles;

// Klasse für die entsprechenden Stäbchen
public class Wire implements Mobile {

	private final Mobile m1;
	private final Mobile m2;
	private double ersteDistanz;
	private double zweiteDistanz;

	public Wire(Mobile m1, Mobile m2, double laengeStaebchen) {
		this.m1 = m1;
		this.m2 = m2;

		// Zuweisung der Distanzangaben
		this.ersteDistanz = 0; // Startwert der mitgegebenen Länge / Distanz
		this.zweiteDistanz = laengeStaebchen; // Endwert der Gesamtlänge des Stäbchen

	}

	public double weight() {
		return m1.weight() + m2.weight();
	}

	public void balance() {
		// Beispiel:
		// Gesamtlänge = 9
		// länge ersteDistanz (a) = ?
		// länge zweiteDistanz (b) = ?
		// Gewicht m1 = 2
		// Gewicht m2 = 4

		// Formel: 2 * a === 4 * b
		// Überlegung für a: (m2 * 9) / (m1 + m2) = 3
		// Überlegung für b: (m1 * 9) / (m1 + m2) = 6

		m1.balance(); // Mobiles müssen jedes Mal neu Ausbalansiert werden
		m2.balance(); // Mobiles müssen jedes Mal neu Ausbalansiert werden

		final double gesamtLaengeStaebchen = ersteDistanz + zweiteDistanz;

		ersteDistanz = (m2.weight() * gesamtLaengeStaebchen) / (m1.weight() + m2.weight()); // Distanz a in meinem
																							// Beispiel
		zweiteDistanz = (m1.weight() * gesamtLaengeStaebchen) / (m1.weight() + m2.weight()); // Diestanz b in meinem
																								// Beispiel
	}

	public String toString() {
		return " [Mobile: " + ersteDistanz + m1.toString() + zweiteDistanz + m2.toString() + "] ";
	}

}
