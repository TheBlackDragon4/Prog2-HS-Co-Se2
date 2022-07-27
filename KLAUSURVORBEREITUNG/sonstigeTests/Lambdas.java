package sonstigeTests;

import java.util.Arrays;

public class Lambdas {

	public interface Something {

		int calc(double d, int f);

	}

	public interface FuncConst {
		public float con();
	}
	
	public interface Aufruf<T extends Number, X extends Number, Z extends Number> {
		public Z test(T a, X b);
	}

	public static void main(String[] args) {

		Something func0 = (double d, int f) -> (int) (d + f);
		System.out.println(func0.calc(3.0, 4));

		Something func = (double d, int f) -> {
			return (int) (d + f);
		};

		FuncConst pi = () -> (float) 3.1415;

		Something func1 = (d, f) -> {
			return (int) (d + f);
		};
		

		String[] arr = { "The", "2014", "Winter", "Water", "officially ", "known", "as", "the", "XXII", " Olympic",
				"Winter", "Games" };

		Arrays.sort(arr, (s1, s2) -> s1.toLowerCase().compareTo(s2.toLowerCase()));
		
			for (String a : arr) {
			System.out.print(" " + a);
		}

		Aufruf<Double, Integer, Float> addierenAufruf = (a , b) -> (float) (a + b);		
		System.out.println("\n\n" + addierenAufruf.test(7.5, 2));
			
	}

}
