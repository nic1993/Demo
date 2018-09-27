package 剑指Offer;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * @author supercomputer
 *
 */
public class Test8 {

	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		FindKthToTail(head, 6);
	}
	
	public static ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k < 0) return null;
        
        ListNode pre = head;
        ListNode last = head;
        for(int i = 1;i < k;i++) {
        	if(pre.next != null) {
        		pre = pre.next;
        	}else {
				return null;
			}
        		
        }

        while (pre.next != null) {
			pre = pre.next;
			last = last.next;
		}
		return last;
    }
	
	public static class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
}
