package uebung_8_6_BibliothekMitLambdas;

public class Buch implements Comparable<Buch> {

	private String author;
	private String isbn;
	private String titel;

	public Buch(String author, String isbn, String titel) {
		this.author = author;
		this.isbn = isbn;
		this.titel = titel;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setISBN(String isbn) {
		this.isbn = isbn;
	}

	public String getISBN() {
		return isbn;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getTitel() {
		return titel;
	}

	public int compareTo(Buch o) {
		return this.author.compareTo(o.getAuthor());
	}

	public String toString() {
//		return "\n" + author + "\"" + titel + "\"" + isbn;
		return "\n" + String.format("%-22s", author) + String.format(" \"%-15s\"", titel) + String.format("%15s", isbn);
	}

}
