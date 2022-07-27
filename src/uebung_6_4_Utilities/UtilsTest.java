package uebung_6_4_Utilities;

public class UtilsTest {

	public static void main(String[] args) {

		Integer[] keys = { 2000, 2, 99, 756, 999, 0, 666, 2345, 7492, 22 };
		String[] article = { "the", "a ", "one ", "some ", "anton", "ymca" };

		System.out.println("Ausgabe des Arrays: ");
		Utils.print(keys); // [2000,2,99,756,999,0,666,2345,7492,22]
		Utils.print(article); // [the,a,one,some,anton,ymca]

		System.out.println("\nAusgabe des Sortierten Arrays: ");
		Utils.sortiere(keys); // [0,2,22,99,666,756,999,2000,2345,7492]
		Utils.sortiere(article); // [a ,anton,one ,some ,the ,ymca]

		System.out.println("\nAusgabe der Überprüfung ob ein Wert null ist oder nicht:");
		System.out.println(Utils.noNull(null, 23, 45, 56, null)); // 23
		System.out.println(Utils.noNull("")); // null
		System.out.println(Utils.noNull(null, "Hello", "WoW")); // Hello

	}

}
