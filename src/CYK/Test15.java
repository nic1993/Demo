package CYK;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test15 {

	static String[] helper = { "0", "0123456789", "0235689", "369",
			"0456789", "05689", "69", "0789", "089", "9" };
	static int[][] tran = {{1,0},{0,1}};
	static int nums[][] ={{1,2,3},{4,5,6},{7,8,9},{-1,0,-1}};
	static int vis[][]={{0,0,0},{0,0,0},{0,0,0},{0,0,0}};
	static int WIDTH = 3;
	static int HEIGHT = 2;
	public static void main(String[] args) {
		Test15 test15 = new Test15();
		test15.getMaxNum(590);
	}
	public void getMaxNum(int num){
		int temp = num;
		Stack<Integer> stack = new Stack<Integer>();
		int fir;
		while (temp != 0) {
			fir = temp % 10;
			stack.add(fir);
			temp /= 10;
		}
		//≈–∂œ «∑Ò¥Ê‘⁄
		int i = 0;
		int j = 0;
		List<Object> list = new ArrayList<Object>();
		boolean isExist = true;
		while(stack.size() != 0){
			fir = stack.pop();
			judge(fir,i,j,list);
			if(((boolean)list.get(0)) == false){
				isExist = false;
				break;
			}
			i = (int) list.get(1);
			j = (int) list.get(2);
			System.out.println("i: " + i);
			System.out.println("j: " + j);
			list.clear();
		}
		
	}
	
	public void judge(int num,int i,int j,List<Object> list){
		if(nums[i][j] == num) {
			System.out.println("num: " + num);
			list.clear();
			list.add(true);
			list.add(i);
			list.add(j);
			return;
		}
			for(int m = 0;m < 2;m++){
				int tx = i+tran[m][0];
				int ty = j+tran[m][1];
				if(tx <= WIDTH && ty <= HEIGHT && vis[tx][ty] == 0){
					vis[tx][ty] = 1;
					judge(num, i+tran[m][0], j+tran[m][1], list);
					vis[tx][ty] = 0;
				}
			}
		list.add(false);
	}
	
	public void getMax(int num){
		Stack<Integer> stack = new Stack<>();
		int temp = num;
		int fir;
		while (temp != 0) {
			fir = temp % 10;
			stack.add(fir);
			temp /= 10;
		}
		int length = stack.size();
		int[] exchangeNum = new int[length];
		for(int i = 0;i < length;i++){
			exchangeNum[i] = stack.pop();
		}
		boolean flag = true;
		int loc = 0;
		for(int i = 1;i < length;i++){
			String str = helper[exchangeNum[i - 1]];
			String next = String.valueOf(exchangeNum[i]);
			if(!str.contains(next)){
				flag = false;
				loc = i;
			    break;
			}
		}
		boolean isChanged = false;
		int changeNum;
		if(flag == false){
			while (isChanged != true && loc != -1) {
				int number = exchangeNum[loc];
				int needChangeNum = exchangeNum[loc - 1];
				char[] chs = helper[needChangeNum].toCharArray();
				for(int i = chs.length-1;i >= 0;i--){
					int find = Integer.valueOf(String.valueOf(chs[i]));
					if(find < number){
						isChanged = true;
						changeNum = find;
						break;
					}
				}
				loc--;
			}
			if(loc == -1){
				int first = exchangeNum[0] - 1;
				char[] chs = helper[first].toCharArray();
				int find = Integer.valueOf(String.valueOf(chs[chs.length - 1]));
			}
		}
	}
}
