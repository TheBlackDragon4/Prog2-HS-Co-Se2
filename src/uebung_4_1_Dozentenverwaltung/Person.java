package uebung_4_1_Dozentenverwaltung;

public abstract class Person {

	// private -> Auf Variablen kann man nur aus Klasse zugreifen
	// protected -> Auf Variablen können in Klasse oder aus Unterklassen zugegriffen
	// werden

	protected String vorname;
	protected String nachname;
	protected String strassenname;
	protected String hausnummer;
	protected String ort;
	protected int postleitzahl;

	public Person(String vorname, String nachname, String strassenname, String hausnummer, String ort,
			int postleitzahl) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.strassenname = strassenname;
		this.hausnummer = hausnummer;
		this.ort = ort;
		this.postleitzahl = postleitzahl;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getStrassenname() {
		return strassenname;
	}

	public void setStrassenname(String strassenname) {
		this.strassenname = strassenname;
	}

	public String getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public int getPostleitzahl() {
		return postleitzahl;
	}

	public void setPostleitzahl(int postleitzahl) {
		this.postleitzahl = postleitzahl;
	}

	public String toString() {
		return "\nPersoneninformation: \n [Vorname: " + this.vorname + ", Nachname: "
				+ this.nachname + ",\n Straßenname: " + this.strassenname + " Hausnummer: " + this.hausnummer
				+ ",\n Postleitzahl: " + this.postleitzahl + " Ort: " + this.ort + "]";
	}

}
