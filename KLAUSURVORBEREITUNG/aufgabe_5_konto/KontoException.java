package aufgabe_5_konto;

public class KontoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public KontoException() {
		super();
	}

	public KontoException(String message) {
		super(message);
	}

}
