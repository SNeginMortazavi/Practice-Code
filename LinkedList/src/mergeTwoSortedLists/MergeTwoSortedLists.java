package mergeTwoSortedLists;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode result = new ListNode(0);
        ListNode prev = result;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        if (l1 != null) {
            prev.next = l1;
        }
        if (l2 != null) {
            prev.next = l2;
        }
        return result.next;
    }
    
    public void travesre(ListNode result){
    	ListNode temp = result;
    	while(temp != null){
    		System.out.print(temp.val);
    		temp = temp.next;
    	}
    }
    public static void main(String[] args){
    	MergeTwoSortedLists app = new MergeTwoSortedLists();
    	ListNode n1 = new ListNode(1);
    	ListNode n2 = new ListNode(2);
    	ListNode n3 = new ListNode(4);
    	n1.next = n2;
    	n2.next = n3;
    	
    	ListNode m1 = new ListNode(1);
    	ListNode m2 = new ListNode(3);
    	ListNode m3 = new ListNode(4);
    	m1.next = m2;
    	m2.next = m3;
    	
    	ListNode result = app.mergeTwoLists(n1, m1);
    	app.travesre(result);
    }
}
