package comparable;

public class Ampel {

	enum Farbe { GREEN, RED, YELLOW, RED_YELLOW, OFF  };
	
	private Farbe zustand;
	private int nummer;

	public Ampel(int nummer) {
		this.zustand = Farbe.RED;
		this.nummer = nummer;
	}

	public Farbe getZustand() {
		return zustand;
	}

	public void schalten() {

		// switch �ber enums m�glich
		switch (zustand) {

		case RED:
			zustand = Farbe.RED_YELLOW;
			break;
		case YELLOW:
			zustand = Farbe.RED;
			break;
		case GREEN:
			zustand = Farbe.YELLOW;
			break;
		case RED_YELLOW:
			zustand = Farbe.GREEN;
			break;
		}
	}

	// to String �ber enums m�glich
	public String toString() {
		return "" + this.nummer + ": zustand=" + zustand.toString();
	}
	

}
