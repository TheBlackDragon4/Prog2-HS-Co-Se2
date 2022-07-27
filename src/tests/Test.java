package tests;

public class Test {

	public static void main(String[] args) {

		String zahl1 = "5";
		String zahl2 = "10";
		Integer zahl3 = 5;

		Integer zahl4 = Integer.valueOf(5);

		String ausgabe;
		ausgabe = zahl3.toString();
		System.out.println(ausgabe);

		String erg = ((Integer) (Integer.valueOf(zahl1) + Integer.valueOf(zahl2))).toString();

		String erg1 = zahl1 + zahl2;

		System.out.println(erg);
		System.out.println(erg1);

		testAufruf();
		
		Double zahl = Double.valueOf("55");
		double zahl11 = Double.valueOf("55");
		System.out.println(zahl);
		System.out.println(zahl11);
		

		

	}

	private interface A {
		int i = 111;

		public void methodB(int i);
	}

	public class B implements A {
		public void methodB(int i) {
			i = 222;
			System.out.println(i);
		}

	}

	public static void testAufruf() {

	}

}
