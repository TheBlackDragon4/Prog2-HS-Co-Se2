package exceptions;

public class TrainExceptions {

	public static void main(String[] args) {
		int[] zahlenArray = null;
		
		try {
			int anzZahlen = Integer.parseInt(args[0]);
			zahlenArray = castArgs(anzZahlen, args);
		} catch (Exception e) {
			System.out.println(e);
		}
				
		try {
			doCalc(zahlenArray);
		} catch (IsNegativeException e) {
			e.printStackTrace();
		}
	}

	// Extrahiert aus den Übergebenen Argumenten die Integerwerte in ein int-Array
	public static int[] castArgs(int anz, String[] args) throws NumberFormatException {
		int[] zahlenArray = new int[anz];
		for (int count = 0; count < anz; count++)
			zahlenArray[count] = Integer.parseInt(args[count + 1]);
		return zahlenArray;
	}

	public static void doCalc(int[] zahlen) throws IsNegativeException{
		System.out.println(doSum(zahlen)); // Zahlen addieren
		System.out.println(doSub(zahlen)); // Zahlen voneinader subtrahieren
		System.out.println(doMul(zahlen)); // Zahlen multiplizieren
		System.out.println(doDiv(zahlen)); // Zahlen dividieren (Ganzzahldivision)
	}

	// Funktion addiert alle Zahlen
	public static int doSum(int[] zahlen) {
		int summe = 0;
		for (int count = 0; count < zahlen.length; count++)
			summe += zahlen[count];
		return summe;
	}

	// Funktion subtrahiert alle Zahlen
	public static int doSub(int[] zahlen) throws IsNegativeException {
		int summe = 0;
		for (int count = 0; count < zahlen.length; count++)
			summe -= zahlen[count];
		// Bei Subtraktion keine negativen Ergebnisse erlaubt
		if (summe < 0)
			throw new IsNegativeException("Bei der Subtraktion darf das Ergebnis nicht negativ werden");
		return summe;
	}

	// Funktion multipliziert alle Zahlen
	public static int doMul(int[] zahlen) {
		int produkt = zahlen[0];
		for (int count = 1; count < zahlen.length; count++)
			produkt *= zahlen[count];
		return produkt;
	}

	// Funktion fÃ¼hrt Ganzzahldivision aller Zahlen durch
	public static int doDiv(int[] zahlen) {
		int ganzZahlDivErg = zahlen[0];
		for (int count = 1; count < zahlen.length; count++)
			ganzZahlDivErg /= zahlen[count];
		return ganzZahlDivErg;
	}
}

// Eigene Exeption
class IsNegativeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IsNegativeException() {
		super();
	}

	public IsNegativeException(String msg) {
		super(msg);
	}

}
