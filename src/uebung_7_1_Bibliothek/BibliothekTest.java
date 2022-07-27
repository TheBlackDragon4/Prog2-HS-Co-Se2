package uebung_7_1_Bibliothek;

import java.util.Comparator;

public class BibliothekTest {

	public static void main(String[] args) {

//		ausgabeArrayList();
//		ausgabeLinkedList();
		ausgabeTreeSet();

	}

	public static void ausgabeArrayList() {
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

		System.out.println("Bibliothek unsortiert: ");
		System.out.println("-----------------");
		System.out.println(bib1.toString());

		System.out.println("\nBibliothek sortiert nach Author: ");
		System.out.println("-----------------");

		// Alternativen:
		// Innerklasse / Memberklasse
		// -> Bedeutet Abbildungspfeil bei Lambdas
		bib1.bestandSortierenNach((o1, o2) -> {
			return o1.getTitel().compareTo(o2.getTitel());
		});
		bib1.bestandSortierenNach((o1, o2) -> o1.getTitel().compareTo(o2.getTitel()));
		bib1.bestandSortierenNach(Comparator.comparing(b -> b.getAuthor()));
		System.out.println(bib1.bestandSortierenNach(Comparator.comparing(Buch::getAuthor)));

		System.out.println("\nBibliothek sortiert nach Titel: ");
		System.out.println("-----------------");
		System.out.println(bib1.bestandSortierenNach(new SortiereNachAuthor()));

	}

	public static void ausgabeLinkedList() {
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

		BibliothekLinkedList bib1 = new BibliothekLinkedList();

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

		System.out.println("Bibliothek unsortiert: ");
		System.out.println("-----------------");
		System.out.println(bib1.toString());

		System.out.println("\nBibliothek sortiert nach Author: ");
		System.out.println("-----------------");
		System.out.println(bib1.bestandSortierenNach(Comparator.comparing(Buch::getAuthor)));

		System.out.println("\nBibliothek sortiert nach Titel: ");
		System.out.println("-----------------");
		System.out.println(bib1.bestandSortierenNach(new SortiereNachAuthor()));

	}

	public static void ausgabeTreeSet() {
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

		BibliothekTreeSet bib1 = new BibliothekTreeSet();

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

		System.out.println("Bibliothek unsortiert: ");
		System.out.println("-----------------");
		System.out.println(bib1.toString());

		System.out.println("\nBibliothek sortiert nach Author: ");
		System.out.println("-----------------");
		System.out.println(bib1.bestandSortierenNach(Comparator.comparing(Buch::getAuthor)));

		System.out.println("\nBibliothek sortiert nach Titel: ");
		System.out.println("-----------------");
		System.out.println(bib1.bestandSortierenNach(new SortiereNachAuthor()));
	}

}
