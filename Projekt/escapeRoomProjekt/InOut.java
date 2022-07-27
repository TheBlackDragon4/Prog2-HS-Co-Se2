package escapeRoomProjekt;

import java.util.Scanner;

public class InOut {

	// Instanzvariablen / Variablen werden in dieser Klasse nicht ben�tigt

	// Konstruktor
	// Hier ist nur der Standardkonstrukor notwendig
	public InOut() { // Nur der Default - Konstruktor
	}

	// Getter & Setter
	// Da wir keine Attribute haben ben�tigen wir auch keine Getter +
	// Setter

	// Methode
	// ------------------- game methode ----------------------
	// Diese Methode gibt die �berschrift des Programmes aus
	public void ueberschrift() {
		System.out.println("\t\t\t\tWillkommen bei unserem ESCAPE-ROOM");
		System.out.println(
				"\t\t\tvon Marvin Amberg, Erich Ehrenberger, Alexander Ultsch, \n\t\t\t  Cassandra Zirbs, Yavuzselim Taskin, Johannes Schuler");
	}

	// Diese Methode dient f�r die Ausgabe der Einleitung
	public void einleitung() {
		System.out.println(
				" \n Es war schon sp�t und du bist von der Bar nachhause gegangen. Auf dem Heimweg ist dir ein merkw�rdiger Mann \r\n"
						+ " aufgefallen, er verfolgte dich schon eine Weile und als du ihn darauf ansprechen wolltest und dich umgedreht\r\n"
						+ " hast wurde alles schwarz. Das n�chste an das du dich erinnerst, ist das du in einem dunklen raum aufwachst. \r\n"
						+ " Gef�sselt am Boden liegend, deine Kopfschmerzen lassen darauf schlie�en, dass der Mann dich mit einem stumpfen\r\n"
						+ " Objekt, wie einem Rohr, an der Schl�fe erwischt hat. Scheinbar hat dich jemand entf�hrt und gute Absichten\r\n"
						+ " scheint er nicht zu haben. Nach einiger Zeit der Selbstorierntierung h�rst du, wie ein Auto startet und \r\n"
						+ " wegf�hrt. Es f�llt dir nicht leicht, aber du schaffst es deine Fesseln zu l�sen. Doch wie kommst du jetzt \r\n"
						+ " hinaus? Es ist zu dunkel um viel zu erkennen, gl�cklicherweise findest du ein Zahlenschloss an der T�r. \r\n");
	}

	// Diese Methode erm�glicht es die Anzahl der R�tsel anzugeben / einzugeben
	public int anzahlRaetsel() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Geben Sie bitte die Anzahl der R�tsel an: "); 
		int anzahlRaetsel = sc.nextInt();
		return anzahlRaetsel;
	}

	// ------------------- riddle methode ----------------------
	// Information zur Story des ersten R�tsels
	public void raetselOneEinleitung() {
		System.out.println(
				"\n\n In der K�che findest du einen merkw�rdigen Zettel am K�hlschrank. Er scheint dort schon lange zu h�ngen, weshalb du ihn genauer anschaust.\r\n"
						+ " \"Hey Kumpel! Ich wei� du durchlebst gerade eine schwierige Zeit, aber wir stehen immer hinter dir. Genauso wie \r\n"
						+ " damals, als wir 200 Kilometer am St�ck gesprintet sind. Ja ich wei�, es waren eigentlich nur 5km oder 7km, trotzdem sind\r\n"
						+ " 4,5 Sekunden, eine unglaublich gute Zeit! Danach konntest du dich sicher 3 Tage lang nicht bewegen. \r\n"
						+ " Aber worauf ich eigentlich hinaus m�chte, merk dir, ich und die anderen -2.98 Kollegen, stehen immer hinter dir!\"\r\n\n"
						+ " Dir kommt das Ganze merkw�rdig vor und zerbrichst dir den Kopf, was diese seltsamen Zahlen in dem Text bedeuten. Pl�tzlich macht es \"klick\", in deinem Gehirn\r\n"
						+ " ist dir bewusst,dass es eine versteckte Nachricht sein muss. Aber was genau sollst du dir jetzt aufschreiben? \n");

	}

	// Information zur Story des zweiten R�tsels
	public void raetselTwoEinleitung() {
		System.out.println(
				"\n\n In dem was man vielleicht ein Wohnzimmer nennen kann, ist ein Regal voll mit VHS Kasseten. Du willst lieber\r\n"
						+ " nicht wissen, was darauf zu sehen ist, findest aber am unteren Ende des Schranks etwas Eingeritztes.\r\n"
						+ " Es ist schwer zu lesen, nur mit gro�er M�he kannst du es erkennen.\r\n"
						+ " \"Wie heist meine Oma?\" \r\n"
						+ " Definitiv ein Hinweis darauf, was das Passwort sein k�nnte. Nur 4 der Kasseten sind beschriftet, was das suchen nach dem Namen erleichtert.\r\n"
						+ " \n \"1. Felix spielt Poker\"\r\n" + " \"2. Meine Gro�tante pflegt ihre Mutter\"\r\n"
						+ " \"3. Gertrut b�ckt Brot\"\r\n" + " \"4. Meine Geschwister spielen mit ihrer Nichte\"\r\n"
						+ "\n Du hast nicht viel Zeit und musst dich f�r eine entscheiden. Welches der Tapes wird wohl am ehesten den Namen\r\n"
						+ " seiner Oma beeinhalten?\n");

	}

	// Information zur Story des dritten R�tsels
	public void raetselThreeEinleitung() {
		System.out.println(
				"\n\n Im Gang h�ngt ein Komisches Bild vom Zahlenschloss. Wer H�ngt sich soetwas auf? Wenn da kein Hinwei� f�r das\r\n"
						+ " Zahlenschloss ist wo dann? Auf dem Bild selbst findest du aber nichts ungew�hliches au�er ein kleines #.\r\n"
						+ " Du entscheidest dich, das Bild umzudrehen und findest auf der R�ckseite noch ein Bild. Diesmal \r\n"
						+ " deutlich simpler gehalten. \n\n");

		System.out.println("\t\t\t#+�^�+#\r\n" + "\t\t\t+oxoxo+\r\n" + "\t\t\t#xoxox#\r\n" + "\t\t\t+oxoxo+\r\n"
				+ "\t\t\t#+�^�+#");

		System.out.println(
				"\n\n was hat es damit auf sich? Der Code ist darin versteckt! Du �berlegst also angestrengt was die Antwort sein kann.");
	}

	// -------------- riddle methode interaction ----------------
	// Abfrage der entsprechenden Eingabeaufforderungen f�r R�tsel 1
	public double raetselOneAbfragen() {
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"\n Hinweis: Addiere die seltsamen Zahlen und beachte die Vorzeichen. Beachte Modulo (10) Operation des Endergebnisses.");

		System.out.print(" Erste merkw�rdige Zahl: ");
		int inputNumberOne = sc.nextInt();

		System.out.print(" Zweite merkw�rdige Zahl: ");
		double inputNumberTwo = sc.nextDouble();

		System.out.print(" Dritte merkw�rdige Zahl: ");
		double inputNumberThree = sc.nextDouble();

		return inputNumberOne + inputNumberTwo + inputNumberThree;
	}

	// Abfrage der entsprechenden Eingabeaufforderungen f�r R�tsel 2
	public int raetselTwoAbfragen() {
		Scanner sc = new Scanner(System.in);

		System.out.print(" Welche Nummer hat die richtige Kasette: ");
		int inputBuildingPosition = sc.nextInt();
		return inputBuildingPosition;
	}

	// Abfrage der entsprechenden Eingabeaufforderungen f�r R�tsel 3
	public int raetselThreeAbfragen() {
		Scanner sc = new Scanner(System.in);

		System.out.print(
				"\n Es h�ngt von der Anzahl der # ab! \n Du schreibst dir auf wie viele du siehst und sp�rst wie du weiter in Richtung Freiheit kommst: ");
		int inputAnzahl = sc.nextInt();
		return inputAnzahl;
	}

	// ------------------- escape room methode ----------------------
	// Methode f�r die Zwischensequenzen zwischen den einzelnen Random aufgerufenen
	// R�tseln
	public void zwischenSequenz(int indexRaetsel) {
		System.out.println("\n Nach deinem erfolgreich gel�sten R�tsel, erh�lst du einen Teilbereich an Position "
				+ indexRaetsel + " des Endpasswortes. ");
	}

	// ------------------- sonstiges ----------------------
	// F�r die Eingabe des Passwortes durch den Bediener
	public String abfragePW() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Bitte finales Passwort eingeben: ");
		String finalesPWUser = sc.nextLine();
		return finalesPWUser;
	}

	// Ausgabe des Information "Korrektes Passwort" nach Inhaltsgleichheitspr�fung
	// XX.equals(XX)
	public void korrektesPW() {
		System.out.println(" Das Passwort war korrekt!!!");
	}

	// toString
	// Eine toString Methode ist in diesem Fall nicht notwendig, da es sich in
	// dieser Klasse nur um einen Aufruf der Ausgaben bzw. der Eingaben handelt
}
