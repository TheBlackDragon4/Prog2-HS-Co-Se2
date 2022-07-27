package uebung_1_3_OverUnderflow;

public class Zaehler {

	private int einer;
	private int zehner;

	public Zaehler() {
		this.einer = 0;
		this.zehner = 0;
	}

	public Zaehler(int einer, int zehner) {
		this.einer = einer;
		this.zehner = zehner;
	}

	public void erhoeheUmEins() throws EinerUeberlauf {// Kann eine Exception werfen muss aber nicht
		einer++;
		if (einer > 9) {
			throw new EinerUeberlauf(); // Hier wird eine neue Exception geworfen
		}

	}

	public void erhoeheUmZehn() throws Ueberlauf { // Kann eine Exception werfen muss aber nicht
		zehner++;
		if (zehner > 9) {
			throw new Ueberlauf(1, "Fehler aufgetreten: Überlauf! 99 wurde überschritten "); // Hier wird eine neue
																								// Exception geworfen
		}

	}

	public int getEiner() {
		return einer;
	}

	public int getZehner() {
		return zehner;
	}

	public void zaehlen() throws Ueberlauf {

		try { // Gutfall
			erhoeheUmEins(); // Aufruf der entsprechend angegeben Methode
		} catch (EinerUeberlauf e) { // Fehlerfall
			einer = 0; // einer werden hier wieder komplett auf 0 gesetzt

			erhoeheUmZehn(); // Aufruf der entsprechenden Methode

			/*
			 * try { // Gutfall erhoeheUmZehn(); // Aufruf der entsprechenden Methode }
			 * catch (Ueberlauf e1) { // Fehlerfall throw new
			 * Ueberlauf("Fehler aufgetreten: Überlauf! 99 wurde erreicht"); }
			 */
			
		}

	}

}
