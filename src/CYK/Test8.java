package CYK;

import java.util.Stack;


public class Test8 {

	public void T(TreeNode root){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while (stack.size() != 0) {
			TreeNode curr = stack.pop();
			if(curr.right != null){
                pushAllTheLeft(stack, curr.right);
            }
		}
	}
	
	private void pushAllTheLeft(Stack<TreeNode> s,TreeNode root){
        s.push(root);
        while(root.left!=null){
            root = root.left;
            s.push(root);
        }
    }
}
 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }
  
 
 