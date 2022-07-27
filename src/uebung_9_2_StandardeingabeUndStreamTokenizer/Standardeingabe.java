package uebung_9_2_StandardeingabeUndStreamTokenizer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Standardeingabe {

	public static void main(String[] args) {

		int[] number = new int[5];
		int summe = 0;

		// Eingabe von Werten mithilfe des InputStreamReaders
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < number.length; i++) {
			System.out.println("Bitte " + (i + 1) + ". Zahl eingeben:");
			String zeile;
			try {
				zeile = bf.readLine();
				number[i] = Integer.parseInt(zeile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		for (int i = 0; i < number.length; i++) {

			summe += number[i];
			System.out.print(number[i] + "");
			if (i < number.length - 1) {
				System.out.print(" + ");
			} else {
				System.out.println(" = " + summe);
			}

		}

		// Tests aus Vorlesungsskript
//		System.out.println("Werte eingeben");
//		String zeile = bf.readLine();
//		int i = Integer.parseInt(zeile);
//		System.out.println(i);

	}

}
