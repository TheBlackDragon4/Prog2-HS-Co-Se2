package aufgabe_5_konto;

public class Kreditkonto extends Konto {

	public Kreditkonto(int kreditSumme) throws KontoException {
		super(-kreditSumme);

		if (kreditSumme <= 0) {
			throw new KontoException("Fehler Test");
		}
	}

	public void einzahlen(int betrag) throws KontoException {
		if ((this.kontoStand + betrag) > 0) {
			throw new KontoException(
					"Auf Kreditkonto darf über den ausstehenden Kredit nicht weiter eingezahlt werden");
		}
		super.einzahlen(betrag);
	}

	public void auszahlen() throws KontoException {
		throw new KontoException("Auszahlen aus Kreditkartenkonto nicht erlaubt");
	}

	public String toString() {
		return super.toString();
	}
	
	public static void main(String[] args) {
		
		try {
			Kreditkonto kk = new Kreditkonto(2000);
			
//			kk.auszahlen();
			kk.einzahlen(1500);
			System.out.println(kk.toString());
			
		} catch (KontoException e) {
			System.out.println(e.toString());
		}

		
	}

}
