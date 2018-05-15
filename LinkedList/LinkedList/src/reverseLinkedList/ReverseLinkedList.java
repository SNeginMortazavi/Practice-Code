package reverseLinkedList;

public class ReverseLinkedList {
	private ListNode head;
	
	public ReverseLinkedList(ListNode node){
		this.head = node;
	}
    public ListNode reverseList() {
    	if(head == null) return null;
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
        	head = curr.nextListNode;
        	curr.nextListNode = prev;
        	prev = curr;
        	curr = head;
        }
        return prev;
    }
    
    public void traverse(ListNode head){
    	ListNode temp = head;
    	while(temp != null){
    		System.out.print(temp.val);
    		temp = temp.nextListNode;
    	}
    }
    public static void main(String[] args){
    	
    	ListNode node1 = new ListNode(1);
    	ListNode node2 = new ListNode(2);
    	ListNode node3 = new ListNode(3);
    	ListNode node4 = new ListNode(4);
    	ListNode node5 = new ListNode(5);
    	node1.nextListNode = node2;
    	node2.nextListNode = node3;
    	node3.nextListNode = node4;
    	node4.nextListNode = node5;
    	ReverseLinkedList app = new ReverseLinkedList(node1);

    	ListNode result = app.reverseList();
    	app.traverse(result);
    }
}
