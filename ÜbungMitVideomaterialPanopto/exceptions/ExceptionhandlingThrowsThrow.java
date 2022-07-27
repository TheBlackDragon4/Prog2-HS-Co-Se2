package exceptions;

import java.util.Scanner;

public class ExceptionhandlingThrowsThrow {

	public static void main(String[] args) {

		try { // Eigene Exception wurde in enterInput() geworfen und abgefangen
			enterInput();
		} catch (IllegalArgumentException e) {
			System.out.println("Exception abgefangen");
		}

		System.out.println("Fertig!");

	}

	public static void enterInput() throws IllegalArgumentException { // Exceptionname muss entsprechend angegeben
																		// werden
		Scanner sc = new Scanner(System.in);

		System.out.println("Geben Sie bitte eine positive Zahl ein: ");
		int number = sc.nextInt();

		if (number < 0)
			throw new IllegalArgumentException(); // negative Zahlen sollen nicht erlaubt sein

		System.out.println("Zahl " + number + " wurde eingegeben");

		sc.close();

	}

}
