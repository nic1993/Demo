package CYK;
/*
 * Spring Outing
 */
public class Test16 {

	int n,k,kk;
	public void PD(int a[][],int mk){
		int vote=0,i,j;
		for(i = 0;i < n;i++){
			if(a[i][mk] < a[i][kk]){  //���ȼ��ȵ�ǰѡ��ĵص�� ��ѡ��ͶƱ
				vote++;
			}
		}
		if(vote > n/2){
			kk = mk;
		}
	}
	public void getOuting(int n,int m,int a[][]){
		kk = 0;
		for(int i = n;i > 0;i++){
			PD(a, i);
		}
	}
}
