package aufgabe_10_Funktionales_interface;

public class ArrayProcessorTest {

	// Alle einer Zeile geschrieben somit
//	public static final ArrayProcessor maximum = array ->  {
//		double max = 0;
//		
//		for (int i = 0; i < array.length; i++) {
//			// ? Operator
//			max += array[i] > max ? array[i] : max;
//		}
//		return max;
//	};

	public static void main(String[] args) {

		// Lambda Methodenaufrufe da wir hier "->" verwenden
		ArrayProcessor summe = array -> {
			double sum1 = 0;

			for (double d : array) {
				sum1 += d;
			}
			return sum1;
		};

		ArrayProcessor maximum = array -> {
			double max = 0;

			for (int i = 0; i < array.length; i++) {
				// ? Operator
				max = array[i] > max ? array[i] : max;
			}
			return max;
		};

		ArrayProcessor minimum = array -> {
			double min = 0;

			for (int i = 0; i < array.length; i++) {
				// ? Operator
				min = array[i] < min ? array[i] : min;
			}
			return min;
		};

		ArrayProcessor durchschnitt = array -> {
			double durchSchnitt = 0;

			for (int i = 0; i < array.length; i++) {
				// ? Operator
				durchSchnitt += array[i] / array.length;
			}
			return durchSchnitt;
		};

		double[] secondList = { 17.0, 3.14, 17.0, -3.4, 17.0, 42.0 };

//		System.out.println("Maximum: " + maximum.apply(secondList));
		System.out.println("Maximum: " + maximum.apply(secondList));
		System.out.println("Minimum: " + minimum.apply(secondList));
		System.out.println("Summe: " + summe.apply(secondList));
		System.out.println("Durchschnitt: " + durchschnitt.apply(secondList));

	}

}
