package LeetCode;

public class Le24 {
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		
		ListNode node2 = new ListNode(2);
		
		ListNode node3 = new ListNode(3);
		
		ListNode node4 = new ListNode(4);
		
		node1.next = node2;
		
		node2.next = node3;
		
		node3.next = node4;
		
		ListNode head = new Le24().swapPairs(node1);
		
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}

    public ListNode swapPairs(ListNode head) {
    	if(head == null || head.next == null) return head;
    	
        ListNode pre = head;
        ListNode cur = head;
        ListNode next = head.next;
        head = next;
        
        boolean first = true;
        while (cur != null && next != null) {
        	cur.next = next.next;
        	
			next.next = cur;
			
			if(first == false)
			pre.next = next;
			
			first = false;
			
			pre = cur;
			
			cur = cur.next;
			
			if(cur == null) break;
			
			next = cur.next;
			
			if(next == null) break;
		}
        
        return head;
    }
    
    static class ListNode {
	     int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
}

