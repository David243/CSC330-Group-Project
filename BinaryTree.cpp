package game;

public class game{
	
	public static class Node{
	int key;
	Node left, right;
		public Node(int x) { key = x; left = right = null;}
	}
	
	public static class binaryTree implements Runnable{
		Node root;
		public binaryTree(int x){root = new Node(x);}
		public binaryTree(){root = null;}
		
		public void add(int value) {
		    root = addRecursive(root, value);
		}
		private Node addRecursive(Node current, int value) {
		    if (current == null) {
		        return new Node(value);
		    }

		    if (value < current.key) {
		        current.left = addRecursive(current.left, value);
		    } else if (value > current.key) {
		        current.right = addRecursive(current.right, value);
		    } else {
		        // value already exists
		        return current;
		    }

		    return current;
		}
		
		public void Traversal() {
			if(root==null) {
				System.out.println("error");
			}else{
				RecursiveTravers(root);
				System.out.println();
			}
		}
		
		private void RecursiveTravers(Node current) {
			Node next;
			if(current.left != null) {
				next = current.left;
				RecursiveTravers(next);
			}
			System.out.print(current.key+" ");
			if(current.right != null) {
				next = current.right;
				RecursiveTravers(next);
			}
		}
		
		
		@Override
		public void run() {}
		
	}
			
	

	public static void main(String[] args) {
		binaryTree bt = new binaryTree();
		bt.Traversal();
	    bt.add(6);
	    bt.Traversal();
	    bt.add(10);
	    bt.Traversal();
	    bt.add(12);
	    bt.Traversal();
	    bt.add(3);
	    bt.Traversal();
	    bt.add(57);
	    bt.Traversal();
	    bt.add(17);
	    bt.Traversal();
	    bt.add(9);
	    bt.Traversal();
	    
	}
} 
