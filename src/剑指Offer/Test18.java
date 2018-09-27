package ½£Ö¸Offer;

public class Test18 {
	public static void main(String[] args) {
		RandomListNode root = new RandomListNode(1);
		RandomListNode node = new RandomListNode(2);
		RandomListNode node1 = new RandomListNode(3);
		RandomListNode node2 = new RandomListNode(4);
		RandomListNode node3 = new RandomListNode(5);
		
		root.next = node;
		node.next = node1;
		node1.next = node2;
		node2.next = node3;
		
		root.random = node1;
		node.random = node3;
		node2.random = node;
		
		Test18 test18 = new Test18();
		test18.Clone(root);
	}
	

	public RandomListNode Clone(RandomListNode pHead)
    {
		if(pHead == null) return null;
		RandomListNode clonepHead = new RandomListNode(pHead.label);
		CloneNext(pHead, clonepHead);
		CloneRandom(clonepHead,pHead,clonepHead);
		return clonepHead;
    }
	
	
	public void CloneNext(RandomListNode pHead,RandomListNode cloneNextpHead) {
		if(pHead.next != null)
		{
			RandomListNode nextNode = new RandomListNode(pHead.next.label);
			cloneNextpHead.next = nextNode;
			CloneNext(pHead.next, nextNode);
		}else {
			cloneNextpHead.next = null;
		}

	}
	
	public void CloneRandom(RandomListNode cloneHead,RandomListNode pHead,RandomListNode cloneRandompHead) {
		if(pHead.random != null)
		{
			int label = pHead.random.label;
			RandomListNode node = cloneHead;
			while (node.label != label) {
				node = node.next;
			}
			cloneRandompHead.random = node;
			CloneRandom(cloneHead,pHead.next, cloneRandompHead.next);
		}else {
			cloneRandompHead.random = null;
			if(pHead.next != null) {
				CloneRandom(cloneHead,pHead.next, cloneRandompHead.next);
			}
		}

	}
}
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
