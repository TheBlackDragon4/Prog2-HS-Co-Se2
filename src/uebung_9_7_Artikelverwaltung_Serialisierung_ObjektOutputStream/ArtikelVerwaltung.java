package uebung_9_7_Artikelverwaltung_Serialisierung_ObjektOutputStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.Writer;
import java.util.LinkedList;

public class ArtikelVerwaltung {

	// Deklarierung eine LinkedList
	LinkedList<Artikel> artikell;

	public ArtikelVerwaltung(Artikel[] artikel) {
		artikell = new LinkedList<Artikel>(); // Muss erst eine Liste initialisieren
		for (Artikel a : artikel) { // Druchlauf des mitgegeben Arrays
			this.artikell.add(a); // Fügt die Artikelinhalte von artikel in artikell hinzu
		}
	}

	// Schreibt neue Werte in die Datei mit dem Namen filename
	public void write(String filename) {
		// Erstellung eines Writers - Schreibers

		try (FileOutputStream fo = new FileOutputStream(filename);
				ObjectOutputStream oos = new ObjectOutputStream(fo);) {

			oos.writeInt(artikell.size()); // Schreibt in Datei die Anzahl der Objekte

			for (Artikel artikel : artikell) {
				oos.writeObject(artikel);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Liest neue Werte aus der Datei mit dem Namen filename aus
	public void read(String filename) {
		artikell.clear();
		// erstellen eines neuen BufferedReader Objektes

		// Liest aus einer angegeben Datei die in dieser befindlichen Werte aus
		try (FileInputStream fis = new FileInputStream(filename); ObjectInputStream ois = new ObjectInputStream(fis);) {

//			ois.readObject();

			int count = ois.readInt(); // Liest ersten Wert aus somit int

//			for (int i = 0; i < count; i++) {
			for (; count > 0; count--) {
				artikell.add((Artikel) ois.readObject());
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Artikel a : artikell) {
			sb.append(a + ",\n");
		}
		return sb.toString();
	}

}
