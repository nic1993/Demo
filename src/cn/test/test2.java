package cn.test;

public class test2 {

	
	 public static void main(String[] args) {
	        try {
	            MyThread14 thread = new MyThread14();
	            thread.start();
	            Thread.sleep(1000); //�˷������� �õ�ǰ�߳����� 1 �룬����ʾʹ main�߳����� 1��
	            thread.interrupt();
	           
	            System.out.println("�Ƿ���ֹ2�� =" + Thread.interrupted());
	            System.out.println("��ֹ����");
	        } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        System.out.println("----------end-----------");
	    }	
}
class MyThread14 extends Thread {
    public void run() {
    	 System.out.println("�Ƿ���ֹ1�� =" + Thread.interrupted());
        for (int i = 0; i < 500000; i++) {
//            System.out.println("i = " + i);
        	
        }
  }
}