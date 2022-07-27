package aufgabe_5_konto;

public class Konto {

	protected String kontoNummer = "10"; // eindeutig -> generiert + unveränderbar 7-Stellig
	protected int kontoStand;
	protected int oldKontoStand;

	public Konto() {
		this.kontoNummer = generiereKontoNummer(kontoNummer);
	}

	public Konto(int kontoStand) {
		this.kontoNummer = generiereKontoNummer(kontoNummer);
		this.kontoStand = kontoStand;
		this.oldKontoStand = 0;
	}

	public int getKontostand() {
		return kontoStand;
	}

	public String getKontonummer() {
		return kontoNummer;
	}

	public String generiereKontoNummer(String kontoNummer) {
		long nummerRandom = (long) (Math.random() * 99999);
		kontoNummer += nummerRandom;
		return kontoNummer;
	}

	public void einzahlen(int betrag) throws KontoException {
//		if (kontoStand < 0) {
//			throw new KontoException();
//		}
		oldKontoStand = kontoStand;
		kontoStand += betrag;
	}

	public void auszahlen(int betrag) throws KontoException {
		if (betrag < 0) {
			throw new KontoException();
		}		
		oldKontoStand = kontoStand;
		kontoStand -= betrag;
	}

	public void undoLastOpertion() {
		kontoStand = oldKontoStand;
	}

	public String toString() {
		return "Kontonummer: " + kontoNummer + " Kontostand: " + kontoStand;
	}

	public static void main(String[] args) {

		Konto k = new Konto();

		System.out.println(k.toString());
		
		
	}

}
