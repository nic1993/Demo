package CYK;

public class Test65 {
	public static void main(String[] args) {
		ListNode fir = new ListNode(1);
		ListNode sec = new ListNode(2);
		ListNode thr = new ListNode(2);
		ListNode four = new ListNode(2);
		fir.next = sec;
		sec.next = thr;
		thr.next = four;
		System.out.println(chkPalindrome(fir));
		
	}

	public static boolean chkPalindrome(ListNode A) {
        // write code here
		ListNode fast = A;
		ListNode slow = A;
		ListNode temp;
		ListNode cur;
		while (fast.next != null) {
			temp = slow;
			slow = slow.next;
			fast.next = fast.next;
			if(fast.next != null)
				fast = fast.next;
		}
        if(slow == A) return true;
		
		cur = slow.next;
		while (cur != null) {
			temp = cur.next;
			cur.next = slow;
			slow = cur;
			cur = temp;
		}
		
		while (A != null && slow != null) {
			if(A.val == slow.val) {
				A = A.next;
				slow = slow.next;
			}else {
				return false;
			}
		}
		
		return true;
    }
	
	public static class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
}

