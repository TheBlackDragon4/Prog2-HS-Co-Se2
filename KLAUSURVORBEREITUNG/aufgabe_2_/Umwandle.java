package aufgabe_2_;

// Import muss in Klausur nicht angegeben werden
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Umwandle {

	public static void main(String[] args) {
		// In Klausuraufgabe verpflichtend hinzuschreiben
		if (args.length != 2) {
			// Ausgabe welche Informationen und Mitgaben werden erwartet
			System.out.println("use Umwandle <input filename> <outputfilename>");
			System.exit(1);
		}
		// Möglichkeit 1
		// Charakter Stream
//		BufferedReader br = null; // Chrakter - Stream zum Lesen
//		BufferedWriter bw = null; // Chrakter - Stream zum Schreiben

		try (
				// args liest den mitgegebenen Wert aus
				// Möglichkeit 2
				BufferedReader br = new BufferedReader(new FileReader(args[0]));
				BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));) {
			// Möglichkeit 1
//		try {	
//			br = new BufferedReader(new FileReader(args[0]));
//			bw = new BufferedWriter(new FileWriter(args[1]));

			// Liest jeden Wert aus Datei aus
			// -1 bedeutet -> Wird zurückgeliefert wenn wir am Ende der Zeile angekommen
			// sind

			// Nutzung von for - Schleife
//			for (int c; (c = br.read()) != -1;) {

			// Nutzung mit While - Schleife
			int c;
			while ((c = br.read()) != -1) {
				char cc = (char) c; // Konvertiereung weil wir hier Charakter haben

				if (cc == 'X') { // Ersetzt das aktuelle Wort wenn X mit einem ' '
					bw.write(' ');
				} else if (cc == ' ') { // Ersetzt das aktuelle Wort wenn ' ' mit einem X
					bw.write('X');
				} else { // Wenn kein ' ' und kein X vorhanden ist wird das Wort normal ausgegeben
					bw.write(cc);
				}
			}

		} catch (FileNotFoundException e) {
			// out -> richtet sich an Aufrufer wenn Aufrufer eine Information bekommt oder
			// er einen Fehler macht
			// err -> interner Fehler -> Aktuell keine Anwendung
			// In Klausur System.out.println nutzen
			System.out.println("Konnte die Datei leider nicht finden.");
			// System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} 
//		finally {
//			// BufferedWriter und BufferedReader müssen geschlossen werden -> Daher in
//			// finally
//			try {
//				br.close();
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			try {
//				bw.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

	}

}
