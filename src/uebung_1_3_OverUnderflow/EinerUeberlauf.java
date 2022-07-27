package uebung_1_3_OverUnderflow;

public class EinerUeberlauf extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EinerUeberlauf() {
		super(); // Erbt Attribute von Exceptions
	}

	public EinerUeberlauf(String message) {
		super(message);
		// this.message = message;
	}

}
