package 网易2018;

import java.util.Scanner;

/**
 * n，总时间大小，k可以叫醒一次后清醒的时间 
   然后输入两个 0，1序列，长度大小为n， 
第一个代表一节课的清醒序列， 
第二个代表一节课的每个时刻的学习成就率。 
 * @author supercomputer
 *
 */
public class Test1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n,k;
		
		n=in.nextInt();
		k=in.nextInt();
		
		int[] a=new int[n];
		int[] t=new int[n];
		
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			t[i]=in.nextInt();
		}
		
		long max,result,sum,temp;
		sum=0;
		temp=0;
		
		
		//从0到K时刻的效率
		for(int i=0;i<k;i++){
			temp+=a[i];
		}
		
		for(int i=k;i<n;i++){
			if(t[i]==1){
				sum+=a[i];
			}
		}
		
		max=sum+temp;
		
		result=max;
		
		//逐次像后移动，即从i-k到k时刻 判断
		for(int i=k;i<n;i++){
			if(t[i-k]==0){
				result-=a[i-k];
			}
			if(t[i]==0){
				result+=a[i];
			}
			if(max<result){
				max=result;
			}
		}
		
		System.out.println(max);
	}

}