package zusatzaufgabe_Exceptions;

public class FieldErrorException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FieldErrorException() {
		super();
	}
	
	public FieldErrorException(String message) {
		super(message);
	}
	
}
