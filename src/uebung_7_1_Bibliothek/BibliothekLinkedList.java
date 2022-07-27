package uebung_7_1_Bibliothek;

import java.util.*;

public class BibliothekLinkedList {

	private LinkedList<Buch> buecher;

	public BibliothekLinkedList() {
		this.buecher = new LinkedList<Buch>();
	}

	// Hinzufügen eines Buches zur Bibliothek
	public boolean einfuegen(Buch buch) {
		return this.buecher.add(buch);
//		return true;
	}

	public List<Buch> sucheNachAuthor(String author) {
		List<Buch> buch = new LinkedList<Buch>();

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
		List<Buch> buch = new LinkedList<Buch>(this.buecher);

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
