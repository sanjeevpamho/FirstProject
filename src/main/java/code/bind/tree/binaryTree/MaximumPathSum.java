package code.bind.tree.binaryTree;

class Result {
	int ans;
}

public class MaximumPathSum {
	Node root;

	public static void main(String[] args) {
		MaximumPathSum tree = new MaximumPathSum();
		tree.root = new Node(10);
		tree.root.left = new Node(2);
		tree.root.right = new Node(12);
		tree.root.left.left = new Node(20);
		tree.root.left.right = new Node(1);
		tree.root.right.right = new Node(-25);
		tree.root.right.right.left = new Node(3);
		tree.root.right.right.right = new Node(4);

		// Function call
		System.out.println("maximum path sum is : " + tree.findMaxSum(tree.root));
	}

	public int findMaxSum(Node root) {
		Result res = new Result();
		res.ans = Integer.MIN_VALUE;
		findMaxUtil(root, res);
		return res.ans;
	}

	public int findMaxUtil(Node root, Result res) {
		if (root == null)
			return 0;

		int leftSum = findMaxUtil(root.left, res);
		int rightSum = findMaxUtil(root.right, res);

		int straightPath = Math.max(Math.max(leftSum + root.data, rightSum + root.data), root.data);
		int curvedPath = leftSum + rightSum + root.data;

		res.ans = Math.max(res.ans, Math.max(straightPath, curvedPath));

		return straightPath;
	}
}
