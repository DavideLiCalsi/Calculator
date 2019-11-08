package Tree;

public class BinaryTree {
	
	private Node root;
	
	public BinaryTree(Node r) {
		root.setFather(null);
		root.setChildren(null,null);
		root.setData(r.getData());
	}
	
	public void Insert( String s, Node father, char contr ) {
		Node toinsert = new Node(s,father);
		
		if( contr == 'l')
			father.setChildren(toinsert, father.getRight());
		
		if( contr == 'r')
			father.setChildren(father.getLeft(), toinsert);
	}

}
