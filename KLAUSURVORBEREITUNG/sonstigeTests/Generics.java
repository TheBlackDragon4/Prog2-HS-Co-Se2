package sonstigeTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {

//	public static <T> T max(T x, T y) {
//	    return x > y ? x : y;
//	}

	class Node<T> implements Comparable<T> {
		public int compareTo(T obj) {
			return 0;
		}
	}

	//
	//
	//
	//
	//

	Node<String> node = new Node<>();
	Comparable<String> comp = node;

	public static void printList(List<?> list) {
		for (Object elem : list)
			System.out.print(elem + " ");
		System.out.println();
	}

	List<Integer> li = Arrays.asList(1, 2, 3);
	List<String> ls = Arrays.asList("one", "two", "three");
//	printList(li);
//	printList(ls);

	//
	//
	//
	//
	//

	public static void addNumbers(List<? super Integer> list) {
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
	}
//	Der folgende Code kompiliert fehlerfrei: 

	List<Integer> la = new ArrayList<Integer>();
	List<Double> ld = new ArrayList<Double>();
	List<Number> ln = new ArrayList<Number>();

//	addNumbers(la);
//	addNumbers(ld);
//	addNumbers(ln);
	
}
