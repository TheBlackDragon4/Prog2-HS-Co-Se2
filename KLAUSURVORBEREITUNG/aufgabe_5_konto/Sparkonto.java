package aufgabe_5_konto;

public class Sparkonto extends Konto {

	public Sparkonto(int kontoStand) throws KontoException {
		super(kontoStand);
		if (kontoStand <= 0) { // Sparkonten dürfen in diesem Fall nur im Haben sein
			throw new KontoException(" ");
		}
	}

	public void auszahlen(int betrag) throws KontoException {
		if ((this.kontoStand - betrag) < 0) {
			throw new KontoException(" ");
		} else {
			super.auszahlen(betrag);
		}
	}

	public String toString() {
		return super.toString() + " ";
	}

	public static void main(String[] args) {

		try {
			Sparkonto sk = new Sparkonto(1000);
			
			sk.einzahlen(1000);
			System.out.println(sk.toString());
		} catch (KontoException e) {
			
		}

	}

}
