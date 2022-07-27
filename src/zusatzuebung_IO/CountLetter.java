package zusatzuebung_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class CountLetter {

	public static int count(char lookFor, String file) {
		int count = 0;

		// <- BufferReader <- FileReader
		try (FileReader f = new FileReader(file); BufferedReader reader = new BufferedReader(f)) {

			String line = null;
			while ((line = reader.readLine()) != null) {
				for (int i = 0; i < line.length(); i++) {
					if (lookFor == line.charAt(i)) {
						count++;
					}
				}
			}

		} catch (IOException e) {
			System.err.println(e);
		}

		return count;
	}

	public static void main(String[] args) {
		// Im Fehlerfall
		if (args.length != 1) {
			System.out.println("Usage: java Countletter <letter>");
			System.exit(1);
		}

		char lookFor = args[0].charAt(0);
		Path file = FileSystems.getDefault().getPath("src", "Xanadu.txt");

		System.out.println("File: " + file.toString() + " has " + count(lookFor, file.toString())
				+ " instances of letter " + lookFor);

	}
}
