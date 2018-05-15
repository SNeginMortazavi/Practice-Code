package deleteNodeLinkedList;

public class ListNode {
	private int data;
	private ListNode nextNode;
	
	public ListNode(int data){
		this.data = data;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public void setNextNode(ListNode node){
		this.nextNode = node;
	}
	
	public int getData(){
		return this.data;
	}
	
	public ListNode getNextNode(){
		return this.nextNode;
	}
}
