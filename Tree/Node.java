package Tree;

public class Node {
	
	private String data;
	private Node left, right, parent;
	
	public Node(String d, Node p) {
		data = d;
		parent = p;
		left = null;
		right = null;
	}
	
	String getData() {
		return data;
	}
	
	public void setChildren(Node l, Node r) {
		left = l;
		right = r;
	}
	
	public void setFather(Node f) {
		parent = f;
	}
	
	public void setData(String s) {
		data = s;
	}
	
	public Node getLeft() {
		return left;
	}
	
	public Node getRight() {
		return right;
	}

}
