package uebung_1_1_Birthday_mit_Exceptions;

public class InvalidBirthdayException extends Exception {
	// extends Exceptions ist notwendig, sonst kann man keine Exception aus der
	// Klasse machen
	// extends bedeutet erbt von "Exception"

	String message;

	// Konstruktor der Exception -> Default Konstruktor
	public InvalidBirthdayException() {
		super(); // -> Aufruf des SuperKonstruktors der darüberliegenden vererbten Klasse wird
					// aufgerufen
	}

	// Konstruktor der Exception
	public InvalidBirthdayException(String s) {
		this.message = s;
	}

	public String getMessage() {
		return message;
	}

}
