package uebung_4_2_Fahrzeugsimulation;

public class Lkw extends Fahrzeug {

	private static final double lKW_Beschleunigung = 0.5;
	private static final double lKW_Verzoegerung_VollBeladen = 3.0;
	private static final double lKW_Verzoegerung_Unbeladen = 5.0;
	protected double ladung;
	protected double maxLadung;

	public Lkw(double maxLadung, String name) {
		super(name); // Aufruf des Oberklassenkonstruktors muss immer an erster Stelle sein
		this.maxLadung = maxLadung; // Wird pro LKW festgelegt, wie viel dieser maximal laden darf
	}

	protected double beschleunigen(double sekunden) {
		return super.beschleunigen(lKW_Beschleunigung, sekunden); // Einheit in m/sek^2
	}

	protected double hoechstGeschwindigkeit() {
		return 105; // km/h
	}

	public double stoppen() {
		double geschwindigkeitInMeterProSekunde = ((super.geschwindigkeit / 60) * 1000) / 60; // implementierung in
																								// Sekunden
		double lkwVerzoegerung; // In Formel ist die Berz�gerung das "a"

		if (istVollBeladen()) { // LKW Voll beladen
			lkwVerzoegerung = lKW_Verzoegerung_VollBeladen; // Zuweisung des Voll beladenen LKW
		} else {
			lkwVerzoegerung = lKW_Verzoegerung_Unbeladen; // Zuweisung des Leeren LKW
		}

		// Berechnung des Anhaltewegs nach Aufgabenstellung
		double anhalteweg = (0.5 * ((Math.pow(geschwindigkeitInMeterProSekunde, 2 / lkwVerzoegerung)
				+ (super.geschwindigkeit / 10) * 3)));
		position += anhalteweg / 1000; // R�ckgabe soll in Meter stattfinden
		super.geschwindigkeit = 0; // Wird auf 0 gesetzt, da nach dem Stoppen der LKW steht
		return anhalteweg;
	}

	public void beladen(double ladungInTonnen) {
		if ((ladung + ladungInTonnen) > maxLadung) {
			ladung = maxLadung;
		} else {
			ladung += ladungInTonnen;
		}
	}

	public void entladen(double ladungInTonnen) {
		if ((ladung - ladungInTonnen) < 0) {
			ladung = 0;
		} else {
			ladung -= ladungInTonnen;
		}
	}

	public boolean istVollBeladen() {
		if (ladung == maxLadung) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "\nFahrzeugname: " + name + ", Geschwindigkeit: " + super.geschwindigkeit + " km/h, Position: "
				+ super.position + " km ";
	}

}
