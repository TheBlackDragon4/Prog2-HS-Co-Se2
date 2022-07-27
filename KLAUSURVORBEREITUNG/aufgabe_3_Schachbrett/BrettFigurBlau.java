package aufgabe_3_Schachbrett;

import aufgabe_3_Schachbrett.Brett.Farbe;

public class BrettFigurBlau implements BrettFigur {

	public int getZugLogik() {
		return +2;
	}

	public Farbe getFarbe() {
		return Farbe.ROT;
	}

	public String toString() {
		return "B";
	}

}
