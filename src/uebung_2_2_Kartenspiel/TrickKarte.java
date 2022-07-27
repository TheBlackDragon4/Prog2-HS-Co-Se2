package uebung_2_2_Kartenspiel;

public class TrickKarte extends Karte {

	protected boolean wertUnsichtbar;

	public TrickKarte(Farbe f, Wert w, boolean b) {
		super(f, w);
		this.wertUnsichtbar = b;
	}

	public boolean equals(Object o) {

		if (o == null) {
			return false;
		}

		// Ist nicht zwingend notwendig
		if (this == o) {
			return true;
		}

		if (getClass() != o.getClass()) {
			return false;
		}

		// Nimmt ihr die Werte der Oberklasse -> Daher das "super"
		if (!super.equals(o)) {
			return false;
		}

		// Objektkast
		TrickKarte k = (TrickKarte) o;

		if (this.wertUnsichtbar != k.wertUnsichtbar) {
			return false;
		}

		return true;

	}

}
