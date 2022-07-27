package uebung_2_2_Kartenspiel;

public class KartenspielTest {

	public static void main(String[] args) {

		Kartenspiel k1 = new Kartenspiel(5);
		Kartenspiel k2 = new Kartenspiel(7);

		k1.mischen();
		System.out.println(k1.toString());
		k1.sortieren();
		System.out.println(k1.toString());

		k2.mischen();
		System.out.println(k2.toString());
		k2.sortieren();
		System.out.println(k2.toString());

	}

}
