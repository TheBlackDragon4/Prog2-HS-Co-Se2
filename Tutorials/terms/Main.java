package terms;

public class Main {

	public static void main(String[] args) {

		// 8(Literal) + 40(Literal) - 600(Literal)
		IntLiteral lit1 = new IntLiteral(8);
		IntLiteral lit2 = new IntLiteral(40);
		IntLiteral lit3 = new IntLiteral(600);

		BinaryTerm add = new AdditionTerm(lit1, lit2);
		BinaryTerm sub = new SubtractionTerm(add, lit3);

		System.out.println(add + " = " + add.evaluate());
		System.out.println(sub + " = " + sub.evaluate());

	}

}
