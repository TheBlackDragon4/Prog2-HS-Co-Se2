package uebung_6_2_Lagerverwaltung;

public abstract class Kleidungsstueck implements Artikel {

//	public enum Farbe {
//		SCHWARZ, BLAU
//	}

	private int groesse;
	private String bezeichnung;
	private String artNr;
	private final Farbe farbe;

	public Kleidungsstueck(int groesse, Farbe f, String bezeichnung) {
		this.groesse = groesse;
		this.bezeichnung = bezeichnung;
		this.farbe = f;
		this.artNr = artikelNummer();
	}

//	public abstract String artikelNummer();

	public String bezeichnung() {
		return bezeichnung;
	}

	public int getGroesse() {
		return groesse;
	}

	public Farbe getFarbe() {
		return farbe;
	}

	public String toString() {
		return artNr + " " + farbe + " " + bezeichnung;
	}

}
