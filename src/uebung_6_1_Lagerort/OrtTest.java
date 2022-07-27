package uebung_6_1_Lagerort;

import uebung_6_1_Lagerort.Ort.LagerortIstVollException;

public class OrtTest {

	public static void main(String[] args) {

		Ort<String> einOrt0 = new Ort<String>(0);
		Ort<String> einOrt1 = new Ort<String>(1);
		Ort<Integer> einOrt2 = new Ort<Integer>(2);
		Ort<Double> einOrt3 = new Ort<Double>(3);

		try {
			einOrt0.hinzufuegen("OO-Softwareentwicklung");
		} catch (LagerortIstVollException e) {
			System.out.println(e.getMessage());
		}
		String s = einOrt0.getEingelagertesElement(); // s = ″OO-Softwareentwicklung″
		System.out.println(einOrt0); // ″1 OO-Softwareentwicklung″
		s = einOrt0.entnehmen();
		System.out.println(einOrt0); // ″1 null″
		// System.out.println(einOrt.toString());
		// System.out.println(s);

		try {
			einOrt1.hinzufuegen("PC Fujitsu LA 3740");
		} catch (LagerortIstVollException e) {
			System.out.println(e.getMessage());
		}
		s = einOrt1.getEingelagertesElement();
		System.out.println(einOrt1);
		s = einOrt1.entnehmen();
		System.out.println(einOrt1);

		try {
			einOrt2.hinzufuegen(1234566789);
		} catch (LagerortIstVollException e) {
			System.out.println(e.getMessage());
		}
		Integer si = einOrt2.getEingelagertesElement();
		System.out.println(einOrt2);
		einOrt2.entnehmen();
		System.out.println(einOrt2);

		try {
			einOrt3.hinzufuegen(12345.6789);
		} catch (LagerortIstVollException e) {
			System.out.println(e.getMessage());
		}
		Double sd = einOrt3.getEingelagertesElement();
		System.out.println(einOrt3);
		einOrt3.entnehmen();
		System.out.println(einOrt3);

		System.out.println("\n");

		// Aufgabe mit Arrayaufruf
		String[] gegenstände = { "PC Fujitsu LA 3740", "Miele Waschmaschine ML300", "Siemens HL 500", "OSRAM MM 100",
				"Bosch" };
		int count = 0;
		for (int i = 0; i < gegenstände.length; i++) {
			count++;
		}

		// Generierung eines OrtsArrays
		Ort<String>[] einOrtArray = new Ort[count];

		for (int i = 0; i < einOrtArray.length; i++) {
			// Erstellt Objekte vom Typ ort mit Index i
			Ort<String> ort = new Ort<String>(i);

			try {
				ort.hinzufuegen(gegenstände[i]);
			} catch (LagerortIstVollException e) {
				System.out.println(e.getMessage());
			}
			einOrtArray[i] = ort;
		}

		System.out.println("Liste der Gegenstände: ");
		for (Ort<String> oS : einOrtArray) {
			System.out.println(oS.toString());
		}

	}

}
