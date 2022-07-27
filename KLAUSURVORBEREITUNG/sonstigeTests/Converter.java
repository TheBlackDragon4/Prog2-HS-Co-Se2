package sonstigeTests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Converter {

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("Use Converter <input filename> <output filename>");
			System.exit(1);
		}

		try (BufferedReader br = new BufferedReader(new FileReader(args[0]));
				BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));) {

			int zahlenWert;
			while ((zahlenWert = br.read()) != -1) {
				char umgewandelterText = (char) zahlenWert;
				if (umgewandelterText == ' ') {
					bw.write("_");
				} else {
					bw.write(umgewandelterText);
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("Datei konnte nicht gefunden werden!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
