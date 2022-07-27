package uebung_4_2_Fahrzeugsimulation;

public abstract class Fahrzeug {

	protected double position; // in km
	protected double geschwindigkeit; // km/h
	protected String name; // Fahrzeugname

	public Fahrzeug() {

	}

	public Fahrzeug(String name) {
		this.name = name;
	}

	// abstract Methoden m�ssen in den einzelnen Klassen implementiert werden je
	// nach den unterschiedlichen Spezifikationen
	protected abstract double beschleunigen(double sekunden);

	protected abstract double hoechstGeschwindigkeit();

	protected abstract double stoppen();

	// R�ckgabewert ist in km
	public double beschleunigen(double a, double sekunden) {

		// Formel: Geschwindigkeit = Beschleunigung * Zeit
		// v = a * t;
		double v = a * sekunden; // m/sek
		geschwindigkeit = (v * 3600) / 1000; // m/sek -> m/h -> km/h

		if (geschwindigkeit > hoechstGeschwindigkeit()) {
			geschwindigkeit = hoechstGeschwindigkeit();
			double sek = (geschwindigkeit / 3600 * 1000) / a; // Formel nach t also nach sekunden umgestellt
			position = (0.5 * a * Math.pow(sek, 2)) / 1000; // Ergebnis ist in m -> hier soll von m auf km umgewandelt
															// werden
			return fahren((sekunden - sek) / 60); // sekunden - sek da hier die mitgegebene Sekunden - Restsekunden
													// berechnet werden
		} else {
			double s = 0.5 * a * Math.pow(sekunden, 2);
			position = s / 1000; // /1000 weil ich von m in km m�chte
			return position;
		}
		// return ... ; // Position des Fahrzeugs in km (Killometer)
	}

	public double fahren(double minuten) { // F�hrt minuten mit aktueller Geschwindigkeit weiter
		// Mit "minuten" f�hrt das Fahrzeug die entsprechenden Killomenter weiter
		double sek = minuten / 60;
		return position += geschwindigkeit * sek;
		// return 0.0; // Position des Fahrzeugs
	}

	public String toString() {
		return " Geschwindigkeit: " + geschwindigkeit + " Position: " + position;
	}

}