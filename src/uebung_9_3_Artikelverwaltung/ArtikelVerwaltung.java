package uebung_9_3_Artikelverwaltung;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.Writer;
import java.util.LinkedList;

import uebung_9_3_Artikelverwaltung.Kleidungsstueck.Farbe;

public class ArtikelVerwaltung {

	// Deklarierung eine LinkedList
	LinkedList<Artikel> artikell;

	public ArtikelVerwaltung(Artikel[] artikel) {
		artikell = new LinkedList<Artikel>(); // Muss erst eine Liste initialisieren
		for (Artikel a : artikel) { // Druchlauf des mitgegeben Arrays
			this.artikell.add(a); // F�gt die Artikelinhalte von artikel in artikell hinzu
		}
	}

	// Schreibt neue Werte in die Datei mit dem Namen filename
	public void write(String filename) {
		// Erstellung eines Writers - Schreibers
		Writer fw = null;

		try {
			// Schreibt in die mitgegebene Datei nachdem sie angelegt wurde
			fw = new BufferedWriter(new FileWriter(filename));
			// Iterieren durch das Artikel Objekt
			for (Artikel artikel : artikell) {
				fw.write(artikel.toString());
				fw.write(",\n");
			}

		} catch (IOException e) {
			System.out.println("Datei Konnte nicht erstellt werden");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					System.out.println("Datei konnte nicht geschlossen werden.");
				}
			}
		}
	}

	// Methode soll nur aus dieser Klasse erreichbar sein und aus keiner anderen
	public Kleidungsstueck.Farbe convertFarbe(String farbeName) {

		return Kleidungsstueck.Farbe.valueOf(farbeName);

//		if (farbeName.equals("BLAU")) {
//			return Farbe.BLAU;
//		}
//		if (farbeName.equals("GRAU")) {
//			return Farbe.GRAU;
//		}
//		if (farbeName.equals("GR�N")) {
//			return Farbe.GR�N;
//		}
//		if (farbeName.equals("ROT")) {
//			return Farbe.ROT;
//		}
//		if (farbeName.equals("SCHWARZ")) {
//			return Farbe.SCHWARZ;
//		}

	}

	// Liest neue Werte aus der Datei mit dem Namen filename aus
	public void read(String filename) {
//		artikell = new LinkedList<Artikel>();
		artikell.clear();
		// erstellen eines neuen BufferedReader Objektes
//		Reader br = null;

		// Variablendeklaration f�r das Auslesen des Files
		String artikelnummer = null;
		int groesse = 0;
		Kleidungsstueck.Farbe f = null;
		String marke = "";
		int schrittlaenge = 0;

		// Liest aus einer angegeben Datei die in dieser befindlichen Werte aus
		try (FileReader fr = new FileReader(filename); 
			 BufferedReader br = new BufferedReader(fr);) {

//				BufferedReader br = new BufferedReader(new FileReader(filename));) {
			
//			br = new BufferedReader(new FileReader(filename));
			StreamTokenizer st = new StreamTokenizer(br);

			// While Schleife wird so lange druchlaufen, bis das Ende des Files erreicht
			// wurde
			while (st.nextToken() != StreamTokenizer.TT_EOF) {
				// Pr�ft ob der aktuell gelesene Wert eine Nummer ist oder nicht
				if (st.ttype == StreamTokenizer.TT_NUMBER) {
					artikelnummer = String.valueOf(st.nval); // nval Gibt den Nummernwert aus
				} else {
					throw new IOException("Falsche Artikelnummer im Dokument");
				}

				st.nextToken(); // Auswahl des n�chsten Tokens in der Zeile
				if (st.ttype == StreamTokenizer.TT_WORD) {
					marke = String.valueOf(st.sval); // sval gibt das Wort aus
				} else {
					throw new IOException("Falsche Bezeichnung ausgelesen");
				}

				st.nextToken(); // Auswahl des n�chsten Tokens in der Zeile
				if (st.ttype == StreamTokenizer.TT_NUMBER) {
					groesse = Integer.valueOf((int) st.nval); // nval gibt hier den besagten Nummernwert f�r die Gr��e
				} else {
					throw new IOException("Falsche Gr��e ausgelesen");
				}

				st.nextToken(); // Auswahl des n�chsten Tokens in der Zeile
				if (st.ttype == StreamTokenizer.TT_WORD) {
					f = convertFarbe(st.sval); // Gibt den Wert den ich als Farbe ausgelesen habe nach dem Aufruf der
												// convertFarbe Methode die entsprechende Farbe aus
				} else {
					throw new IOException("Falsche Farbe ausgelesen");
				}

				st.nextToken(); // Auswahl des n�chsten Tokens in der Zeile
				if (st.ttype == StreamTokenizer.TT_NUMBER) {
					schrittlaenge = (int) st.nval; // Gibt den Ausgelesenen Nummernwert aus
				} else {
					throw new IOException("Falsche Schrittl�nge ausgelesen");
				}

				// Erzeugung eines neuen Kleidungsst�ckobjekt
				Kleidungsstueck kleidung = new Jeans(groesse, f, marke, schrittlaenge);
				artikell.add(kleidung);

				st.nextToken(); // Auswahl des n�chsten Tokens in der Zeile
				// , wird hier ignoriert
				char c = (char) st.ttype;
				if (c != ',' && st.ttype != StreamTokenizer.TT_EOF) {
					throw new IOException("Aktuell falsches Zeilenende");
				}

			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
//		} finally {
//			if (br != null) {
//				try {
//					br.close();
//				} catch (IOException e) {
//					System.out.println("Datei konnte warum auch immer nicht geschlossen werden.");
//				}
//			}
//		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Artikel a : artikell) {
			sb.append(a + ",\n");
		}
		return sb.toString();
	}

}
