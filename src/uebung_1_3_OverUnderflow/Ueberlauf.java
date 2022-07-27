package uebung_1_3_OverUnderflow;

public class Ueberlauf extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int exponent;

	public Ueberlauf(int exponent) {
		super(); // Erbt Attribute von Exceptions
		this.exponent = exponent;
	}

	public Ueberlauf(int exponent, String message) {
		super(message);
		this.exponent = exponent;
		// this.message = message;
	}

	public int getExponent() {
		return exponent;
	}

}
