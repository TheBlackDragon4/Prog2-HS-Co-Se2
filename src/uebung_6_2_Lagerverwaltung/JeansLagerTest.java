package uebung_6_2_Lagerverwaltung;

public class JeansLagerTest {

	public static void main(String[] args) {

		// 56740736 1 schwarz Jeans Levis 501 340
		Jeans j1 = new Jeans(36, Farbe.SCHWARZ, "Jeans Levis 501", 340);
		System.out.println(j1);

		// 56740736 schwarz Jeans Wrangler 50 380
		Jeans j2 = new Jeans(36, Farbe.SCHWARZ, "Jeans Wrangler 50", 380);
		System.out.println(j2);

		System.out.println("");

		Artikellager<Jeans> jeansLager = new Artikellager<Jeans>(10);
		jeansLager.einlagern(j1);
		jeansLager.einlagern(j2);
		
		System.out.println("Artikelnummeranzahl von '" + j1.artikelNummer() + "' im Lager = "
				+ jeansLager.bestandSuchen("56740736")); // Sollte 2 zurückgeben
		Jeans j = jeansLager.auslagern("56740736");
		System.out.println("Artikelnummeranzahl von '" + j2.artikelNummer() + "' im Lager = "
				+ jeansLager.bestandSuchen("56740736")); // Sollte 1 zurückgeben

		System.out.println(j);

	}

}
