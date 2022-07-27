package uebung_8_2_Maipulation_von_Objekten;

import java.util.LinkedList;
import uebung_7_1_Bibliothek.Buch;

public class BuchTest {

	public static void main(String[] args) {

		LinkedList<Buch> buchRegel = new LinkedList<Buch>();

		Buch b1 = new Buch("Reinhard Schiedermeier", "9784898645133", "Java Praktikum");
		Buch b2 = new Buch("Harvey Deitel", "01303451517", "How to program Java");
		Buch b3 = new Buch("Bertrand Meyer", "0136290310", "Object Oriented Software Construction");
		Buch b4 = new Buch("Bertrand Meyer", "9783642018558",
				"Software Engineering Approaches for Offshore and Outsourced Development");
		Buch b5 = new Buch("Kathy Sierra", "9783897214484", "Java von Kopf bis Fuss");

		buchRegel.add(b1);
		buchRegel.add(b2);
		buchRegel.add(b3);
		buchRegel.add(b4);
		buchRegel.add(b5);

		buchRegel.forEach(b -> b.setAuthor("Meyer"));

		buchRegel.forEach(b -> System.out.println(b));

	}

}
