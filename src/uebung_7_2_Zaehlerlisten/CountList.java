package uebung_7_2_Zaehlerlisten;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CountList<E> extends ArrayList<E> {

	// MAP -> mehrere Werte enthalten vom selben Typ
	// Set -> Darf nur einmal vorkommen

	private static final long serialVersionUID = 1L;

	public int count(E searchElement) {
		int result = 0;

		for (E element : this) {
			if (element == null) {
				if (searchElement == null) {
					result++;
				}
			} else if (element.equals(searchElement)) {
				result++;
			}
		}

		return result;
	}

	public int unique() {
		// liefert die Anzahl der unterschiedlichen Elemente in der Liste
		// this greift auf diese Liste<E> zu
		// *.size liefert die Gibt die Anzahl der Werte in diesem "Set" als Rückgabewert
		// zurück
		return new HashSet<E>(this).size();
	}

	// Integer zeigt die Einschränkung
	public Map<E, Integer> counts() {

		Map<E, Integer> countMap = new HashMap<E, Integer>();
		Integer count = 0;

		for (E element : this) {
			// Zugriff auf countMap und hier soll das entsprechende Element in count
			// gespeichert werden
			// Ist Der Wert schon in der Liste enthalten NEIN -> dann wird das Element
			// reingeschrieben
			if (countMap.get(element) != null) {
				// Wenn Element in Liste vorhanden ist, soll die aktuelle Anzahl dieser
				// herausgeholt und in count geschreiben werden
				count = countMap.get(element);
			}
			// *.put -> holt das Element heraus und erhöht hier count wiederum um 1
			// Das wird für jedes Element in der Liste gemacht
			countMap.put(element, ++count);
		}

		return countMap;
	}

}
