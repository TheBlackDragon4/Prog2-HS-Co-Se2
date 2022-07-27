package comparable;

public class SortInt {
	
	public static void sortiere(int[] kArray) {

		for (int i = 0; i < kArray.length; i++) {
			for (int j = 0; j < kArray.length - i - 1; j++)
				if (kArray[j] > kArray[j+1]) {
					int swap = kArray[j+1];
					kArray[j + 1] = kArray[j];
					kArray[j] = swap;
				}
		}
	}
	
	public static void main(String[] args) {

		int[] a = { 3, -5, 77, -100, 200, 10000 };

		SortInt.sortiere(a);
		for (int x : a)
			System.out.print(" " + x);

	}

}
