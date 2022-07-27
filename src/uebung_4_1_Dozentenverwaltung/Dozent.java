package uebung_4_1_Dozentenverwaltung;

public class Dozent extends Person {

	private String lehrgebiet;
	private int gehalt = 0;

	public Dozent(String vorname, String nachname, String strassenname, String hausnummer, String ort, int postleitzahl,
			String lehrgebiet, int gehalt) {
		super(vorname, nachname, strassenname, hausnummer, ort, postleitzahl);
		this.lehrgebiet = lehrgebiet;
		this.gehalt = gehalt;
	}

	public String getLehrgebiet() {
		return lehrgebiet;
	}

	public void setLehrgebiet(String lehrgebiet) {
		this.lehrgebiet = lehrgebiet;
	}

	public int getGehalt() {
		return gehalt;
	}

	public void setGehalt(int gehalt) {
		this.gehalt = gehalt;
	}

	public int gehalt() {
		return gehalt;
	}

	public String toString() {
		return "\nDozenteninformation: [Lehrgebiet: " + this.lehrgebiet + "] \n [Vorname: " + this.vorname
				+ ", Nachname: " + this.nachname + ",\n Straﬂenname: " + this.strassenname + " Hausnummer: "
				+ this.hausnummer + ",\n Postleitzahl: " + this.postleitzahl + " Ort: " + this.ort + ",\n Gehalt: "
				+ this.gehalt + "Ä ]";
	}

}
