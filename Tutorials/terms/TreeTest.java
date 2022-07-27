package terms;

public class TreeTest
{

	public static void main(String[] args)
	{
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(5);
		tree.insert(20);
		tree.insert(8);
		tree.insert(10);
		tree.insert(9);
		tree.insert(12);
		tree.insert(7);
		tree.insert(22);
		tree.insert(3);
		tree.insert(14);
		tree.insert(4);
		tree.insert(13);
		tree.insert(6);
		System.out.println(tree);
		System.out.println(tree.toString2());
		System.out.println(tree.height());
	}

}
