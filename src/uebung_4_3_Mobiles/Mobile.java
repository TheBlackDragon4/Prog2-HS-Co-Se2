package uebung_4_3_Mobiles;

public interface Mobile {

	// bei Interface ist wichtig zu wissen, dass hier die Methoden von einer anderen
	// oder mehreren anderen Klassen implementiert werden können
	// Intefaces bezeichnet man als Schnittstelle, wo alle notwendigen Methoden für
	// die darunterliegenden Objekte vorgefertigt werden
	// die Implementierung findet in den darunterleigenden Klassen statt

	public double weight(); // Wird in Star und Wire implementiert

	public void balance(); // Wird in Star und Wire implementiert

	public String toString(); // Wird in Star und Wire implementiert

}
