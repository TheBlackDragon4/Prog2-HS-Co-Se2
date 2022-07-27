package uebung_6_3_Paare;

public class Pair<F, S> {

	private final F first;
	private final S second;

	public Pair(final F first, final S second) {
		this.first = first;
		this.second = second;
	}

	public F first() {
		return first;
	}

	public S second() {
		return second;
	}

	public boolean equals(Object x) {

		if (x == null) {
			return false;
		}

		if (getClass() != x.getClass()) {
			return false;
		}

		final Pair other = (Pair) x;

		if (x != null) {

		}

		if (!nullEquals(first, other.first)) {
			return false;
		}

		if (!nullEquals(second, other.second)) {
			return false;
		}
		return true;
	}

	private boolean nullEquals(Object x, Object y) {
		if (x == null) {
			return y == null;
		}
		// Vergleich der beiden Objekte miteinander
		return x.equals(y);
	}

	public int hashCode() {
		int hash = 17;

		if (first != null) {
			// Formel: Hash = Primzahl * hash + Hashcode von beliebiger Zahl
			// hash = p * hash + ZAHL.hashcode();
			hash = 41 * hash + first.hashCode();
		}
		if (second != null) {
			hash = 41 * hash + second.hashCode();
		}
		return hash;
	}

	public String toString() {
		return "(" + first + ", " + second + ")";
	}
}
