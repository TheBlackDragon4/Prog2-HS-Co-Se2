package uebung_8_6_BibliothekMitLambdas;

public class BuchTest {

	public static void main(String[] args) {

		Buch b1 = new Buch("Reinhard Schiedermeier", "9784898645133", "Java Praktikum");
		Buch b2 = new Buch("Harvey Deitel", "01303451517", "How to program Java");
		Buch b3 = new Buch("Bertrand Meyer", "0136290310", "Object Oriented Software Construction");
		Buch b4 = new Buch("Bertrand Meyer", "9783642018558",
				"Software Engineering Approaches for Offshore and Outsourced Development");
		Buch b5 = new Buch("Kathy Sierra", "9783897214484", "Java von Kopf bis Fuss");
		Buch b6 = new Buch("Reinhard Schiedermeier", "9784898645133", "Java Praktikum ");
		Buch b7 = new Buch("Harvey Deitel", "01303451517", "How to program Java");
		Buch b8 = new Buch("Bertrand Meyer", "0136290310", "Object Oriented Software Construction");
		Buch b9 = new Buch("Bertrand Meyer", "9783642018558",
				"Software Engineering Approaches for Offshore and Outsourced Development");
		Buch b10 = new Buch("Kathy Sierra", "9783897214484", "Java von Kopf bis Fuss");
		Buch b11 = new Buch("Mark Utting", "9780123725011", "Pratical Model based Testing");

		BibliothekArrayList bib1 = new BibliothekArrayList();
		bib1.einfuegen(b1);
		bib1.einfuegen(b2);
		bib1.einfuegen(b3);
		bib1.einfuegen(b4);
		bib1.einfuegen(b5);
		bib1.einfuegen(b6);
		bib1.einfuegen(b7);
		bib1.einfuegen(b8);
		bib1.einfuegen(b9);
		bib1.einfuegen(b10);
		bib1.einfuegen(b11);

		// Suche nach Author mithilfe von Lambdas
		System.out.println(bib1.sucheNachAuthor("Reinhard Schiedermeier"));

		// Suche nach ISBN mithilfe von Lambdas
		System.out.println(bib1.sucheNachISBN("9780123725011"));

		// Suche nach bestandNachAutorAuflisten mithilfe von Lambdas
		System.out.println(bib1.bestandNachAuthorAuflisten());

	}

}
