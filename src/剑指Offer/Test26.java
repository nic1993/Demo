package ��ָOffer;

import ��ָOffer.Test11.TreeNode;

/**
 * ����һ�ö����������������ȡ��Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
 * @author supercomputer
 *
 */
public class Test26 {

	boolean isBalanced = true;
    public int TreeDepth(TreeNode root) {
         if(root == null) {
        	 return 0;
         }
         else {
			int left = TreeDepth(root.left) + 1;
			int right = TreeDepth(root.right) + 1;
			if(Math.abs(left - right) > 1) isBalanced = false;
			return left > right? left : right;
		}
    }
    
    public boolean IsBalanced_Solution(TreeNode root) {
        TreeDepth(root);
        return isBalanced;
    }
}
