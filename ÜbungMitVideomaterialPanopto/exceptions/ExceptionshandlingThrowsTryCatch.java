package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExceptionshandlingThrowsTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte Filepfad angeben: ");
		String filepath = sc.nextLine();

		try {
			readFile(filepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

	// Bei throws wird der Fehler einfach nur nach oben in die übergeordnete Methode weitergeschoben
	// try catch behandelt den Fehler dann
	public static void readFile(String filepath) throws FileNotFoundException { // in dieser Methode kann eine Exception
																				// geworfen werden
		FileReader fileReader = new FileReader(filepath);
	}

}
