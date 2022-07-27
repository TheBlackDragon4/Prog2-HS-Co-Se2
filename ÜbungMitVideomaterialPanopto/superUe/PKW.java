package superUe;

public class PKW extends Fahrzeug {

	// Kaskadierung ist nicht möglich mit super.super
	
	private float leistung;
	private int anzahlraeder;

	public PKW(int leistung, int anzahlraeder) {
		super(leistung); // Zugriff auf Oberklassenkonstruktor der Klasse Fahrzeug die hier vererbt wird
		this.anzahlraeder = anzahlraeder;
	}

	public void printLeistung() {

		System.out.println(leistung); // Ausgabe der Leistung dieser Klasse
		System.out.println(super.leistung); // in diesem Fall sorgt das "super"dafür, dass ich auf die Vaterklasse
											// "Fahrzeug" zugreifen kann
	}

	public void beschleunigen() {
		// hier soll die Methode "beschleunigen" aus Fahrzeug erweitert werden

		super.beschleunigen(); // Ausführen der Methode beschleunigen aus Klasse Fahrzeug
		// weiteren Spezialisierungs-Code eingeben möglich

	}

}
