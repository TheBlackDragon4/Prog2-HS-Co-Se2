package enums;

public class ColorTest {

	public static void main(String[] args) {

		System.out.println(Color.BLUE);
		System.out.println(Color.RED);
		System.out.println(Color.GREEN);
		System.out.println(Color.ORANGE);
		
		Color c1 = Color.RED; // *.ordinal() Wert ausgeben an Position im Array
		System.out.println(c1.ordinal());
		System.out.println(c1);

	}

}
