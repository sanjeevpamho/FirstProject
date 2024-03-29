package code.bind.tree.binaryTree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class VerticalOrderTraversal {
	public static void main(String[] args) {
		SpecialNode root = new SpecialNode(1);
		root.left = new SpecialNode(2);
		root.right = new SpecialNode(3);
		root.left.left = new SpecialNode(4);
		root.left.right = new SpecialNode(5);
		root.right.left = new SpecialNode(6);
		root.right.right = new SpecialNode(7);
		root.right.left.right = new SpecialNode(8);
		root.right.right.right = new SpecialNode(9);
		verticalOrderTraversal(root);
	}

	public static void verticalOrderTraversal(SpecialNode root) {
		if (root == null)
			return;
		Map<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
		Queue<SpecialNode> queue = new LinkedList<SpecialNode>();
		root.hd = 0;
		queue.add(root);
		while (!queue.isEmpty()) {
			SpecialNode temp = queue.poll();
			int hd = temp.hd;
			ArrayList<Integer> list;
			if (map.containsKey(hd)) {
				list = map.get(hd);
				list.add(temp.data);
			} else {
				list = new ArrayList<Integer>();
				list.add(temp.data);
			}
			map.put(temp.hd, list);
			if (temp.left != null) {
				temp.left.hd = hd - 1;
				queue.add(temp.left);
			}
			if (temp.right != null) {
				temp.right.hd = hd + 1;
				queue.add(temp.right);
			}

		}
		
		Set<Map.Entry<Integer,ArrayList<Integer>>> set = map.entrySet();
		for(Map.Entry<Integer, ArrayList<Integer>> entry: set) {
			System.out.println(entry.getKey()+"::"+entry.getValue());
		}
	}
}
