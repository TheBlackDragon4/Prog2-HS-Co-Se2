package uebung_7_2_Zaehlerlisten;

public class CountListTest {

	public static void main(String[] args) {

		final CountList<Integer> cl = new CountList<Integer>();

		cl.add(2);
		cl.add(5);
		cl.add(2);
		cl.add(5);
		cl.add(3);

		// c1.count(2) -> liefert die Anzahl der Vorkommenden Elemente der Liste
		System.out.println(cl.count(2)); // 2
		// c1.unique() -> liefert die Anzahl der unterschiedlichen Elemente in der Liste
		System.out.println(cl.unique()); // 3
		// c1.counts() -> Liefert die Abbildung der Elemente der Liste die Anzahl der
		// Vorkommen -> Hier handelt es sich um eine MAP -> Alle Werte sind positiv
		System.out.println(cl.counts()); // { 2=2, 3=1, 5=2 }

	}

}
