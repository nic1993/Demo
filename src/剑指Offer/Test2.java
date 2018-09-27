package ��ָOffer;

/**
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö����������������ǰ���������������Ľ���ж������ظ������֡�
 * ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�
 * @author supercomputer
 *
 */
public class Test2 {

   public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	   TreeNode root=getTreeNode(pre,0,pre.length-1,in,0,in.length-1);
       return root;
   }
   public TreeNode getTreeNode(int[] pre,int preStart,int preEnd,int [] in,int inStart,int inEnd) {
	   if(preStart > preEnd || inStart > inEnd) {
		   return null;
	   }
	   TreeNode root = new TreeNode(pre[preStart]);
	   
	   for(int i = inStart;i <= inEnd;i++) {
		   if(in[i] == pre[preStart]) {
			   root.left = getTreeNode(pre, preStart + 1, preStart + i - inStart, in, inStart, i-1);
               root.right = getTreeNode(pre, i + 1 + preStart - inStart, preEnd, in, i+1, inEnd);
               break;
		   }
	   }
	   
	   return root;
   }
   
    public static class TreeNode {
	       int val;
	       TreeNode left;
	       TreeNode right;
	       TreeNode(int x) { val = x; }
	    }
}
