package aufgabe_3_Schachbrett;

public class Brett {
	enum Farbe {
		BLAU, ROT
	}

	protected BrettFigur[][] brettFeld;
	private boolean blauAmZug = true;

	public Brett() {
		this.brettFeld = new BrettFigur[8][8];

		for (int i = 0; i < brettFeld.length; i += 2) {
			brettFeld[0][i] = new BrettFigurBlau();
		}
		for (int i = 1; i < brettFeld[0].length; i += 2) {
			brettFeld[7][i] = new BrettFigurRot();
		}

	}

	public void ziehen() {

		for (int i = 0; i < brettFeld.length; i++) {
			for (int j = 0; j < brettFeld[0].length; j++) {
				if (blauAmZug) {

				}

			}

		}

	}

	public void print() {

		for (int i = 0; i < brettFeld.length; i++) {
			for (int j = 0; j < brettFeld[0].length; j++) {
				if (brettFeld[i][j] == null) {
					System.out.print("+ ");
				} else {
					System.out.print(brettFeld[i][j] + " ");
				}

			}
			System.out.println();

		}
		System.out.println();

	}

}
