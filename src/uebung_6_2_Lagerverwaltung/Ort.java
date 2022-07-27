package uebung_6_2_Lagerverwaltung;

public class Ort<E> {

	// Eindeutige Nummer daher final
	private final int ortsID;
	private E eingelagertesElement;

	public Ort(int ortsId) {
		this.ortsID = ortsId;
		this.eingelagertesElement = null;
	}

	public E entnehmen() {

		E tmpE = eingelagertesElement;
		eingelagertesElement = null;
		return tmpE;
		
	}

	public void hinzufuegen(E gegenstand) throws LagerortIstVollException {
		// if(istBelegt()==true)
		// if(istBelegt()==false)
		// !istBelegt()
		// istBelegt()

		if (istBelegt()) {
			throw new LagerortIstVollException("Der Lagerort ist schon gef�llt!");
		}

		eingelagertesElement = gegenstand;

	}

//	public void hinzuf�gen(E e) throws LagerortIstVollException {
//		if (element != null) {
//			throw new LagerortIstVollException("Der Lagerort ist bereits voll.");
//		}
//		element = e;
//	}

	public E getEingelagertesElement() {
		return eingelagertesElement;
	}

	public boolean istBelegt() {
		if (eingelagertesElement != null) {
			return true;
		}
		return false;
		// Alternative: return inhaltE != null;
	}

	public int getOrtsId() {
		return this.ortsID;
	}

	public String toString() {
		return "OrtsID: " + ortsID + " " + ((eingelagertesElement != null)? eingelagertesElement.toString() : null);
	}

	public static class LagerortIstVollException extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public LagerortIstVollException() {
			super();
		}

		public LagerortIstVollException(String message) {
			super(message);
		}

	}

}
