
public class LinkedList<T extends Comparable<T>> implements List<T> {
	Node<T> root;
	int sizeCounter;
	
	@Override
	public void insert(T data) {
		this.sizeCounter++;
		Node<T> node = new Node<>(data);
		if(root == null){
			//LinkedList iLinkedList empty and node is the first node.
			root = node;
		}else{
			//insert data at beginning
			node.setNextNode(root);
			this.root = node;
		}
	}
	//insert after node
	public void insertEnd(T data, Node<T> node){
		if(node.getNextNode() != null){
			insertEnd(data, node.getNextNode());
		}else{
			Node<T> newNode = new Node<>(data);
			node.setNextNode(newNode);	
		}
	}

	@Override
	public void remove(T data) {
		if(root == null) return;
		//remove the first node
		--this.sizeCounter;
		if(root.getData().compareTo(data) == 0){
			this.root = this.root.getNextNode();
		}else{
			remove(data, root, root.getNextNode());
		}
	}
	
	//remove node
	public void remove(T data, Node<T> prevNode, Node<T> curNode) {
		while(curNode != null){
			if(curNode.getData().compareTo(data) == 0){
				prevNode.setNextNode(curNode.getNextNode());
				curNode = null;
				return;
			}
			prevNode = curNode;
			curNode = curNode.getNextNode();
		}
	}

	@Override
	public void traverseList() {
		if(this.root == null) return;
		Node<T> node = this.root;
		while(node != null){
			System.out.print(node + " ");
			node = node.getNextNode();
		}	
	}

	@Override
	public int size() {
		return this.sizeCounter;
	}
	

}
