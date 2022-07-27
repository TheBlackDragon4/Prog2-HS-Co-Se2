package uebung_4_2_Fahrzeugsimulation;

public class Pkw extends Fahrzeug {

	private static final double pKW_Beschleunigen = 2.0;

	public Pkw(String name) {
		super(name);
	} 

	// Gilt für PKWs mit und ohne ABS
	protected double beschleunigen(double sekunden) {
		return super.beschleunigen(pKW_Beschleunigen, sekunden); // Einheit in m/sekunde^2
	}

	protected double hoechstGeschwindigkeit() {
		return 160.0; // km/h
	}

	public double stoppen() {
		// durch super.geschwindigkeit wird die Variable Geschwindigkeit der
		// darüberliegenden Klasse aufgerufen
		double anhalteweg = (Math.pow(super.geschwindigkeit / 10, 2) + (super.geschwindigkeit / 10 * 3));
		position += anhalteweg / 1000; // Da wird das in km berechnen wollen und die Position auch in km
												// festgelegt wurde
		super.geschwindigkeit = 0; // Da wird gebremst haben
		return anhalteweg; // ist in m da hier keine Umrechnung stattgefunden hatte
	}

	public String toString() {
		return "\nFahrzeugname: " + name + ", Geschwindigkeit: " + super.geschwindigkeit + " km/h, Position: "
				+ super.position + " km ";
	}

}
