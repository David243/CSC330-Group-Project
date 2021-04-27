package game;

public class BinaryTree
	{
		Node root;
		
		public BinaryTree(int x, Storage story)
		{
			root = new Node(x, story);
		}
		public BinaryTree()
		{
			root = null;
		}
		
		public void add(int value, Storage story) 
		{
		    root = addRecursive(root, value, story);
		}
		private Node addRecursive(Node current, int value, Storage story) 
		{
		    if (current == null) 
		    {
		        return new Node(value, story);
		    }

		    if (value < current.key) 
		    {
		        current.left = addRecursive(current.left, value, story);
		    } 
		    else if (value > current.key) 
		    {
		        current.right = addRecursive(current.right, value, story);
		    } 
		    else 
		    {
		        // value already exists
		        return current;
		    }

		    return current;
		}
	}

class Node
{
	int key;
	String story;
	String leLabel, rLabel;
	Node left, right;
	public Node(int x, Storage story) 
	{
		key = x;
		this.story = story.story;
		left = right = null;
		leLabel = story.lText;
		rLabel = story.rText;
	}
	public boolean isLeaf() {
		if(this.left == null && this.right == null) 
			return true;
		else 
			return false;
	}
}
