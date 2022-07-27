package uebung_4_1_Dozentenverwaltung;

public class DozentenverwaltungTest {

	public static void main(String[] args) {

		Person[] personArray = new Person[4]; // Hier wird ein PersonenArray erstellt

		personArray[0] = new Student("Peter", "Müller", "Hauptstrasse", "4a", "Coburg", 96450, 455555, 1000);
		personArray[1] = new Dozent("Hans", "Meyer", "Jenaerstrasse", "21", "Coburg", 96450, "Betriebssysteme", 1000);
		personArray[2] = new Student("Tom", "Hansen", "Hauptstrasse", "4a", "Coburg", 96450, 455056, 1000);
		personArray[3] = new Dozent("Manuel", "Dietmar", "Jenaerstrasse", "21", "Coburg", 96450, "IT-Sicherheit", 1000);
//		personArray[4] = new Person("Max", "Mustermann", "Musterstrasse", "0a", "Musterhausen", 22222);
		// Eigentlich wollen wir hier nur Dozenten und Studenten haben und keine
		// normalen Personen
		// Abstrakte Klasse ist Person !!!:
		// Wollen wir Objekte in der Klasse erstellen JA oder NEIN
		// Wenn dies nicht der Fall sein sollte, dann kann ich die Klasse Abstract
		// machen.
		// Das Heist, hier werden nur die Variablen gestellt aber Zusatzvariablen in den
		// Unterklassen zusätzlich Initialisiert
		// Klasse Person ist in diesem Fall nur dazu da um Werte für die Unterklassen
		// Student und Dozent zur Verfügung zu stellen

		for (Person p : personArray) {
			System.out.println(p);
		}

	}

}
