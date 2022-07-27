package uebung_6_5_Summe;

import java.util.Arrays;
import java.util.Collection;

public class Summe {

	// Man weiß nicht welcher Wert eingegeben werden soll daher werden
	// Einschränkungen gemacht, sodass hier in diesem Fall bsw. kein "String"
	// eingegegeben werden kann.
	// Eingegebene Werte müssen vom Typ Number sein daher "extends Number"
	public static double sum(Collection<? extends Number> collection) {

		double result = 0.0;

		for (Number number : collection) {
			result += number.doubleValue();
		}

		return result;
	}

	public static void main(String[] args) {
		// Bei übergabe eines anderen Wertes außer Integer und Double kommt ein Fehler
		System.out.println(Summe.sum(Arrays.asList(1, 2.5, 3, 4.4, 5, 6, 7, 8, 9, 10)));

	}

}
