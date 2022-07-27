package uebung_7_1_Bibliothek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BibliothekArrayList {

//	private List<Buch> buecher = new ArrayList<Buch>();
	private List<Buch> buecher;

	public BibliothekArrayList() {
		this.buecher = new ArrayList<Buch>();
	}

	// Hinzufügen eines Buches zur Bibliothek
	public boolean einfuegen(Buch buch) {
		return this.buecher.add(buch);
//		return true;
	}

	public List<Buch> sucheNachAuthor(String author) {
		List<Buch> buch = new ArrayList<Buch>();

		for (Buch b : buecher) {
			if (b.getAuthor().equals(author)) {
				buch.add(b); // Suche nach den Büchern mit den gleichen Authoren
			}
		}
		return buch;
	}

	public Buch sucheNachISBN(String isbn) {

		for (Buch b : buecher) {
			// Prüfung auf Gleichheit der ISBNs
			if (b.getISBN().equals(isbn)) {
				return b;
			}
		}
		return null;
	}

	public List<Buch> bestandSortierenNach(Comparator<Buch> comp) {
		List<Buch> buch = new ArrayList<Buch>(this.buecher);

		// Sortiermöglichkeit durch´+ Vorgegebene Methode "*.sort" in Klasse Collections
		Collections.sort(buch, comp);

		return buch;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (Buch b : buecher) {
			sb.append(b);
		}

		return "[" + sb.toString() + "\n]";

	}

}
