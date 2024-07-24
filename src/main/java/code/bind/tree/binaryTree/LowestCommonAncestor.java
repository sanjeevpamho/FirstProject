package code.bind.tree.binaryTree;


//https://www.youtube.com/watch?v=nMGph_Lt0ls
public class LowestCommonAncestor {
	Node root;
	
	public static void main(String[] args) {
		LowestCommonAncestor tree = new LowestCommonAncestor();
		tree.root= new Node(16);
		tree.root.left = new Node(7);
		tree.root.right = new Node(12);
		tree.root.left.left = new Node(6);
		tree.root.left.right = new Node(14);
		tree.root.left.right.right = new Node(9);
		tree.root.left.right.right.left = new Node(1);
		tree.root.left.left.left = new Node(5);
		tree.root.left.left.left.left = new Node(2);
		tree.root.left.left.left.right = new Node(4);
		tree.root.left.left.left.left = new Node(3);
		tree.root.left.left.left.right.right = new Node(8);
		tree.root.left.left.left.right.right.left = new Node(10);
		
	//	System.out.println(tree.findLCA( 8,9).data);
		System.out.println(tree.findLCA( 16,7).data);
	}
	Node findLCA(int n1, int n2)
    {
        return findLCA(root, n1, n2);
    }
	
	Node findLCA(Node root, int n1, int n2) {
		if(root == null) return null;
		if(root.data == n1 || root.data == n2) {
			return root;
		}
		Node leftLCA = findLCA(root.left, n1, n2);
		Node rightLCA = findLCA(root.right, n1, n2);
		
		if(leftLCA != null && rightLCA !=null) {
			return root;
		}
		if(leftLCA !=null) {
			return leftLCA;
		}
		else 
			return rightLCA;
	}

}
