package game;

public class BinaryTree
	{
		Node root;
		
		public BinaryTree(int x, String story)
		{
			root = new Node(x, story);
		}
		public BinaryTree()
		{
			root = null;
		}
		
		public void add(int value, String story) 
		{
		    root = addRecursive(root, value, story);
		}
		private Node addRecursive(Node current, int value, String story) 
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
		public void traversal() 
		{
			if(root!=null) 
			{
				traverseRecursive(root);
				System.out.println();
			}
		}
		
		private void traverseRecursive(Node current) //INORDER
		{
			Node next;
			if(current.left != null) 
			{
				next = current.left;
				traverseRecursive(next);
			}
			
			System.out.print(current.key + " ");
			
			if(current.right != null) 
			{
				next = current.right;
				traverseRecursive(next);
			}
		}
	}

class Node
{
	int key;
	String story;
	Node left, right;
	public Node(int x, String story) 
	{
		key = x; 
		this.story = story;
		left = right = null;
	}
	public boolean isaLeaf()
	{
		if(this.right == null && this.left == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
