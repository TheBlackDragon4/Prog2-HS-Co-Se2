package aufgabe_5_konto;

public class Girokonto extends Konto {

	private int maxUeberziehung;

	public Girokonto(int kontostand, int maxUeberziehung) throws KontoException {
		super(kontostand);
//		if ((maxUeberziehung < 0) || ((kontostand < 0) && (kontostand < -maxUeberziehung))) {
		if ((maxUeberziehung < 0) || (kontostand < -maxUeberziehung)) {
			throw new KontoException(" ");
		}
		this.maxUeberziehung = maxUeberziehung;
	}

	public Girokonto() {
		super();
	}

	public void auszahlen(int betrag) throws KontoException {
		if ((this.kontoStand - betrag) < -maxUeberziehung) {
			throw new KontoException(" ");
		} else {
			super.auszahlen(betrag);
		}
	}

	public int getMaxUnterGrenze() {
		return maxUeberziehung;
	}

	public String toString() {
		return super.toString() + " Maximale Ueberziehung " + maxUeberziehung;
	}

}
