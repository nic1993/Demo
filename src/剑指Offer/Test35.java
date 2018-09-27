package ½£Ö¸Offer;

import ½£Ö¸Offer.Test1.ListNode;

public class Test35 {

	public static void main(String[] args) {
		ListNode listNode0 = new ListNode(1);
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		ListNode listNode4 = new ListNode(3);
		ListNode listNode5 = new ListNode(4);
		ListNode listNode6 = new ListNode(5);
		ListNode listNode7 = new ListNode(5);
		
		listNode0.next = listNode1;
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = listNode5;
		listNode5.next = listNode6;
		listNode6.next = listNode7;
		
		new Test35().deleteDuplication(listNode0);
	}
	
	
	
	public ListNode deleteDuplication(ListNode pHead)
    {
		if(pHead == null || pHead.next == null) return pHead;
		while (pHead.val == pHead.next.val) {
			pHead = prepare(pHead);
			if(pHead == null || pHead.next == null) return pHead;
		}
        
		ListNode fir = pHead;
        ListNode cur = pHead.next;
		while (cur != null) {
			 cur = prepare(cur);
			 if(cur == null) {
				 fir.next = cur;
				 return pHead;
			 }
			 fir.next = cur;
			 cur = cur.next;
			 fir = fir.next;
		}
		
		return pHead;

    }
	
	public ListNode prepare(ListNode pHead) {
		boolean flag = false;
		while (pHead.next != null && pHead.val == pHead.next.val) {
			pHead = pHead.next;
			flag = true;
		}
		if(flag) {
			pHead = pHead.next;
			if(pHead != null) {
				pHead = prepare(pHead);
			}else {
				return pHead;
			}
		}
		return pHead;
	}
}
