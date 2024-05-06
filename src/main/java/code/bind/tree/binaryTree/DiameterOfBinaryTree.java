package code.bind.tree.binaryTree;

//https://www.geeksforgeeks.org/diameter-of-a-binary-tree/
public class DiameterOfBinaryTree {
	Node root;

	public static void main(String[] args) {
		DiameterOfBinaryTree tree= new DiameterOfBinaryTree();
		 tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	 
	        System.out.println("The diameter of given binary tree is : " + tree.diameter(tree.root));
	}

	public int diameter(Node root) {
       if(root==null) return 0;

       int lHeight = height(root.left);
       int rHeight = height(root.right);
       
       int ldiameter = diameter(root.left);
       int rdiameter = diameter(root.right);
       
       return Math.max(1+lHeight+rHeight, Math.max(ldiameter, rdiameter));
       
		
	}

	public int height(Node node) {
		if (node == null)
			return 0;
		/*
		 * int lheight = 1 + height(node.left); int rheight = 1 + height(node.right);
		 * 
		 * if(lheight>rheight) return lheight; return rheight;
		 */
		return (1 + Math.max(height(node.left), height(node.right)));
	}

}
