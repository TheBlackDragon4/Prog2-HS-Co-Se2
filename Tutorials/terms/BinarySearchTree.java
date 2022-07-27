package terms;

public class BinarySearchTree
{
	protected boolean empty;
	protected int key;
	protected BinarySearchTree leftChild;
	protected BinarySearchTree rightChild;

	public BinarySearchTree()
	{
		empty = true;
		key = 0;
		leftChild = null;
		rightChild = null;
	}

	public BinarySearchTree(int key)
	{
		empty = false;
		this.key = key;
		leftChild = null;
		rightChild = null;
	}

	public boolean isEmpty()
	{
		return empty;
	}

	public void insert(int key)
	{
		if (empty)
		{
			this.key = key;
			empty = false;
		}
		else if (key < this.key)
			insertLeft(key);
		else if (key > this.key)
			insertRight(key);
	}

	private void insertLeft(int key)
	{
		if (leftChild == null)
			leftChild = new BinarySearchTree(key);
		else
			leftChild.insert(key);
	}

	private void insertRight(int key)
	{
		if (rightChild == null)
			rightChild = new BinarySearchTree(key);
		else
			rightChild.insert(key);
	}

	public boolean search(int key)
	{
		if (empty)
			return false;
		else if (key == this.key)
			return true;
		else if (key > this.key)
			return searchRight(key);
		else if (key < this.key)
			return searchLeft(key);

		return false;
	}

	private boolean searchRight(int key)
	{
		if (rightChild == null)
			return false;
		else
			return rightChild.search(key);
	}

	private boolean searchLeft(int key)
	{
		if (leftChild == null)
			return false;
		else
			return leftChild.search(key);
	}

	public int height()
	{
		if (empty)
			return 0;
		else
			return heightHelp(0);
	}

	private int heightHelp(int n)
	{
		int right = 0;
		int left = 0;
		if (leftChild == null && rightChild == null)
			return n;
		if (leftChild != null)
			left = leftChild.heightHelp(n + 1);
		if (rightChild != null)
			right = rightChild.heightHelp(n + 1);
		if (left > right)
			return left;
		else
			return right;
	}

//	@Override
	public String toString2()
	{
		if (empty)
			return "Tree is empty";

		StringBuilder sb = new StringBuilder();

		if (leftChild != null)
			sb.append(leftChild.toString2());

		sb.append(" ");
		sb.append(key);

		if (rightChild != null)
			sb.append(rightChild.toString2());

		return sb.toString();
	}

	@Override
	public String toString()
	{
		if (empty)
			return "Tree is empty";

		StringBuilder sb = new StringBuilder();
		sb.append("[ ");
		sb.append(key + " ");
		if (leftChild != null)
			sb.append("<" + leftChild);
		if (rightChild != null)
			sb.append(">" + rightChild);
		sb.append("] ");
		return sb.toString();
	}
}
