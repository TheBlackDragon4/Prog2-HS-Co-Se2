package interfaces;

public class PKW implements Fahrzeug, Gameobjekt {
	// implements - bedeutet, dass hier alles implementiert werden muss was in
	// Fahrzeug oder einer aderen Methode angegeben wird
	// Diese klasse muss die einzelnen Methoden implementieren
	// Inhalt der Methoden müssen implementiert werden -> Egal was da gemacht wird

	public void fahren() {
		System.out.println("Auto fährt");
	}

	public void beschleunigen(int leistung) {

		System.out.println("Auto wird mit " + leistung + "beschleunigt");

	}

	public void game(String game) {
		System.out.println("Spielename: " + game);
	}

	public String Spielstand(String level) {
		return "Level: " + level;
	}

	
}
