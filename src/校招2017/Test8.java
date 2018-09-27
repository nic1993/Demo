package 校招2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test8 {

	static List<ArrayList<Integer>> lists = new ArrayList<>();
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		ArrayList<Integer> arrays = new ArrayList<>();
		
		
		for(int i = 0;i < n;i++) {
			arrays.add(scanner.nextInt());
		}

		Integer[] A = arrays.toArray(new Integer[n]);
		
//		subsets(A);
		
		ArrayList<Integer> sonList = new ArrayList<>();
		getNum(arrays,sonList,0);
		
		System.out.println(lists.size());
	}
	
	private static int find(int[] nums, int index, long sum, long multi) {
		int count = 0;
		for(int i = index;i < nums.length;i++) {
			sum += nums[i];
			multi *= nums[i];
			
			if(sum > multi) {
				count += 1 + find(nums, index+1, sum, multi);
			}else if (nums[i] == 1) {
				count += find(nums, index+1, sum, multi);
			}else {
				break;
			}
			sum -= nums[i];
			multi /= nums[i];
			
			while (i < nums.length - 1 && nums[i] == nums[i+1]) {
				i++;
			}
		}
		return count;
		
		
	}
	
	public static void getNum(ArrayList<Integer> list,ArrayList<Integer> sonList,int start) {
		if(sonList == null) return;
		
		for(int i = start;i < list.size();i++) {
			sonList.add(list.get(i));
			for(int j = 0;j < sonList.size();j++) {
				System.out.print(sonList.get(j)+" ");
			}
			System.out.println();
			if(!isContains(sonList, lists)) {
				ArrayList<Integer> copyOfList = (ArrayList<Integer>) sonList.clone();
				if(IsNeedRemove(copyOfList)) {
					lists.add(copyOfList);
				}
				
			}
			getNum(list,sonList,i+1);
			sonList.remove(sonList.size() - 1);
		}
	}
	
	public static boolean IsNeedRemove(ArrayList<Integer> list) {
		int sum = 0;
		int count = 1;
		for(Integer num : list) {
			sum += num;
			count *= num;
		}
		if(sum > count) return true;
		return false;
	}
	
	public static boolean isContains(ArrayList<Integer> list,List<ArrayList<Integer>> lists) {
		for(ArrayList<Integer> temp : lists) {
			if(temp.size() != list.size()) continue;
			else {
				if(temp.containsAll(list)) return true;
			}
		}
		return false;
	}
	
	 public static ArrayList<ArrayList<Integer>> subsets(Integer[] nums) {
	        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	        ArrayList<Integer> item = new ArrayList<Integer>();
	        if(nums.length == 0 || nums == null)
	            return res;
	        Arrays.sort(nums); //排序
	        dfs(nums, 0, item, res);  //递归调用
	        res.add(new ArrayList<Integer>());  //最后加上一个空集
	        return res;
	    }
	    public static void dfs(Integer[] nums, int start, ArrayList<Integer>item, ArrayList<ArrayList<Integer>>res){
	    	
	    	for(int i = 0;i < item.size();i++) {
				System.out.print(item.get(i)+" ");
			}
			System.out.println();
	    	
	        for(int i = start; i < nums.length; i++){
	            item.add(nums[i]);
	            //item是以整数为元素的动态数组，而res是以数组为元素的数组，在这一步，当item增加完元素后，item所有元素构成一个完整的子串，再由res纳入
	            res.add(new ArrayList<Integer>(item));
	            dfs(nums, i + 1, item, res);
	            item.remove(item.size() - 1);
	        }
	    }
	    
	    
}
