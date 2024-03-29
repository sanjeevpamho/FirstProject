package code.bind.tree.binaryTree;

import javax.lang.model.type.MirroredTypeException;

class Node {
	int data;
	Node left, right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class FoldableBinaryTree {
	Node root;

	public boolean isFoldable(Node node) {
		boolean res = false;
		if (node == null)
			return true;

		mirror(node.left);
		res = isStructSame(node.left, node.right);
		mirror(node.left);

		return res;
	}

	private boolean isStructSame(Node a, Node b) {
		if (a == null && b == null)
			return true;

		if (a != null && b != null 
				&& isStructSame(a.left, b.left) 
				&& isStructSame(a.right, b.right))
			return true;

		return false;
	}

	public void mirror(Node node) {
		if (node == null)
			return;

		mirror(node.left);
		mirror(node.right);

		Node temp = node.left;
		node.left = node.right;
		node.right = temp;

	}

	public static void main(String[] args) {
		FoldableBinaryTree tree = new FoldableBinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.right.left = new Node(4);
		tree.root.left.right = new Node(5);

		if (tree.isFoldable(tree.root))
			System.out.println("tree is foldable");
		else
			System.out.println("Tree is not foldable");
	}

}
