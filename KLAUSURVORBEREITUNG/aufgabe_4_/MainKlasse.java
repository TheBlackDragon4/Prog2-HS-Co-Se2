package aufgabe_4_;

public class MainKlasse {

	public static void main(String[] args) {

		Writer w1; // true
		Drucker d1; // true
		PipedWriter p1; // true
//		Writer w2 = new Writer(); // false -> Keine Implementierung der Abstract Methode
		DateiWriter da = new DateiWriter(); // true
//		DruckerWriter d2 = new Drucker(); // false -> Keine Implementierung des Inferface -> Nur DruckerWriter möglich
		PipedWriter p2 = new PipedWriter(); // true
//		w2 = da; // true -> DateiWriter da ist ein Writer
		w1 = (Writer) da; // true -> DateiWriter da ist ein Writer
		p1 = p2; // true -> p1 = PipedWriter , p2 = PipedWriter
		p2 = (PipedWriter) w1; // true -> PipedWriter ist ein Writer
//		d2 = new DruckerWriter(); // Syntaktisch true / Compiler false
//		d1 = d2; // true -> Beides sind DruckerWriter -> d1 implementiert Drucker
//		p2 = d2; // false -> PripedWriter ist kein DruckerWriter
//		w1.write(“Testausgabe in Datei“); // false -> keine implementierung somit kein Zugriff
//		d2.druckenAbbrechen(); // true -> d2 ist ein DruckerWriter somit Zugriff auf Methode möglich

		Integer i = Integer.valueOf(5);
		String test;
		test = i.toString();
		
		System.out.println(test);
		
		
	}

}
