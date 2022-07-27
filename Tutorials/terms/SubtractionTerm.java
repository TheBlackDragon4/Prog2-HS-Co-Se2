package terms;

//                           ist_ein
public class SubtractionTerm extends BinaryTerm {

	Term t1, t2;

	public SubtractionTerm(Term t1, Term t2) {
		super(t1, t2);
	}

	public int evaluate() {
		return left.evaluate() - right.evaluate();
	}

	public String toString() {
		return "" + left.toString() + " - " + right.toString();
	}

}
