package listen;

public class ListNode2<E> {

	private E element;
	private ListNode2<E> next; // wir wollen uns den Nachfolger merken und nichts anderes

	private ListNode2(E element, ListNode2<E> next) {
		this.element = element;
		this.next = next;
	}

	private ListNode2(ListNode2<E> next) {
		element = null;
		this.next = next;
	}

	private ListNode2(E element) {
		this.element = element;
		this.next = null;
	}

}
