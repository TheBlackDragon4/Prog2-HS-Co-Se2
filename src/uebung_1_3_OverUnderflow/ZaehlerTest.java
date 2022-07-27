package uebung_1_3_OverUnderflow;

public class ZaehlerTest {

	public static void main(String[] args) {

		Zaehler z1 = new Zaehler();

		boolean b = true;
		
		while (b) {
			
			try {
				z1.zaehlen();
				System.out.print(z1.getZehner());
				System.out.println(z1.getEiner());
			} catch (Ueberlauf e) {
				b = false;
				System.out.println(e.getExponent()); // Zusatzinfo
				System.out.println(e.getMessage());
			}
			
		}

	}

}
