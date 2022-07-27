package rekursiveDatenstrukturen;

public class BinarySearchTree {

	protected boolean empty; // true, if tree is empty
	protected int key; // stored key
	protected BinarySearchTree leftChild; // pointer to left subtree
	protected BinarySearchTree rightChild; // pointer to right subtree

	// Erzeugt einen Leeren Baum -> Konstruktor
	public BinarySearchTree() {
		empty = true;
	}

	public BinarySearchTree(int key) {
		empty = false;
		this.key = key; // Neuer Knoten wird erstellt
		leftChild = null; // nicht notwendig, da standardmäßig auf NULL gesetzt
		rightChild = null; // nicht notwendig, da standardmäßig auf NULL gesetzt
	}

	public boolean empty() { // true, if tree is empty
		return empty;
	}

	public int key() { // stored key
		return key;
	}

	public BinarySearchTree leftChild() { // pointer to left subtree
		return leftChild;
	}

	public BinarySearchTree rightChild() { // pointer to right subtree
		return leftChild;
	}

	// Einfügen eines Schlüssels in einen Baum
	public void insert(int key) {
		if (empty) {
			this.key = key;
			empty = false;
		}

		// Schlüssel für Linkes Bein müssen kleiner sein als der Hauptknoten sein
		if (key < this.key) {
			if (leftChild == null) {
				leftChild = new BinarySearchTree(key); // Einfügen eines neuen Knoten
			} else {
				leftChild.insert(key); // befüllen des key an linken Seite
			}
		}

		// Schlüssel für Rechten Bein müssen größer sein als der Hauptknoten sein
		if (key > this.key) {
			if (rightChild == null) {
				rightChild = new BinarySearchTree(key);
			} else {
				rightChild.insert(key);
			}
		}
	}

	public Object search(int key) { // Wir wollen direkt auf die Daten zugreifen
		if (empty) {
			return false;
		}

		if (this.key == key) {
			return true;
		}

		// Schlüssel für Linkes Bein müssen kleiner sein als der Hauptknoten sein
		if (key < this.key) {
			if (leftChild == null) {
				return false;
			} else {
				return leftChild.search(key); // Rekursiver Aufruf von "search"
			}
		}

		// Schlüssel für Rechten Bein müssen größer sein als der Hauptknoten sein
		if (key > this.key) {
			if (rightChild == null) {
				return false;
			} else {
				return rightChild.search(key); // Rekursiver Aufruf von "search"
			}
		}

		return false;
	}

	public int height() {
		int heightRight = 0;
		int heightLeft = 0;

		if (empty) {
			return 0;
		}

		if (!empty) {

			if (leftChild != null) {
				heightLeft++;
				heightLeft += leftChild.height();
			}

			if (rightChild != null) {
				heightRight++;
				heightRight += rightChild.height();
			}

			if (heightLeft > heightRight) {
				return heightLeft;
			} else {
				return heightRight;
			}

		}
		return 0;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		if (!empty) {

			if (leftChild != null) {
				sb.append(leftChild.toString());
			}

			sb.append(" " + key);

			if (rightChild != null) {
				sb.append(rightChild.toString());
			}
		} else {
			sb.append("empty");
		}

		return sb.toString();
	}

}
