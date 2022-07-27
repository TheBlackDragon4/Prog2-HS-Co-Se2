package uebung_4_2_Fahrzeugsimulation;

public class FahrzeugSimulation {

	public static void main(String[] args) {

		Fahrzeug audi = new Pkw("Audi A3");
		audi.beschleunigen(50);
		audi.fahren(20); // Fahrtdauer in minuten
		System.out.println(audi.toString());
		System.out.println("Anhalteweg: " + audi.stoppen() + "m" + ", Position: " + audi.position + " km");

		Fahrzeug bmw1 = new Pkw("BMW 1");
		bmw1.beschleunigen(40);
		bmw1.fahren(20); // Fahrtdauer in minuten
		System.out.println(bmw1.toString());
		System.out.println("Anhalteweg: " + bmw1.stoppen() + "m" + ", Position: " + bmw1.position + " km");

		Fahrzeug kaefer = new PkwOAbs("Kaefer");
		kaefer.beschleunigen(50);
		kaefer.fahren(20); // Fahrtdauer in minuten
		System.out.println(kaefer.toString());
		System.out.println("Anhalteweg: " + kaefer.stoppen() + "m" + ", Position: " + kaefer.position + " km");

		Fahrzeug lkw1 = new Lkw(40, "LKW 1"); // Angabe in Tonnen -> erstes ist das Gewicht
		lkw1.beschleunigen(30);
		lkw1.fahren(20); // Fahrtdauer in minuten
		System.out.println(lkw1.toString());
		System.out.println("Anhalteweg: " + lkw1.stoppen() + "m" + ", Position: " + lkw1.position + " km");

	}

}
