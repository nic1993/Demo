package cn.test;

public class test2 {

	
	 public static void main(String[] args) {
	        try {
	            MyThread14 thread = new MyThread14();
	            thread.start();
	            Thread.sleep(1000); //此方法代表 让当前线程休眠 1 秒，即表示使 main线程休眠 1秒
	            thread.interrupt();
	           
	            System.out.println("是否终止2？ =" + Thread.interrupted());
	            System.out.println("终止线性");
	        } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        System.out.println("----------end-----------");
	    }	
}
class MyThread14 extends Thread {
    public void run() {
    	 System.out.println("是否终止1？ =" + Thread.interrupted());
        for (int i = 0; i < 500000; i++) {
//            System.out.println("i = " + i);
        	
        }
  }
}