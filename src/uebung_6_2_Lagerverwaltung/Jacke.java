package uebung_6_2_Lagerverwaltung;

public class Jacke extends Kleidungsstueck {

	protected int wassersaeule;

	public Jacke(int groesse, Farbe f, String bezeichnung, int wassersaeule) {
		super(groesse, f, bezeichnung);
		this.wassersaeule = wassersaeule;
	}

	public String artikelNummer() {
		return "777777" + super.getGroesse();
	}

	public String toString() {
		return super.toString() + " " + wassersaeule;
	}

}