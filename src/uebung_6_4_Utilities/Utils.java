package uebung_6_4_Utilities;

public class Utils<E> {

	// Methode für Ausgabe der Arrayinhalte beliebigen Typs auf Konsole
	public static <E> void print(E[] a) {

		System.out.print("[");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]\n");

	}

	// Methode für Sortieren von Arrays von beliebigen Typs
	// Erbt von Comparable daher "extends Comparable"
	public static <E extends Comparable<E>> void sortiere(E[] a) {

		System.out.print("[");

		// array sorting
		// loop to control number of passes
		for (int pass = 0; pass < a.length; pass++) {

			// loop to control number of comparisons
			for (int element = 0; element < a.length - 1 - pass; element++) {

				// compare side-by-side elements and swap them if
				// first element is greater than second element
				if (a[element].compareTo(a[element + 1]) > 0) { // vergleicht aktuell ausgewähltes und nachfolgendes
																// Element

					E temp; // temporary holding area for swap

					temp = a[element];
					a[element] = a[element + 1];
					a[element + 1] = temp;
				}

			} // end loop to control comparisons

		} // end loop to control passes

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]\n");

	}

	// Methode - Am weitesten links stehende Element wird zurückgeliefert das
	// verschieden von null ist
	public static <E> E noNull(E... a) {
		
		for (E element : a) {
			if(element != null) {
				return element; // Rückgabe des ersten Elements das nicht NULL lautet
			}
		}
		return null; // Rückgabe wenn alle Elemente null
	}

}
