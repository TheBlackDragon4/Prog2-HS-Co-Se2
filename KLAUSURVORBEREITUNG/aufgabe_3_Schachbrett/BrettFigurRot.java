package aufgabe_3_Schachbrett;

import aufgabe_3_Schachbrett.Brett.Farbe;

public class BrettFigurRot implements BrettFigur {

	public int getZugLogik() {
		return -1; // gegengesetzte Richtung
	}

	public Farbe getFarbe() {
		return Farbe.ROT;
	}
	
	public String toString() {
		return "R";
		
	}

}
