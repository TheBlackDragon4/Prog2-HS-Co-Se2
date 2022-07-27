package uebung_8_1_Allquantoren;

import java.util.Arrays;
import java.util.List;

public class ArrayIntStream {

	public static void main(String[] args) {

		Integer[] values = { 2, 9, 5, 0, 3, 7, 1, 4, 8, 6 };
		List<Integer> list = Arrays.asList(values);

		// Ausgabe aller Werte von values
//		for (Integer n : list) {
//			System.out.println(n);
//		}
		list.forEach(n -> System.out.println(n)); 
//		list.forEach(System.out::println);

	}

}
