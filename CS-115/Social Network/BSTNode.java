public class BSTNode {
	protected Profile data;
	protected BSTNode l;
	protected BSTNode r;
	
	public Profile getProfile() {
		return this.data;
	}
	
	public BSTNode(Profile data) {
		this.data = data;
	}
	
	
	public String toString() {
		return "BSTNode [data=" + data + ", l=" + l + ", r=" + r + ", getProfile()=" + getProfile() + ", getLeft()="
				+ ", getL()=" + getLeft()
				+ ", getR()=" + getRight() + "]";
	}

	public BSTNode getLeft() {
		return this.l;
	}

	public void setLeft(BSTNode l) {
		this.l = l;
	}

	public BSTNode getRight() {
		return this.r;
	}

	public void setRight(BSTNode r) {
		this.r = r;
	}
	
}
