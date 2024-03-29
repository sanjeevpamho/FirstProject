package code.bind.tree.binaryTree;

import java.util.HashMap;

//https://www.youtube.com/watch?v=DBxCv9NpPYM

public class MaximumPathSumNotAdjacent {
	Node root;

	public static void main(String[] args) {
		MaximumPathSumNotAdjacent tree = new MaximumPathSumNotAdjacent();
		tree.root = new Node(10);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(5);
		tree.root.left.right = new Node(11);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(4);
		tree.root.left.left.right = new Node(14);
		tree.root.right.left.left = new Node(8);
		tree.root.right.left.right = new Node(12);
		tree.root.right.right.right = new Node(9);
		tree.root.left.left.right.left = new Node(7);
		tree.root.left.left.right.right = new Node(1);
		getMaxSum(tree.root);
	}

	private static void getMaxSum(Node root) {
		HashMap<Node, Integer> hm = new HashMap<Node, Integer>();
		int maxSum = getMaxSumUtil(root, hm);
		System.out.println("Max Sum : " + maxSum);
	}

	private static int getMaxSumUtil(Node root, HashMap<Node, Integer> hm) {
		if (root == null)
			return 0;

		if (hm.containsKey(root))
			return hm.get(root);

		//Case 1 sum with node
		int sumWithNode = root.data;
		//call grand children
		if (root.left != null) {
			sumWithNode += getMaxSumUtil(root.left.left, hm);
			sumWithNode += getMaxSumUtil(root.left.right, hm);
		}
		if (root.right != null) {
			sumWithNode += getMaxSumUtil(root.right.left, hm);
			sumWithNode += getMaxSumUtil(root.right.right, hm);
		}

		//Case 2 sum without node
		//Call your children
		int sumWithoutNode = getMaxSumUtil(root.left, hm) + getMaxSumUtil(root.right, hm);

		int max = Math.max(sumWithNode, sumWithoutNode);
		hm.put(root, max);

		return max;
	}
}
