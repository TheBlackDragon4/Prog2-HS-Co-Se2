package terms;

// Beispiel: 8 + (555-78) // Additionsterm
// Alternativ: (44 / 33) + (555 - 78)
// 8 = Literal
// 555 - 75 = Term

public class AdditionTerm extends BinaryTerm {

	Term t1, t2;

	public AdditionTerm(Term t1, Term t2) {
		super(t1, t2);
	}

	public int evaluate() {
		return left.evaluate() + right.evaluate();
	}

	public String toString() {
		return "" + left.toString() + " + " + right.toString();
	}

}
