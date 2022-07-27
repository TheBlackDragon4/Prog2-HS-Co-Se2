package uebung_5_2_Woertersammlung;

public class WordCollTest {

	public static void main(String[] args) {

		String[] sentences0 = { "" }; // erstes Wort soll leer sein
		String[] sentences1 = { "Hello" }; // zweite Eingabe soll aus einem Wort bestehen
		String[] sentences2 = {
				"Thomas Mann, der jüngere Bruder von Heinricht Mann (1871- 1950), war Sohn des Kaufmanns und Lübecker Senators Thomas Johann Heinrich Mann.",
				"Seine Mutter Julia (geborene da Silva-Bruhns) war mütterlicherseits brasilianischer Herkunft. Aus der Ehe ginge noch die Kinder " };

		WordColl wordColl0 = new WordColl(sentences0);
		System.out.println(wordColl0 + "\n");

		WordColl wordColl1 = new WordColl(sentences1);
		System.out.println(wordColl1 + "\n");

		WordColl wordColl2 = new WordColl(sentences2);
		System.out.println(wordColl2 + "\n");

	}

}
