package exceptions;

import java.util.Scanner;

public class ExceptionhandlingTryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Geben Sie eine Zahl ein:  ");
		int number;

		try { // Gut Fall -> korrekte Ausführung
			number = sc.nextInt();
			System.out.println("Zahl " + number + " wurde eingegeben");

		} catch (Exception e) { // Bearbeitung des Fehlerfalls
			e.printStackTrace();
			System.out.println("Hier wird eine Ganzzahl erwartet");

		} finally { // finally wird immer aufgerufen egal was passiert
			// kann verwendet werden um bsw. Scanner oder andere Ressourcen zu schließen
			sc.close();
		}

	}

}
