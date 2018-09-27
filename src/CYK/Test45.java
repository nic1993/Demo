package CYK;
/*
 * �ڵ����������n����ɫ�����ף����׷������֣�����ÿ����ɫ�����������׸�����һ����ͬ��A��������Ҫ���ţ�������Ҫȥ������ѡ���ס����ǻ谵�ĵƹ������޷��ֱ����׵���ɫ��ֻ�ֱܷ�������֡�
 * �����������һЩ���ף�Ȼ��ѡ��һ˫��ɫ��ͬ�����������ס����ڵ������ǣ�������Ҫ�ö���ֻ����(���ּ�����)�����ܱ�֤һ����ѡ��һ˫��ɫ��ͬ�����ס�
 * ������ɫ����n(1��n��13),ͬʱ������������Ϊn������left,right,�ֱ����ÿ����ɫ���������׵����������ݱ�֤���ҵ�����������������26����һ����������һ�ֺϷ�����
 */
public class Test45 {

	public int findMinimum(int n, int[] left, int[] right) {
        // write code here
		int sum = 0;
		int leftSum = 0,leftMin = 27;
		int rightSum = 0,rightMin = 27;
		for(int i = 0;i < n;i++) {
			if(left[i] * right[i] == 0) sum += right[i] + left[i];
			else {
				leftSum += left[i];
				rightSum += right[i];
				leftMin = Math.min(leftMin, left[i]);
				rightMin = Math.min(rightMin, right[i]);
			}
		}
		
		return sum + Math.min(leftSum - leftMin + 1, rightSum - rightMin + 1) + 1;
		
    }
}
