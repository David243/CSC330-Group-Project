package game;

public class game{
	
	public static class Node
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
	}
	
	public static class binaryTree implements Runnable
	{
		Node root;
		
		public binaryTree(int x, String story)
		{
			root = new Node(x, story);
		}
		public binaryTree()
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
		
		private void traverseRecursive(Node current) 
		{
			Node next;
			if(current.left != null) 
			{
				next = current.left;
				traverseRecursive(next);
			}
			
			System.out.print(current.key + current.story + " ");
			
			if(current.right != null) 
			{
				next = current.right;
				traverseRecursive(next);
			}
		}
		
		
		@Override
		public void run() {}
		
	}
			
	

	public static void main(String[] args) {
		binaryTree bt = new binaryTree();
		bt.traversal();
	    bt.add(6, "B");
	    bt.traversal();
	    bt.add(10, "D");
	    bt.traversal();
	    bt.add(12, "E");
	    bt.traversal();
	    bt.add(3, "A");
	    bt.traversal();
	    bt.add(57, "G");
	    bt.traversal();
	    bt.add(17, "F");
	    bt.traversal();
	    bt.add(9, "C");
	    bt.traversal();
	    
	}
} 
