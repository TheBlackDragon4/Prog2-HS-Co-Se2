package uebung_8_5_Sortieren;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonTest {

	public static void main(String[] args) {

		Person[] people = new Person[] { new Person("Ted", "Neward", 41), new Person("Charlotte", "Neward", 41),
				new Person("Michael", "Neward", 19), new Person("Matthew", "Neward", 13),
				new Person("Adam", "Pfeiffer", 43) };

		// Variante 1
		// Methoden überladen in diesem Fall nicht möglich
		// :: -> Heist FUNKTIONSZEIGER oder METHODENREFFERENZ
		Comparator<Person> comparator = Person::comparatorFirstName; // Klasse und Static Methode
		Comparator<Person> comparator1 = Person::comparatorFirstName1; // Typ und Methode
		Arrays.sort(people, comparator);
		Arrays.sort(people, comparator1);

		// Variante 2
		Arrays.sort(people, Comparator.comparing(Person::getFirstName)); // Typ und Methode
		Arrays.sort(people, Comparator.comparing(p -> p.getFirstName()));
 		Arrays.sort(people, Comparator.comparing(Person::getFirstNameStatic)); // Klasse und Static Methode
 		Arrays.sort(people, Comparator.comparing(p -> Person.getFirstNameStatic(p)));

		// Variante 3
		Arrays.sort(people, (lhs, rhs) -> lhs.getFirstName().compareTo(rhs.getFirstName()));

		// Prüfung und Ausgabe zur Kontrolle
		for (Person p : people) {
			System.out.println(p);
		}

	}

}
