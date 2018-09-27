package CYK;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Test35 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String string = input.nextLine();
		}
	}
	
	private static int hafuman(String string) {
		char[] chs = string.toCharArray();
		Map<Character, Integer> hash = new HashMap<>();
		for(int i = 0;i < chs.length;i++) {
			if(hash.get(chs[i]) == null) hash.put(chs[i], 1);
			else {
				hash.put(chs[i], hash.get(chs[i]) + 1);
			}
		}
		Queue<TreeNode> queue = new PriorityQueue<>(hash.size(),new Comparator<TreeNode>() {

			@Override
			public int compare(TreeNode o1, TreeNode o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.weight,o2.weight);
			}
		});
		
		for(Character key : hash.keySet()) {
			queue.offer(new TreeNode(hash.get(key),key));
		}
		
		//构造哈夫曼树
		while (queue.size() > 1) {
			TreeNode left = queue.poll();
			TreeNode right = queue.poll();
			
			TreeNode father = new TreeNode(left.weight + right.weight);
			
			father.left = left;
			father.right = right;
			
			queue.offer(father);
		}
		
		
		return 0;
	}
	static class TreeNode {
		int weight;
		Character ch;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int weight) {
			// TODO Auto-generated constructor stub
			this.weight = weight;
		}
		
		public TreeNode(int weight,Character ch) {
			// TODO Auto-generated constructor stub
			this.weight = weight;
			this.ch = ch;
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}

		public Character getCh() {
			return ch;
		}

		public void setCh(Character ch) {
			this.ch = ch;
		}

		public TreeNode getLeft() {
			return left;
		}

		public void setLeft(TreeNode left) {
			this.left = left;
		}

		public TreeNode getRight() {
			return right;
		}

		public void setRight(TreeNode right) {
			this.right = right;
		}
		
		
		
	}
}
