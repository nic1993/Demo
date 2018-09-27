package CYK;
/**
 * Sort a linked list using insertion sort.
 * @author supercomputer
 *
 */
public class Test7 {

	public void insertSort(ListNode head){
		ListNode pre = head;
		ListNode fir = head;
		ListNode sec = head.next;
		while (sec.next != null ) {
			while (fir != sec) {
				if(fir.val > sec.val){
					if(fir == head){
						sec.next = fir;
					}else {
						pre.next = sec;
					    sec.next = fir;
					}
					break;
				}else {
					if(fir != head) pre = pre.next;
					fir = fir.next;
				}
				
			}
			fir = head;
			pre = head;
			sec = sec.next;
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
}
