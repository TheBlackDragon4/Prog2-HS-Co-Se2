package uebung_9_3_Artikelverwaltung;

public abstract class Kleidungsstueck implements Artikel {
	enum Farbe {
		SCHWARZ, GRUEN, ROT, BLAU, GRAU
	};
	protected final int groesse;
	protected final Farbe farbe;
	protected final String bezeichnung;
	protected String artNr;
	

	protected Kleidungsstueck(int groesse, Farbe f, String bezeichnung) {
		this.farbe = f;
		this.groesse = groesse;
		this.bezeichnung = bezeichnung;
	}
	
	public String bezeichnung() {
		return this.bezeichnung;
	}

	public int getGroesse() {
		return groesse;
	}

	public Farbe getFarbe() {
		return farbe;
	}
	
	public String toString() {
		return "" + bezeichnung + " " + groesse + " " + farbe;
		
	}
	
	
	 
	
	

}
