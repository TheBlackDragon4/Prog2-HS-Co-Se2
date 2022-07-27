package rekursiveDatenstrukturen;

public class BinarySearchTreeTest {

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(10);
		System.out.println("Tree 1\n" + tree + "\n");

		tree.insert(12);
		System.out.println("Tree 2\n" + tree + "\n");

		tree.insert(6);
		System.out.println("Tree 3\n" + tree + "\n");

		tree.insert(4);
		System.out.println("Tree 4\n" + tree + "\n");

		tree.insert(22);
		System.out.println("Tree 5\n" + tree + "\n");

		tree.insert(14);
		System.out.println("Tree 6\n" + tree + "\n");

		tree.insert(16);
		System.out.println("Tree 7\n" + tree + "\n");

		System.out.println("Search: " + tree.search(10));
		System.out.println("Search: " + tree.search(15));
		
		System.out.println("Height: " + tree.height());
		

	}

}
