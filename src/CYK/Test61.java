package CYK;
/*
 * ����һ���������飬������Ԫ��Ϊ������ͬ���������뷵��������С��k������˳����ԭ������Ԫ��˳��һ�¡�
����һ����������A�����Ĵ�Сn��ͬʱ����k���뷵��������С��k������
 */
public class Test61 {

	 public int[] findKthNumbers(int[] A, int n, int k) {
	        // write code here
		 int[] heap = new int[k];
		 
		 for(int i = 0;i < k;i++) {
			 insertHeap(heap, A[i], i);
		 }
		 
		 for(int i = k;i < n;i++) {
			 if(A[i] < heap[0]) {
				 heap[0] = A[i];
				 HeapAdjust(heap, 0, k);
			 }
		 }
		 return heap;
	 }
	 
	 public static void insertHeap(int[] heap,int value,int index) {
		 heap[index] = value;
		 while (index != 0) {
			int parent = index - 1 / 2;
			if(heap[parent] < heap[index]) {
				swap(heap, parent, index);
				index = parent;
			}
		}
	 }
	 
	 public static void HeapAdjust(int[] heap,int index,int heapsize) {
		 int left = index * 2 + 1;
		 int right = index * 2 + 2;
		 while (left < heapsize) {
			if(heap[left] > heap[right] && heap[left] > heap[index]) {
				swap(heap, index, left);
				index = left;
				left = index * 2 + 1;
				right = index * 2 + 2;
			}else if (heap[right] > heap[left] && heap[right] > heap[index]) {
				swap(heap, index, right);
				index = right;
				left = index * 2 + 1;
				right = index * 2 + 2;
			}else {
				break;
			}
		}
	 }
	 
	 
	 public static void swap(int[] heap,int parent,int index) {
		 int tmp = heap[index];
	        heap[index] = heap[parent];
	        heap[parent] = tmp;
	 }
}
