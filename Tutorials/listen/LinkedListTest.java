package listen;

import java.util.Iterator;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<Integer> theList = new LinkedList<Integer>();

		System.out.println("initial: " + theList.isEmpty());

		for (int i = 0; i < 10; i++) {
			theList.append(i);
			System.out.println(theList);
		}

		for(Iterator<Integer> it = theList.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
		
		for (Integer i : theList) {
			System.out.println(i);
		}

		System.out.println("forEach: ");
		theList.forEach(i -> System.out.println(i));

		System.out.println(theList);

	}

}
