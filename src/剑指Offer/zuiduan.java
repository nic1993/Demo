package ��ָOffer;


import java.util.List;
import java.util.Scanner;
 
//���Ѱ��ʱ������
public class zuiduan {
 
	private int shortIndex=0;    
	private int visit[];    //��������
 
	public int[] sstf(int data[],int begin){
		int nearest=99999;  //�����ֵ������
		visit=new int[data.length];
		for(int j=0;j<data.length;j++){
			for(int i=0;i<data.length;i++){
				if(data[i]!=-1){
					if(Math.abs(nearest-begin)>Math.abs(data[i]-begin)){
						nearest=data[i];
						shortIndex=i;
					}
				}
			}
			visit[j]=nearest;
			data[shortIndex]=-1;
			begin=nearest;
			nearest=99999;
		}
		return visit;
	}
    public void print(int visit[],int begin){
    	for(int i=0;i<visit.length;i++){
    		System.out.print(visit[i]+"     ");
    	}
    	int length=0;
    	for(int i=0;i<visit.length-1;i++){
    		length+=Math.abs(visit[i]-visit[i+1]);
    	}
    	length+=Math.abs(begin-visit[0]);
    	System.out.println("ƽ��Ѱ������Ϊ"+length/visit.length);
    }
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("�������������");
		int num=scanner.nextInt();
		System.out.println("�������������У��ո����");
		int data[]=new int[num];
		for(int i=0;i<num;i++){
			data[i]=scanner.nextInt();
		}
        zuiduan sstf=new zuiduan();
        System.out.println("��������ʼͷλ��");
        int begin=scanner.nextInt();
        sstf.print(sstf.sstf(data,begin),begin);
	}
//98 183 37 122 14 124 65 67
}