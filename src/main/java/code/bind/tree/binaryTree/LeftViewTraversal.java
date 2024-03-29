package code.bind.tree.binaryTree;

public class LeftViewTraversal {
	Node root;
	static int max_level = 0;

	public static void main(String args[]) {
		/* creating a binary tree and entering the nodes */
		LeftViewTraversal tree = new LeftViewTraversal();
		tree.root = new Node(10);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(7);
		tree.root.left.right = new Node(8);
		tree.root.right.right = new Node(15);
		tree.root.right.left = new Node(12);
		tree.root.right.right.left = new Node(14);

		tree.leftView();
	}

	public void leftView() {
		leftViewUtil(root, 1);

	}

	public void leftViewUtil(Node root, int currentLevel) {
		if (root == null)
			return;

		if (max_level < currentLevel) {
			System.out.println(root.data);
			max_level = currentLevel;
		}
		leftViewUtil(root.left, currentLevel + 1);
		leftViewUtil(root.right, currentLevel + 1);

	}
}
