package uebung_4_3_Mobiles;

public class MobileTest {

	public static void main(String[] args) {

		Star a = new Star(2);
		Star b = new Star(4);
		Star c = new Star(9);

		Wire ab = new Wire(a, b, 9);
		Wire abc = new Wire(ab, c, 10);

		abc.balance();
		System.out.println("\nMobile 1: " + abc);

		// Ab hier wird ein Stern dekoriert -> Somit wird die "Glitterstern - Klasse"
		// aufgerufen
		// gb = Glitzer Stern b
		GlitterStar gb = new GlitterStar(4);

		gb.decorate();
		gb.decorate();
		gb.decorate();

		Wire agb = new Wire(a, gb, 9);
		Wire agbc = new Wire(agb, c, 10);

		agbc.balance();
		System.out.println("\nMobile 2: " + agbc);

	}

}
