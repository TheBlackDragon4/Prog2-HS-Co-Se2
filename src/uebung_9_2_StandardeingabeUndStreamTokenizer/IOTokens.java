package uebung_9_2_StandardeingabeUndStreamTokenizer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

public class IOTokens {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		st.eolIsSignificant(true); // false würde zeigen das das Ende der Zeile mit einem Leerzeichen enden würde
									// -> In diesem Fall nicht korrekt

		System.out.println("Bitte Satz eingeben: ");
		// https://docs.oracle.com/javase/7/docs/api/java/io/StreamTokenizer.html

		try {
			while (st.nextToken() != StreamTokenizer.TT_EOF) { // *.TT_EOF steht für End of Stream

				// Ist das nächste Wort ein Wort:
				if (st.ttype == StreamTokenizer.TT_WORD) {
					System.out.println("Wort: " + st.sval); // sval Gibt den Wert des String Tokens bei Nutzung von
															// *.TT_WORD zurück
				} else if (st.ttype == StreamTokenizer.TT_NUMBER) {
					System.out.println("Nummer: " + st.nval); // nval Gibt den Zahlenwert bei Nutzung von *.TT_NUMBER
				} else if (st.ttype == StreamTokenizer.TT_EOL) { // *.EOL steht für End of Line
//					System.out.println("Ende der Zeile"); // Ausgabe das wir am Ende der Zeile sind
				} else {
					System.out.println("Zeichen: " + (char) st.ttype); // Ausgabe des Zeichens als char und Ausgabe
																		// dessen auf Konsole
				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Zerlegung eines InputStreams in 1 2 3 Token, dies geht einfach !

	}

}
