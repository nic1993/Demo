package пёуп2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class test32 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		
		String[] strs = str.split(" ");
		
		for(int i = strs.length - 1;i >= 0;i--) {
			if(i == 0) {
				System.out.print(strs[i]);
			}else {
				System.out.print(strs[i] + " ");
			}
			
		}
		
		
	} 
}
