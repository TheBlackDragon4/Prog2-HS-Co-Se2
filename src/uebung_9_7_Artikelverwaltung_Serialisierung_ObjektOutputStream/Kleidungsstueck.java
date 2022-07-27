package uebung_9_7_Artikelverwaltung_Serialisierung_ObjektOutputStream;

import java.io.Serializable;

public abstract class Kleidungsstueck implements Artikel, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6264690067646603934L;
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
