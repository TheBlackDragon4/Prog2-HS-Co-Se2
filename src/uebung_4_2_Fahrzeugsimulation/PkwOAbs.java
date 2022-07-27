package uebung_4_2_Fahrzeugsimulation;

public class PkwOAbs extends Pkw {

	public PkwOAbs(String name) {
		super(name);
	}

	protected double hoechstGeschwindigkeit() {
		return 140; // km/h
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

}
