package uebung_4_1_Dozentenverwaltung;

public class Student extends Person {

	private final int matrikelnummer;
	private int gehalt = 0; // eigentlich müsste dieses Gehalt in Person stehen

	public Student(String vorname, String nachname, String strassenname, String hausnummer, String ort,
			int postleitzahl, int matrikelnummer, int gehalt) {
		super(vorname, nachname, strassenname, hausnummer, ort, postleitzahl);
		this.matrikelnummer = matrikelnummer;
		this.gehalt = gehalt;
	}

	public int getGehalt() {
		return gehalt;
	}

	public void setGehalt(int gehalt) {
		this.gehalt = gehalt;
	}

	public int getMatrikelnummer() {
		return matrikelnummer;
	}

	public int gehalt() {
		return gehalt;
	}

	public String toString() {
		return "\nStudenteninformation: [Matrikelnummer: " + this.matrikelnummer + "] \n [Vorname: " + this.vorname
				+ ", Nachname: " + this.nachname + ",\n Straßenname: " + this.strassenname + " Hausnummer: "
				+ this.hausnummer + ",\n Postleitzahl: " + this.postleitzahl + " Ort: " + this.ort + ",\n Gehalt: "
				+ this.gehalt + "€ ]";
	}

}
