package wrapper;

public class WrapperBeispiele {

	public static void main(String[] args) {

		Integer int1 = Integer.valueOf("30"); // Konvertierung von String "30" in eine Wrapper-Klasse Integer somit in
												// Datentyp int
		Integer int2 = new Integer(30); // Neue Wrapper-klasse wird hier erstellt
		Integer int3 = 42; // Wert wird einfach nur zugewießen

		// Werte können nachträglich nicht mehr veränder werden

		System.out.println(int1);
		System.out.println(int2);
		System.out.println(int3);

		// Konvertierung eines int / double wiederum in ein String
		System.out.println("\nKonvertierung eines int/doubles in String");
		String intToString = Integer.toString(int3);
		String doubleToString = Double.toString(4.5);

		System.out.println(doubleToString.toString());
		System.out.println(intToString);
		System.out.println(doubleToString);

		Double d = 3.25; // Wrapper - Klasse notwendig
		int i = d.intValue(); // Umwandlung von Double zu einem Int
		System.out.println("\nUmwandlung von double zu int: " + i);

		// oder anders herum:
		Integer i1 = 59; // Wrapper - Klasse notwendig
		double d1 = i1.doubleValue(); // Umwandlung von int in ein entsprechendes Double
		System.out.println("\nUmwandlung von int zu double: " + d1);

	}

}
