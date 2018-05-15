package deleteNodeLinkedList;

public class DeleteNodeLinkedList {
	/**
	 * time complexity: O(1)
	 * @param node
	 */
    public void deleteNode(ListNode node) {
        if(node.getNextNode() == null) return;
        node.setData(node.getNextNode().getData());
        node.setNextNode(node.getNextNode().getNextNode());
    }
    public static void main(String[] args){
    	DeleteNodeLinkedList app = new DeleteNodeLinkedList();
    	ListNode n1 = new ListNode(1);
    	ListNode n2 = new ListNode(2);
    	ListNode n3 = new ListNode(3);
    	ListNode n4 = new ListNode(4);
    	n1.setNextNode(n2);
    	n2.setNextNode(n3);
    	n3.setNextNode(n4);
    	
    	app.deleteNode(n2);
    	ListNode temp = n1;
    	while(temp != null){
    		System.out.print(temp.getData());
    		temp = temp.getNextNode();
    	}
    	
    	
    }
}
