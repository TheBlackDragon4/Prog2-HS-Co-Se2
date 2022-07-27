package uebung_7_1_Bibliothek;

import java.util.Comparator;

public class SortiereNachAuthor implements Comparator<Buch> {

	public int compare(Buch b1, Buch b2) {
		return b1.getTitel().compareTo(b2.getTitel());
	}

}
