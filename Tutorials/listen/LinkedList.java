package listen;

import java.util.Iterator;

/**
 * The <code>LinkedList</code> class implements a simple linked list based on
 * the specification of the abstract data type List. This implementation uses a
 * pointer implementation and not an array
 * 
 * Note that the position is implemented as an integer index This implementation
 * has disadvantages in regard to Big O(n) runtime
 * 
 */

public class LinkedList<E> implements List<E>, Iterable<E> {

	private ListNode<E> header;

	/**
	 * Construct the list
	 */
	public LinkedList() {
		header = new ListNode<E>(null);
	}

	/**
	 * Test if the list is logically empty.
	 * 
	 * @return true if empty, false otherwise.
	 */
	public boolean isEmpty() {
		return header.next == null;
	}

	/**
	 * Appends the element x at the end of the list
	 *
	 * @param x the item to append.
	 */
	public void append(E x) {

		// todo
		ListNode<E> itr = header;

		while (itr.next != null) {
			itr = itr.next;
		}

		ListNode<E> newNode = new ListNode<E>(x);
		itr.next = newNode;

	}

	/**
	 * Search for a specific object with the "same value"
	 * 
	 * @param x the item to search for.
	 * @return true if the item is fond, else false.
	 */
	public boolean contains2(E x) {

		ListNode<E> itr = header;

		while (itr.next != null) {
			itr = itr.next;

			// Vergleich mit mitgegebenen Parameter
			if (itr.element.equals(x)) {
				return true;
			}
		}
		return false;
	}

	// kürzere Alternative als die obere Methode contains2
	public boolean contains(E x) {

		// this zeigt, dass hier die Liste selbst verwendet wird
		for (var i : this) {
			// Vergleich mit mitgegebenen Parameter
			if (i.equals(x)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * toString
	 */
//	public String toString() {
//		String s = null;
//		ListNode<E> itr = header;
//
//		while (itr.next != null) {
//			s += itr.next.toString();
//			itr = itr.next;
//		}
//		// StringBuffer sb = new StringBuffer();
//
//		return s;
//	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();

		// Hier werden die einzelnen Elemente von stringBuilder sortiert
		stringBuilder.append("[");

		for (Iterator<E> it = this.iterator(); it.hasNext();) {
			stringBuilder.append(it.next());
			if (it.hasNext()) {
				stringBuilder.append(",");
			}
		}
		
		stringBuilder.append("]");

		return stringBuilder.toString();
	}

	public Iterator<E> iterator() {
		return new SimpleListIterator<E>(header);
	}

	class SimpleListIterator<E> implements Iterator<E> {

		ListNode<E> node;

		// Sorgt dafür, dass drüber iteriert werden kann / darf
		public SimpleListIterator(ListNode<E> n) {
			node = n;
		}

		public boolean hasNext() {
			return node.next != null;
		}

		public E next() {
			node = node.next;
			E n = node.element;
			return n;
		}

	}

	public void add(String string) {
		// TODO Auto-generated method stub
		
	}

}
