package tests;

import java.util.*;

public class IterierenTest {

	enum Example {
		THREE, TWO, ONE
	};

	public static void main(String[] args) {

		Integer[] array = { 4, 6, 100, -90 };
		List<Integer> list = Arrays.asList(array);
		List<String> strings = new ArrayList<String>();
		strings.add(" Hallo ");
		strings.add(" wie ");
		strings.add(" geht ");
		strings.add(" dir ? ");

		for (Integer i : list) {
			System.out.print(i + " ");
		}

		System.out.println();

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();

		listTrim(strings);
		System.out.println("\n");
		hashMapTest();
		System.out.println("\n");
		collectionTest();

	}

	public static void listTrim(List<String> strings) {

		System.out.println(strings);

		for (String s : strings) {
			System.out.print(s.trim());
		}

	}

	public static void hashMapTest() {
		HashMap<String, String> props = new HashMap<String, String>();

		props.put("key45", "some value");
		props.put("key12", "some other value");
		props.put("key39", "yet another value");

		Set<String> s = props.keySet();

		s = new TreeSet(s);
		System.out.println(s);
	}

	public static void collectionTest() {
	
		Collection<Example> coll = new ArrayList<Example>();
		coll.add(Example.THREE);
		coll.add(Example.THREE);
		coll.add(Example.THREE);
		coll.add(Example.TWO);
		coll.add(Example.TWO);
		coll.add(Example.ONE);
		
		Set<Example> set = new HashSet<Example>(coll); // Zeile 12
		
		// Reihenfolge ist nicht gewährleistet
		System.out.println(set);
	}

}
