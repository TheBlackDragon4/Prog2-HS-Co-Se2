package sonstigeTests;

public class LinkedListException extends Exception {

	public LinkedListException() {
		super("Es ist ein Fehler in der LinkedList aufgetreten!! ");
	}
	
//	public LinkedListException() {
//		super();
//		System.out.println("Es ist ein Fehler in der LinkedList aufgetreten!! ");
//	}

	public static void test() throws LinkedListException {

		int test = 4;
		if (test != 5) {
			throw new LinkedListException();
		}

	}
	
	public static void main(String[] args) {
		
		try {
			test();
		} catch (LinkedListException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
