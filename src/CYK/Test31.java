package CYK;

public class Test31 {

	public void dfs(int[][] nums) {
		
		for(int i = 0;i < 9;i++) {
			for(int j = 0;j < 9;j++) {
				if(nums[i][j] == 0) {
					for(int m = 1;m<=9;m++) {
						if(judge(nums, i, j, m)) {
							nums[i][j] = m;
							dfs(nums);
						}
						
					}
				}
			}
		}
	}
	
	private boolean judge(int[][] nums,int i,int j,int m) {
		for(int n = 0;n < 9;n++) {
			if(nums[n][j] == m && n != i) return false;
			
			if(nums[i][n] == m && n != j) return false;
		}
		
		//ÅÐ¶Ï·¶Î§ÄÚÊÇ·ñÂú×ãÌõ¼þ
		if(i > 0 && i < 8) {
			if(j > 0 && j < 8) {
				
			}else if (j == 0) {
				
			}else if (j == 8) {
				
			}
		}else if (i == 0) {
			
		}else if (i == 8) {
			
		}

		
		return true;
	}
	
}
