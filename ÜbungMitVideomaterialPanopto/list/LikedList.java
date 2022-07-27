package list;

import java.util.Iterator;
import java.util.LinkedList;

public class LikedList {

	public static void main(String[] args) {

		// <Datentyp> enthalten
		LinkedList<String> list = new LinkedList<String>();

		list.add("Hamster"); // Hinzuf�gen eines Listenelements
		list.add("Maus"); // Hinzuf�gen eines weiteren Listenelements
		list.add("Hund"); // Hinzuf�gen eines weiteren Listenelements

		// F�r jede iteration wird ein neues Iterator Objekt ben�tigt
		Iterator<String> iter = list.iterator(); // Greift auf das Listenelement zu

		while (iter.hasNext()) {

			if (iter.next().equals("Maus")) {
				iter.remove(); // Entfernen von Maus
			}
		}

		Iterator<String> iter2 = list.iterator();

		while (iter2.hasNext()) {

			System.out.println(iter2.next());

		}

		System.out.println("------------------------");

	}

}
