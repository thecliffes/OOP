public class BST {
	protected BSTNode root;
	
	public BST() {
		
	}
	
	public void addProfile(Profile p) {
		BSTNode profile = new BSTNode(p);
		if(root == null) {
			root = profile;
		}
		else {
			root = sort(profile, root);
		}
	}
	
	public void printAlphabeticalASC() {
		inOrder(root);
	}
	
	public BSTNode getRoot() {
		return this.root;
	}
	
	public void inOrder(BSTNode root) {
		if(root != null) {
			inOrder(root.getLeft());
			System.out.println(root.getProfile().getFname());
			inOrder(root.getRight());
		}
	}
		
	public BSTNode sort(BSTNode node, BSTNode root) {
		if(root == null) {
			return node;
		}
		else if(root.getProfile().getFname().compareTo(node.getProfile().getFname()) < 0) {
			root.setRight(sort(node,root.getRight()));
		} 
			
		else if (root.getProfile().getFname().compareTo(node.getProfile().getFname()) > 0) {
			root.setLeft(sort(node,root.getLeft()));
		}
		else {
			return root;
		}
		return root;
	}
}
