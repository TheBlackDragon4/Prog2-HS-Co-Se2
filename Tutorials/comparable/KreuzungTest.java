package comparable;

import java.util.Scanner;

public class KreuzungTest {
	/**
	 * Einfacher Bubblesort für integer
	 */

	public static void sortiere(int[] kArray) {

		for (int i = 0; i < kArray.length; i++) {
			for (int j = 0; j < kArray.length - i - 1; j++)
				if (kArray[j] > kArray[j+1]) {
					int swap = kArray[j+1];
					kArray[j + 1] = kArray[j];
					kArray[j] = swap;
				}
		}
	}
	
	
	
	
	/**
	 * Einfacher nicht optimierter Bubblesort
	 */
	public static void sortiere(Kreuzung[] kArray) {

		for (int i = 0; i < kArray.length; i++) {
			for (int j = 0; j < kArray.length - i - 1; j++)
				if (kArray[j].compareTo(kArray[j + 1]) > 0) {
					Kreuzung swap = kArray[j + 1];
					kArray[j + 1] = kArray[j];
					kArray[j] = swap;
				}
		}
	}

	public static void main(String[] args) {

		System.out.println("Anzahl der Kreuzungen eingeben");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n > 0) {
			Kreuzung[] kArr = new Kreuzung[n];

			// Zulässige Ampelanzahl für eine Kreuzung
			int[] typ = { 2, 3, 4, 5, 6 };

			// Zufallsmässige Erzeugung
			for (int i = 0; i < n; i++) {
				int zufallsIndex = (int) (Math.random() * 4);
				kArr[i] = new Kreuzung(typ[zufallsIndex]);
			}

			// Unsortierte Ausgabe 
			for (Kreuzung k : kArr) 
				System.out.print(" " + k);
			

			System.out.println("\nSortiert");

			// Sortiere Array
			sortiere(kArr);

			// Sortierte Ausgabe
			for (Kreuzung k : kArr) 
				System.out.print(" " + k);

		}
	}

}
