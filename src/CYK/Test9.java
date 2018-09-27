package CYK;
/**
 Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * @author supercomputer
 */
public class Test9 {

	 public Object reorderList(ListNode head) {
		 ListNode fast = head;
		 ListNode slow = head;
		 while(fast.next != null && fast.next.next != null){
			 fast = fast.next.next;
			 slow = slow.next;
			 if(fast == slow || slow.next == fast){
				 return true;	
			 }
		 }
		 return null;
	 }
}
