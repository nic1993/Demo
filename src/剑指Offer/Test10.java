package 剑指Offer;

import 剑指Offer.Test9.ListNode;
/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * @author supercomputer
 *
 */
public class Test10 {
	public static void main(String[] args) {
		ListNode listNode0 = new ListNode(0);
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		ListNode listNode4 = new ListNode(4);
		ListNode listNode5 = new ListNode(5);
		
		listNode0.next = listNode2;
		listNode2.next = listNode4;		
		
		listNode1.next = listNode3;
		listNode3.next = listNode5;
		
		ListNode node = Merge(listNode0, listNode1);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

    public static ListNode Merge(ListNode list1,ListNode list2) {
           if(list1 == null) return list2;
           if(list2 == null) return list1;
           
           ListNode head = new ListNode(0);
           ListNode node0 = head;
           ListNode node1 = list1;
           ListNode node2 = list2;
           while (node1 != null && node2 != null) {
			   if(node1.val < node2.val) {
				   node0.next = node1;
				   node0 = node0.next;
				   node1 = node1.next;
			   }else {
				   node0.next = node2;
				   node0 = node0.next;
				   
				   node2 = node2.next;
			   }
		   }
           
           while (node1 != null) {
        	   node0.next = node1;
			   node0 = node0.next;
			   
			   node1 = node1.next;
		   }
           
           while (node2 != null) {
        	   node0.next = node2;
			   node0 = node0.next;
			   
			   node2 = node2.next;
		   }
           
           return head.next;
    }
    
    public static class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
    }
}
