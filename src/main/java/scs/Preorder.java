package scs;

public class Preorder{


	  

	  public static void main(String[] args) {
	    // create object of tree
	    Tree tree = new Tree();

	    // create nodes of the tree
	    tree.root = new NodeData(1);
	    tree.root.left = new NodeData(12);
	    tree.root.right = new NodeData(9);
	    tree.root.left.left = new NodeData(5);
	    tree.root.left.right = new NodeData(6);

	    // preorder tree traversal
	    System.out.println("\nPreorder traversal ");
	    tree.preorder(tree.root);
	  }
}
