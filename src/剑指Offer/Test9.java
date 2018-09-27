package ½£Ö¸Offer;

import ½£Ö¸Offer.Test1.ListNode;

public class Test9 {
	public static void main(String[] args) {
		ListNode listNode0 = new ListNode(0);
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		ListNode listNode4 = new ListNode(4);
		ListNode listNode5 = new ListNode(5);
		
		listNode0.next = listNode1;
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = listNode5;
		
		ListNode node = ReverseList(listNode0);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
		
	}
	
	public static ListNode ReverseList(ListNode head) {
		if(head == null) return null;
		
		ListNode fir = new ListNode(0);
		fir.next = null;
		ListNode node;

		while (head != null) {
			node = head;
			node = node.next;
			head.next = fir.next;
			fir.next = head;
			
			head = node;
		}
		
		return fir.next;
    }
	
	public static class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
  }
}
