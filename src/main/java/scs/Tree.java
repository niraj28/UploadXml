package scs;

public class Tree {
	
	 NodeData root;

	  Tree() {
	  root = null;

}
	  
	  void preorder(NodeData node) {
		    if (node == null)
		      return;

		    // traverse the root node
		    System.out.print(node.item + "->");
		    // traverse the left child
		    preorder(node.left);
		    // traverse the right child
		    preorder(node.right);
		  }
	  
}
