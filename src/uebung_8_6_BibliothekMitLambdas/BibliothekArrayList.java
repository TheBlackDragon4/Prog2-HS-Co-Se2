package uebung_8_6_BibliothekMitLambdas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.Renderer;

public class BibliothekArrayList {

//	private List<Buch> buecher = new ArrayList<Buch>();
	private Collection<Buch> buecher;

	public BibliothekArrayList() {
		this.buecher = new ArrayList<Buch>();
	}

	// Hinzufügen eines Buches zur Bibliothek
	public boolean einfuegen(Buch buch) {
		return this.buecher.add(buch);
//		return true;
	}

	public Collection<Buch> sucheNachAuthor(String author) {
		// ich wird die gesamte Bücherliste durchstöbert und das Buch mit dem
		// entsprechenden Author ausgegeben
		// Anordnung als Stream -> mit Lambdas -> (Syntax : (parameterListe) ->
		// anweisungen
		return buecher.stream().filter(b -> b.getAuthor().equals(author)).collect(Collectors.toList());
	}

	public Buch sucheNachISBN(String isbn) {
		// Hier wird von einer Bücherliste auf die einzelnen Bücher reduziert
		// Reduce wird verwendet wenn ausschließlich ein Objekt zurückgegeben werden
		// soll
		return buecher.stream().filter(b -> b.getISBN().equals(isbn)).reduce(null, (b1, b2) -> b2);
	}

	public Map<String, List<Buch>> bestandNachAuthorAuflisten() {
		// Hier wird die Liste durchlaufen und eine Collection nach Autoren sortiert
		// ausgegeben
		return buecher.stream().collect(Collectors.groupingBy(Buch::getAuthor));
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (Buch b : buecher) {
			sb.append(b);
		}

		return "[" + sb.toString() + "\n]";

	}

}
