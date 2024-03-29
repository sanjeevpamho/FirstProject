package code.bind.tree.binaryTree;

public class SpecialNode {
   int data,hd;
   SpecialNode left,right;
   public SpecialNode(int data) {
	   this.data=data;
	   this.hd=Integer.MAX_VALUE;
	   this.left=this.right=null;
   }
}
