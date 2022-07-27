package terms;

public class IntLiteral extends Term {

	private final int value; // nicht mehr ver�nderbar

	public IntLiteral(int v) {
		this.value = v;
	}

	public int evaluate() {
		return value;
	}

	public String toString() {
		return "" + value;
	}

}
