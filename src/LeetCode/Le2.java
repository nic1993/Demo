package LeetCode;

public class Le2 {
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(0);
//		ListNode node2 = new ListNode(9);
//		ListNode node3 = new ListNode(3);
		
//		l1.next = node2;
//		node2.next = node3;
		
		ListNode l2 = new ListNode(2);
		ListNode node4 = new ListNode(7);
		ListNode node5 = new ListNode(8);
		
		l2.next = node4;
		node4.next = node5;
		
		addTwoNumbers(l1, l2);
	}

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {	
    	int pre = 0;
    	ListNode fir = l1;
    	
    	ListNode preNode = null;
    	
    	while (l1 != null && l2 != null) {
			int num1 = l1.val;
			int num2 = l2.val;
			
			if(num1 + num2 + pre >= 10) {
				l1.val = (num1 + num2 + pre) % 10;
				
				pre = (num1 + num2 + pre) / 10;
			}else {
				l1.val = num1 + num2 + pre;
				
				pre = 0;
			}
			
			preNode = l1;
			
			l1 = l1.next;
			l2 = l2.next;
		}
    	
    	
    	if(l2 != null) {
    		l1 = preNode;
    		while (l2 != null) {
        		int num = l2.val;
        		
    			if(num + pre >= 10) {
    				l2.val = (num + pre) % 10;
    				
    				pre = (num + pre) / 10;

    			}else {
    				l2.val = num + pre;
    				
    				pre = 0;
    			}
    			l1.next = l2;
    			l1 = l1.next;
    			
    			l2 = l2.next;
    		}
    	}else {
    		while (l1 != null) {
        		
        		int num = l1.val;
        		
    			if(num + pre >= 10) {
    				l1.val = (num + pre) % 10;
    				
    				pre = (num + pre) / 10;
    			}else {
    				l1.val = num + pre;
    				
    				pre = 0;
    			}
    			
    			preNode = l1;
    			l1 = l1.next;
    		}
		}

    	if(pre != 0) {
    		ListNode last = new ListNode(pre);
    		
    		if(l1 == null) l1 = preNode;
    		l1.next = last;
    	}
    	
        return fir;
    }
}

 class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 }