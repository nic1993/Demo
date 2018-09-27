package CYK;

public class Test6 {

	public ListNode sortList(ListNode head) {
		if(head == null && head.next == null){
			return head;
		}
		ListNode fast = head,slow = head;
		while (fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		fast = slow;
		slow = slow.next;
		fast.next = null;
		fast = sortList(fast);
		slow = sortList(slow);
		return fast;
	}
}
 class ListNode { 
     int val; 
     ListNode next; 
     ListNode(int x) { 
         val = x; 
         next = null; 
     } 
 } 