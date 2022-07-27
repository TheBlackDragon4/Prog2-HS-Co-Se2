package uebung_6_2_Lagerverwaltung;

public class Jeans extends Kleidungsstueck {

	protected int schrittlaenge;

	public Jeans(int groesse, Farbe f, String bezeichnung, int schrittlaenge) {
		super(groesse, f, bezeichnung);
		this.schrittlaenge = schrittlaenge;
	}

	public String artikelNummer() {
		return "567407" + super.getGroesse();
	}

	public String toString() {
		return super.toString() + " " + schrittlaenge;
	}

}
