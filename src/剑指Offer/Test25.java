package ½£Ö¸Offer;

public class Test25 {
	public static void main(String[] args) {
		ListNode node0 = new ListNode(0);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3); 
		node0.next = node1;
		node1.next = node2;
		node2.next = node3;
		
		ListNode node4 = new ListNode(1);
		ListNode node5 = new ListNode(2);
		ListNode node6 = new ListNode(3);
		ListNode node7 = new ListNode(4);
		node4.next = node5;
		node5.next = node6;
		node6.next = node1;
		
		new Test25().FindFirstCommonNode(node0, node4);
	}

	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		 ListNode p1 = pHead1;
		 ListNode p2 = pHead2;
		 while (p1 != p2) {
			p1 = (p1 == null ? pHead2 : p1.next);
			p2 = (p2 == null ? pHead1 : p2.next);
		}
		 return p1;
    }
	
}

 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
 }
