package code.bind.tree.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopView {
	SpecialNode root;

	public static void main(String[] args) {

		TopView tree = new TopView();
		tree.root = new SpecialNode(1);
		tree.root.left = new SpecialNode(2);
		tree.root.right = new SpecialNode(3);
		tree.root.left.left = new SpecialNode(4);
		tree.root.left.right = new SpecialNode(5);
		tree.root.right.left = new SpecialNode(6);
		tree.root.right.right = new SpecialNode(7);
		tree.root.right.left.right = new SpecialNode(8);
		tree.root.right.right.right = new SpecialNode(9);
		
		tree.topView(tree.root);
	}

	public void topView(SpecialNode root) {
		if (root == null)
			return;
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		Queue<SpecialNode> queue = new LinkedList<SpecialNode>();
		root.hd = 0;
		queue.add(root);
		while(!queue.isEmpty()) {
			SpecialNode temp=queue.poll();
			int hd=temp.hd;
			
			if(!map.containsKey(temp.hd)) {
				map.put(hd, temp.data);
			}
			
			if(temp.left != null) {
				temp.left.hd=hd-1;
				queue.add(temp.left);
			}
			if(temp.right != null) {
				temp.right.hd=hd+1;
				queue.add(temp.right);
			}
			
		}
		System.out.println("Top View");
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}