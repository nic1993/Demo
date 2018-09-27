package 剑指Offer;

import java.util.ArrayList;
/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * @author supercomputer
 *
 */
public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		ListNode listNode0 = new ListNode(67);
		ListNode listNode1 = new ListNode(0);
		ListNode listNode2 = new ListNode(24);
		ListNode listNode3 = new ListNode(56);
		ListNode listNode4 = new ListNode(4);
		ListNode listNode5 = new ListNode(5);
		
		listNode0.next = listNode1;
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = listNode5;
		
		Thread.sleep(200000);
		
		printListFromTailToHead(listNode0);
		
	}
	
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		
		ArrayList<Integer> list = new ArrayList<>();
		if(listNode == null) return list;
		if(listNode.next == null) {
			list.add(listNode.val);
			return list;
		}
		ListNode fir = new ListNode(0);
		fir.next = null;
		ListNode node;
		while (listNode != null) {
			node = listNode;
			node = node.next;
			listNode.next = fir.next;
			fir.next = listNode;
			
			listNode = node;
		}
		
		while (fir.next != null) {
			fir = fir.next;
			list.add(fir.val);
			System.out.println(fir.val);
		}
		return list;
	}

	public static class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}
}
