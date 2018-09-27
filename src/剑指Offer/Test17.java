package ½£Ö¸Offer;

import java.util.ArrayList;

public class Test17 {

	    static ArrayList<ArrayList<Integer>> list;
	    static ArrayList<Integer> addList;
	    static int sum = 0;
	    
	    public static void main(String[] args) {
			TreeNode root = new TreeNode(10);
			root.right = new TreeNode(12);
			
			TreeNode root1 = new TreeNode(5);
			root.left = root1;
			
			root1.left = new TreeNode(4);
			root1.right = new TreeNode(7);
			
			FindPath(root, 15);
		}
	
	    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
	    	list = new ArrayList<>();
	    	addList = new ArrayList<>();
	    	sum = 0;
	    	
	    	if(root == null) return list;
	    	
	    	sum += root.val;
	    	addList.add(root.val);
	    	
	    	bfs(root, target);
	    	return list;
	    }
	    
	    public static void bfs(TreeNode root,int target) {
	    	if(root.left == null && root.right == null && sum == target) {
	    		ArrayList<Integer> saveList = new ArrayList<>();
	    		for(int t : addList) {
	    			saveList.add(t);
	    		}
	        	list.add(saveList);
	        }else {
	        	if(root.left != null) {
	        		sum += root.left.val;
	        		addList.add(root.left.val);
	        		bfs(root.left, target);
	        		
	        		sum -= root.left.val;
	        		addList.remove(addList.size() - 1);
	        	}
	        	
	        	if(root.right != null) {
	        		sum += root.right.val;
	        		addList.add(root.right.val);
	        		bfs(root.right, target);
	        		
	        		sum -= root.right.val;
	        		addList.remove(addList.size() - 1);
	        	}
			}
	    }
	    
	   
}


 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}
