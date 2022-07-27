package uebung_6_2_Lagerverwaltung;

public class JackeLagerTest {

	public static void main(String[] args) {

		// 77777740 blau Fleece Jacke Roos 380
		Jacke j1 = new Jacke(40, Farbe.BLAU, "Fleece Jacke Roos", 1000);
		System.out.println(j1);
		Jacke j2 = new Jacke(38, Farbe.GRUEN, "Lederjacke Only", 1000);
		System.out.println(j2);
		Jacke j3 = new Jacke(38, Farbe.ROT, "Blouson", 2000);
		System.out.println(j3);
		Jacke j4 = new Jacke(40, Farbe.BLAU, "Kaputenparka", 3000);
		System.out.println(j4);
		Jacke j5 = new Jacke(42, Farbe.GRAU, "Jacke Meltose", 100);
		System.out.println(j5);

		Artikellager<Jacke> jackenLager = new Artikellager<Jacke>(10);
		jackenLager.einlagern(j1);
		jackenLager.einlagern(j2);
		jackenLager.einlagern(j3);
		jackenLager.einlagern(j4);
		jackenLager.einlagern(j5);

		System.out.println("");
		System.out.println("Artikelnummeranzahl von '77777740' im Lager = " + jackenLager.bestandSuchen("77777740")); // Sollte
																														// 2
																														// zur�ckgeben
		Jacke ja0 = jackenLager.auslagern("77777740");
		System.out.println("Artikelnummeranzahl von '77777740' im Lager = " + jackenLager.bestandSuchen("77777740")); // Sollte
																														// 1
																														// zur�ckgeben

		System.out.println("Artikelnummeranzahl von '77777738' im Lager = " + jackenLager.bestandSuchen("77777738")); // Sollte
																														// 2
																														// zur�ckgeben
		Jacke ja1 = jackenLager.auslagern("77777738");
		System.out.println("Artikelnummeranzahl von '77777738' im Lager = " + jackenLager.bestandSuchen("77777738")); // Sollte
																														// 1
																														// zur�ckgeben

		System.out.println(ja0);
		System.out.println(ja1);

	}

}
