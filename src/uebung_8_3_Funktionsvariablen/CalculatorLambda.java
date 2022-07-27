package uebung_8_3_Funktionsvariablen;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class CalculatorLambda {

	public static void main(String... args) {

		IntBinaryOperator addition = (a, b) -> a + b; // Mitgabe von nur zwei "two int-value" Int - Wert
		IntBinaryOperator subtraction = (a, b) -> a - b; // Mitgabe von nur zwei "two int-value" Int - Wert
		IntUnaryOperator increment = (a) -> a = a + 1; // Mitgabe von nur einem "single int-values" Int - Wert
		IntUnaryOperator decrement = (a) -> a = a - 1; // Mitgabe von nur einem "single int-values" Int - Wert
		DoubleBinaryOperator division = (a, b) -> a = a / b; // Mitgabe "two double-values" double - Werte
		IntBinaryOperator multiplication = (a, b) -> a = a * b; // Mitgabe von nur zwei "two int-value" Int - Wert

		System.out.println("40 + 2 = " + addition.applyAsInt(40, 2));
		System.out.println("20 - 10 = " + subtraction.applyAsInt(20, 10));
		System.out.println("inc(20) = " + increment.applyAsInt(20));
		System.out.println("dec(20) = " + decrement.applyAsInt(20));
		System.out.println("20 / 4 = " + division.applyAsDouble(20, 4));
		System.out.println("20 * 5 = " + multiplication.applyAsInt(20, 5));

	}
}
