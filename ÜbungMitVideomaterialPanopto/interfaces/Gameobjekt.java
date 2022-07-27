package interfaces;

public interface Gameobjekt {
	// Ein Interface wird als Schnittstelle zwischen Methoden bezeichnet

	public void game(String game);

	public String Spielstand(String level); // Wenn hier etwas verändert wird muss in jeder implements Klasse neue
											// Änderungen vorgenommen werden

}
