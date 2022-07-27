package uebung_5_2_Woertersammlung;

import java.util.StringTokenizer;
import java.util.Vector;

public class WordColl {

	// Ein Wort wird als Token verstanden
	private int wordCount;
	private Vector<Word> words; // <Word> muss eine eigene Klasse sein und auch entsprechend implementiert sein

	// Hier handelt es sich um eine "innere Klasse"
	class Word {
		private String s; // String s f�r die einzelnen W�rter
		private int count;

		public Word(String s) {
			this.s = s;
			this.count = 1; // Startwert ist gerade 1
		}

//		public String toString() {
//			return "" + s + " " + count;
//		}

	}

	// Test f�r Zugriff auf Innere Klasse
//	Word w = new Word("Test");
//	private int test = w.count;
//	private String resultString = w.toString();
//	public static void main(String[] args) {
//		String[] s = {"Test"};
//		WordColl wc = new WordColl(s);
//		System.out.println(wc.resultString);
//		System.out.println(wc.test);
//		System.out.println(wc.toString());
//	}

	public WordColl(String[] sentences) {
		words = new Vector<Word>(sentences.length); // anlegen eines neuen Vectors mit der Anzahl der Satzl�nge

		append(sentences); // Ruft hier die Methode "append" mit dem Array sentences auf
	}

	// Liefert die Anzahl der W�rtersamlung zur�ck
	public int size() {
		return wordCount;
	}

	// Soll angeben, wie oft ein gewisser String in einer W�rtersammlung vorkommt
	public int count(String s) {
		// hier wird die Methode included aufgerufen mit dem �bergabestring "s"
		Word word = included(s); // �berpr�ft on s in word enthalten ist.

		if (word != null) {
			return word.count; // Gibt die Anzahl zur�ck, nachdem wir gez�hlt haben
		} else {
			return 0;
		}

	}

	// H�ngt W�rter an bestehende W�rtersammlung an
	// append = Anh�ngen
	public void append(String[] sentences) {
		for (String s : sentences) {
			StringTokenizer st = new StringTokenizer(s); // Zerlegen von String
			while (st.hasMoreTokens()) {
				insert(st.nextToken()); // Greift hier auf die "insert" Methode zu
			}
		}
	}

	// Dient daf�r, um in den String ein Wort einbauen zu k�nnen
	private void insert(String nextToken) {
		Word word = included(nextToken);

		if (word != null) {
			word.count++; // Greift auf Variable in inneren Klasse "Word" zu
		} else {
			word = new Word(nextToken);
			words.add(word); // mit *.add kann man Strings in den Vector einpflegen
		}

		wordCount++;
	}

	// �berpr�ft, ob hier entsprechende Elemente schon im Satz enthalten sind oder
	// nicht
	private Word included(String s) {
		for (Word w : words) {
			if (w.s.equals(s)) {
				return w;
			}
		}
		return null;
	}

	// Hier wird das Wort angegeben, das am h�ufigsten in der Wortsammlung vorkommt
	public String top() {
		Word wordTop = words.elementAt(0); // Pr�ft nach, ob �berhaupt ein Wort an Position 0 vorhanden ist oder eben
											// nicht
		if (wordTop != null) {
			for (Word w : words) {
				if (wordTop.count < w.count) {
					wordTop = w;
				} else {
					return wordTop.s;
				}
			}
		}

		return null;
	}

	public String toString() {
		String result = "";

		// %-20s Schreibt Word hin und l�sst 20 Zeichen danach Platz
		// %2s\n l�sst 2 Zeichen Platz und schreibt dann das Wort Count hin
		result += String.format("%-20s | %2s\n", "Word", "count");
		result += "------------------------------------------\n";

		// Geht durch den Vector Word und gibt jeden Wert nach folgender Definition aus
		for (Word w : words) {
			// %-20s gibt erstes Wort mit w.s aus und macht im Anschluss 20 Zeichen Platz
			// %2d\n gibt die Anzahl mit w.count aus und macht davor 2 Zeichen Platz. Danach
			// findet ein Zeilenumbruch statt
			result += String.format("%-20s | %2d\n", w.s, w.count);
		}

		result += "------------------------------------------\n";
		result += "Total: " + wordCount;

		return result;
	}

}
