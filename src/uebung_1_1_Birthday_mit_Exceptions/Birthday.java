package uebung_1_1_Birthday_mit_Exceptions;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Locale;

public class Birthday {

	private String theDay;

	public Birthday(String s) throws InvalidBirthdayException {
		checkDay(theDay); // Soll einfach die Methode checkDay aufrufen und überprüfen
		this.theDay = s; // Richtig überprüftes Datum wird in Variable abgespreichert
	}

	public String getTheDay() {
		return theDay;
	}

	public void checkDay(String s) throws InvalidBirthdayException { // Hier wird eine Exception geworfen
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.GERMANY);
		df.setLenient(false); // Andere Schreibweise könnte auch zugelassen werden

		try { // Gutfall
			df.parse(s);
		} catch (ParseException e) { // Fehlerbehandlung
			// e.printStackTrace(); // Ausgabe des Konsolenfehlers
			throw new InvalidBirthdayException("Datum entspricht nicht dem Format!"); // hier steht, was in der zu
																						// werfenden
			// Message stehen muss / soll
		}

	}

}
