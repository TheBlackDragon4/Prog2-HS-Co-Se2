package uebung_6_3_Paare;

import java.util.Vector;

public class PairTest {

	public static void main(String[] args) {

		Vector<Pair<String, Integer>> vector = new Vector<Pair<String, Integer>>();
		vector.add(new Pair<String, Integer>("I", 1));
		vector.add(new Pair<String, Integer>("V", 5));
		vector.add(new Pair<String, Integer>("C", 100));
		vector.add(new Pair<String, Integer>("II", 2));
		vector.add(new Pair<String, Integer>("IX", 9));
		vector.add(new Pair<String, Integer>("I", 1));
		System.out.println(vector);

		System.out.println(vector.get(0).equals(vector.get(5)));
		System.out.println(vector.get(1).equals(vector.get(2)));
		System.out.println(vector.get(3).equals(vector.get(4)));
		System.out.println(vector.get(5).equals(vector.get(0)));
		System.out.println();
		System.out.println(vector.get(0).hashCode()); // Hashcode von Position 0 und 5 müssen gleich sein
		System.out.println(vector.get(1).hashCode());
		System.out.println(vector.get(3).hashCode());
		System.out.println(vector.get(3).hashCode());
		System.out.println(vector.get(4).hashCode());
		System.out.println(vector.get(5).hashCode()); // Hashcode von Position 0 und 5 müssen gleich sein
	}

}
