package generics;

// erlaubt alle Datentypen f�r die �bergabe
// Einschr�nken mithilfe von extends umber bsw.
public class Box<E extends Number & Comparable<?>> { // Klasse Box ist vergleichbar mit anderen Klassen
//public class Box<E extends Number> {

	private E element;

	public Box(E element) {
		this.element = element;
	}

	public E getContent() {
		return this.element;
	}

	public static void main(String[] args) {
		// Starke Wiederverwendbarkeit
//		Box<String> box1 = new Box<String>("Box1"); // kein String mehr m�glich wegen extends Number
		Box<Double> box1 = new Box<Double>(123.456);
		Box<Integer> box2 = new Box<Integer>(2);

		// keine Casts notwendig, da Generics genau f�r das Element verwendet werden f�r
		// das wir das Objekt erstellt haben
		System.out.println(box1.getContent());
		System.out.println(box2.getContent());
		

	}

}
