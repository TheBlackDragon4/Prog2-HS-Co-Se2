package uebung_9_3_Artikelverwaltung;

import uebung_9_3_Artikelverwaltung.Kleidungsstueck.Farbe;

public class ArtikelVerwaltungTest {

	public static void main(String[] args) {

		ArtikelVerwaltung a1 = new ArtikelVerwaltung(create(10));
		ArtikelVerwaltung a2 = new ArtikelVerwaltung(create(10));

		a1.write("Artikel.txt");
//		System.out.println(a1); // Teilaufgabe b)
		a2.read("Artikel.txt");
		System.out.println(a2);

	}

	public static Artikel[] create(int anzahl) {

		Artikel[] artikel = new Artikel[anzahl];

		String[] marken = { "Levis", "BOSS", "Wrangler", "Denim" };
		int[] groesse = { 34, 36, 38, 42 };
		int[] schritt = { 360, 380, 400, 420, 440 };

		for (int i = 0; i < artikel.length; i++) {

			String marke = marken[(int) (Math.random() * marken.length)];

			int gro = groesse[(int) (Math.random() * groesse.length)];
			int f = (int) (Math.random() * Kleidungsstueck.Farbe.values().length);
			int schri = schritt[(int) (Math.random() * schritt.length)];

			artikel[i] = new Jeans(gro, Farbe.values()[f], marke, schri);

		}

//		Jeans[] jeans = { new Jeans(38, Farbe.GRAU, "Levis", 440), new Jeans(34, Farbe.GR�N, "Denim", 440),
//				new Jeans(34, Farbe.ROT, "Wrangler", 380), new Jeans(34, Farbe.ROT, "Boss", 400),
//				new Jeans(42, Farbe.BLAU, "Boss", 400), new Jeans(34, Farbe.GRAU, "Boss", 440),
//				new Jeans(38, Farbe.GRAU, "Boss", 420), new Jeans(40, Farbe.GRAU, "Boss", 360),
//				new Jeans(36, Farbe.SCHWARZ, "Wrangler", 420), new Jeans(38, Farbe.ROT, "Boss", 440) };

		// 56740738 Levis 38 GRAU 440,
		// 56740734 Denim 34 GR�N 440,
		// 56740734 Wrangler 34 ROT 380,
		// 56740734 Boss 34 ROT 400,
		// 56740742 Boss 42 BLAU 400,
		// 56740734 Boss 34 GRAU 440,
		// 56740738 Boss 38 GRAU 420,
		// 56740740 Boss 40 GRAU 360,
		// 56740736 Wrangler 36 SCHWARZ 420,
		// 56740738 Boss 38 ROT 440

		return artikel;
	}

}
