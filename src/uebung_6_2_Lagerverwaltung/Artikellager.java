package uebung_6_2_Lagerverwaltung;

import uebung_6_2_Lagerverwaltung.Ort.LagerortIstVollException;

public class Artikellager<E extends Artikel> {

	protected Ort<E>[] orte;

	@SuppressWarnings("unchecked")
	public Artikellager(int anzahlOrte) {
		// Folgendes ist wie ein Array zu sehen
		orte = new Ort[anzahlOrte];

		for (int i = 0; i < anzahlOrte; i++) {
			// Aufruf des Konstruktors von Klasse "Ort"
			orte[i] = new Ort<E>(i); // Erstellung eines neuen Ortes f�r jedes Ortobjekt das ich in anzahl Ort
										// erstellt / mitgegeben habe
		}

	}

	public E auslagern(String artikelnummer) {

		Ort<E> ort = null;

		for (Ort<E> o : orte) {
			if (o.istBelegt()) {
				E elementE = o.getEingelagertesElement();
				if (elementE.artikelNummer().equals(artikelnummer)) {
					ort = o;
				}
			}
		}

		if (ort != null) {
			return ort.entnehmen();
		}

		return null;
	}

	public boolean einlagern(E e) {

		for (Ort<E> o : orte) {
			if (!o.istBelegt()) {
				try {
					o.hinzufuegen(e);
				} catch (LagerortIstVollException e1) {
					//e1.toString();
				}
				return true;
			}
		}
		return false;

	}

	public int bestandSuchen(String artikelnummer) {

		int bestand = 0;

		for (Ort<E> o : orte) {
			E e = o.getEingelagertesElement();
			if (e != null) { // Analog zu auslagern()
				// e.artikelNummer() geht, da Artikellager von Artikel erbt
				if (e.artikelNummer().equals(artikelnummer)) {
					bestand++;
				}
			}

		}

		// �quivalent zu dem oben beschriebenen
//		for (int i = 0; i < orte.length; i++) {
//			if (orte[i].equals(artikelnummer)) {
//				bestand++;
//			}
//		}
		return bestand;
	}

	public String toString() {
		return orte + " ";
	}

}
