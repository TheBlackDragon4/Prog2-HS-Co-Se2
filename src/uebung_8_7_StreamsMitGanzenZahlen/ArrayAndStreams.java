package uebung_8_7_StreamsMitGanzenZahlen;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayAndStreams {

	public static void main(String[] args) {

		Integer[] values = { 2, 9, 5, 0, 3, 7, 1, 4, 8, 6 };
		int[] values1 = { 2, 9, 5, 0, 3, 7, 1, 4, 8, 6 };

		// display original values
		System.out.printf("Original values: %s%n", Arrays.asList(values));

		// -> Ab Seite 51 Vorlesungsskript
		// Ausgabe aller Werte von values in aufsteigender Reihenfolge
		System.out.println("Sortiertes Array: " + Arrays.stream(values).sorted().collect(Collectors.toList()));

		// Ausgabe aller Werte in values, die groesser als 4 sind
		System.out.println(
				"Werte größer als 4: " + Arrays.stream(values).filter(b -> b > 4).collect(Collectors.toList()));

		// Filtern von allen Werten in values, die groesser als 4 sind, und
		// sortierte diese anschliessend
		System.out.println("Werte größer als 4: "
				+ Arrays.stream(values).filter(b -> b > 4).sorted().collect(Collectors.toList()));

		// Test: -> https://www.straub.as/java/history/java8/intstreams.html
		System.out.println("\n\nDurchschnitt: " + IntStream.of(values1).average()); // Berechnung des Durchschnittes
		IntStream.range(0, 12).forEach(System.out::print);
		System.out.println();
		IntStream.of(values1).forEach(System.out::print);

	} // end class ArraysAndStreams

}
