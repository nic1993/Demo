package ��ָOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * ��ʵ��һ����������֮���δ�ӡ������������һ�а��մ����ҵ�˳���ӡ���ڶ��㰴�մ��������˳���ӡ�������а��մ����ҵ�˳���ӡ���������Դ����ơ�
 * @author supercomputer
 *
 */
public class Test37 {

	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		//����
        int layer = 0;
        //������
        Stack<TreeNode> s1 = new Stack<>();
        s1.push(pRoot);
        //ż����
        Stack<TreeNode> s2 = new Stack<>();
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        while (!s1.empty() || !s2.empty()) {
			if(layer % 2 == 0) {
				ArrayList<Integer> temp = new ArrayList<>();
				while (!s1.empty()) {
					TreeNode node = s1.pop();
					if(node != null) {
						temp.add(node.val);
						s2.push(node.left);
						s2.push(node.right);
					}
				}
				if(!temp.isEmpty()) {
					layer++;
					list.add(temp);
				}
			}else {
				ArrayList<Integer> temp = new ArrayList<>();
				while (!s2.empty()) {
					TreeNode node = s2.pop();
					if(node != null) {
						temp.add(node.val);
						s1.push(node.right);
						s1.push(node.left);
					}
				}
				if(!temp.isEmpty()) {
					layer++;
					list.add(temp);
				}
			}
		}	
        return list;
    }
	
	ArrayList<ArrayList<Integer> > Print1(TreeNode pRoot) {

        Queue<TreeNode> s1 = new LinkedList<>();
        s1.add(pRoot);
      
        Queue<TreeNode> s2 = new LinkedList<>();
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        while (!s1.isEmpty() || !s2.isEmpty()) {
			if(!s1.isEmpty()) {
				ArrayList<Integer> temp = new ArrayList<>();
				while (!s1.isEmpty()) {
					TreeNode node = s1.poll();
					if(node != null) {
						temp.add(node.val);
						s2.add(node.left);
						s2.add(node.right);
					}
				}
				if(!temp.isEmpty()) {
					list.add(temp);
				}
			}else {
				ArrayList<Integer> temp = new ArrayList<>();
				while (!s2.isEmpty()) {
					TreeNode node = s2.poll();
					if(node != null) {
						temp.add(node.val);
						s1.add(node.left);
						s1.add(node.right);
					}
				}
				if(!temp.isEmpty()) {
					list.add(temp);
				}
			}
		}	
        return list;
    }
}
