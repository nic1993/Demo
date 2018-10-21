package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Le39 {
	public static void main(String[] args) {
		Le39 le39 = new Le39();
		
		int[] candidates = {2,3,6,7};
		le39.combinationSum(candidates, 7);
	}
	

	
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	ArrayList<Integer> list = new ArrayList<>();
    	List<List<Integer>> reslut = new ArrayList<>();
    	Arrays.sort(candidates);
    	int curSum = 0;
    	dfs(candidates, curSum,target,0,reslut, list);
    	
    	return reslut;
    }
    
    
    public void dfs(int[] candidates,int curSum,int target,int start,List<List<Integer>> reslut,ArrayList<Integer> list){
    	if(curSum == target){
    		reslut.add(new ArrayList<>(list));
    		return;
    	}
    	if(curSum > target) return;
    	
    	for(int i = start;i < candidates.length;i++){
    		 
    		list.add(candidates[i]);
    		
    		curSum += candidates[i];

    		dfs(candidates, curSum,target, i + 1,reslut,list);
    		
    		curSum -= candidates[i];
    		
    		list.remove(list.size() - 1);
    		while (i + 1 < candidates.length && candidates[i] == candidates[i + 1]) {
				i++;
			}
    		
    	}
    }
    
    
}
